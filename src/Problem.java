/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Problem {
    private String problemID;
    private String problemName;
    private String date;
    private String shortDescrip;
    private String link;
    private double mark;
    private String category;
    private String author;

    public Problem() {
    }

    public Problem(String problemID, String problemName, String date, String shortDescrip, String link, double mark, String category, String author) {
        this.problemID = problemID;
        this.problemName = problemName;
        this.date = date;
        this.shortDescrip = shortDescrip;
        this.link = link;
        this.mark = mark;
        this.category = category;
        this.author = author;
    }
    
    
    
    
    
}
