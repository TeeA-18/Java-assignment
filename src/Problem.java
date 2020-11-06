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

    public String getProblemID() {
        return problemID;
    }

    public void setProblemID(String problemID) {
        this.problemID = problemID;
    }

    public String getProblemName() {
        return problemName;
    }

    public void setProblemName(String problemName) {
        this.problemName = problemName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getShortDescrip() {
        return shortDescrip;
    }

    public void setShortDescrip(String shortDescrip) {
        this.shortDescrip = shortDescrip;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return   problemID + ";" + problemName + ";" + date + ";" + shortDescrip + ";" + link + ";" + mark + ";" + category + ";" + author;
    }
    
    
    
    
    
}
