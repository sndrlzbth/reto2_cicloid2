/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sandra
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class controller {
    private static final String API_URL = "https://serpapi.com/search.json?engine=google_scholar&q=biology&api_key=ac25f3777dcbb95b797951693a6112cffb73539a7875940057bc0d01c6842723";
    private view views;
    
    public controller(view views){
        this.views = views;
    }
    
    public void fetchAndDisplayResults() {
        try {
            // Conexión a la API
            URL url = new URL(API_URL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            conn.disconnect();

            // Parseo de la respuesta JSON
            JSONObject jsonResponse = new JSONObject(content.toString());
            JSONArray organicResults = jsonResponse.getJSONArray("organic_results");

            // Crear lista de resultados
            List<model> results = new ArrayList<>();
            for (int i = 0; i < organicResults.length(); i++) {
                JSONObject result = organicResults.getJSONObject(i);
                String title = result.getString("title");
                String author = result.getJSONObject("publication_info").getString("summary");
                String link = result.getString("link");

                results.add(new model(title, author, link));
            }

            // Mostrar resultados
            views.displayResults(results);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
