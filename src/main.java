/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sandra
 */
public class main {
    public static void main(String [] sargs){
        view views = new view();
        controller controllers = new controller(views);
        
        controllers.fetchAndDisplayResults();
    }
}
