/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sandra
 */
public class model {
    private String title;
    private String author;
    private String link;
    
    public model(String title, String author, String link){
        this.title = title;
        this.author = author;
        this.link = link;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public String getLink(){
        return link;
    }
    
    @Override
    public String toString(){
        return "Title: " + title + "\nAuthor: " + author + "\nLink: " + link;
    }
}
