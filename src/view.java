/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sandra
 */
import java.util.List;

public class view {
    public void displayResults(List<model> results){
        for(model result: results){
            System.out.println("Title:" + result.getTitle());
            System.out.println("Author:" + result.getAuthor());
            System.out.println("Link: "+ result.getLink());
            System.out.println("-------------------------");
        }
    }
}
