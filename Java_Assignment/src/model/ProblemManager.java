/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Lenovo
 */
import entity.Problem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProblemManager {

    private List<Problem> list = new ArrayList<>();
    private String file = "QBs.dat";
    private IOFile io = new IOFile();
    private Scanner sc;

    public ProblemManager() {
        
        list = io.readFile(file);
        new Problem().setCnt(list.size());
        sc = new Scanner(System.in);
        
//        list.add(new Problem("11/11/2020", "Limits",
//                "Show that the equation x^5 −3x = 1 has at least one root between 1 and 2 .", "https://pokrovka11.files.wordpress.com/2012/10/calculus.pdf", 2, 0, "Tuan Anh"));
//        list.add(new Problem("11/11/2020", "Geometry",
//                "A point has no dimention. True or False?", "https://www.mathsisfun.com/geometry/", 2, 1, "Tuan Anh"));
//        list.add(new Problem("11/11/2020", "Greedy",
//                "Print first N terms of series (0.25, 0.5, 0.75, ...) in fraction representation", "https://www.geeksforgeeks.org/greedy-algorithm-egyptian-fraction/", 2, 2, "Tuan Anh"));
//        list.add(new Problem("11/11/2020", "Dynamic Programming",
//                "What is a dynamic programming, how can it be described? ", "https://www.topcoder.com/", 2, 3, "Tuan Anh"));
//        list.add(new Problem("11/11/2020", "Graph",
//                "What is the largest number on the vertical scale?", "https://www.mathgoodies.com/lessons/graphs/practice_unit11", 2, 4, "Tuan Anh"));
//        
//        io.writeFile(file, list);
    }

    private void add(Problem pb) {
        list.add(pb);
        io.writeFile(file, list);
    }

    private Problem inputProblem() {
//        System.out.println("Add new problem to QB:");
        Problem pb = new Problem();

        System.out.print("Enter date: ");
        String date = Validate.checkInputDate();
        pb.setDateCreated(date);

        System.out.print("Enter problem name: ");
        String name = Validate.checkInputString();
        pb.setName(name);

        System.out.print("Enter short description: ");
        String des = Validate.checkInputString();
        pb.setDescription(des);

        System.out.print("Enter link to full description: ");
        String link = sc.nextLine();
        pb.setLink(link);

        System.out.print("Enter mark weight: ");
        double weight = Validate.checkInputDouble();
        pb.setMark_weight(weight);

        System.out.print("Enter type (0: toan giai tich, 1: toan hinh, 2: tham lam, 3: quy hoach dong, 4: do thi): ");
        int type = Validate.checkInputLimit(0, 4);
        pb.setType(type);

        System.out.print("Enter author: ");
        String author = Validate.checkInputString();
        pb.setAuthor(author);

        return pb;
    }

    public void addNewProblem() {
        add(inputProblem());
    }

    private int searchByID(int ID) {
        for (int i = 0; i < list.size(); i++) {
            Problem get = list.get(i);
            if(get.getID() == ID) return i;
        }
        return -1;
    }

    public void updateByID() {
        
        int index = Validate.checkInputInteger();
        
        int pos = searchByID(index);
        
        if (pos == -1) {
            System.out.println("Not found ID: " + index);
            return;
        }
        
        Problem pb = inputProblem();
        pb.setCnt(list.size());
        pb.setID(list.get(pos).getID());
        list.set(pos, pb);
        io.writeFile(file, list);
    }

    public void printAll() {
        for (Problem problem : list) {
            System.out.println(problem);
        }
    }

    public List<Problem> getList() {
        return list;
    }

//    public void setList(List<Problem> list) {
//        this.list = list;
//    }

    public void sort() {
        Collections.sort(list, (o1, o2) -> o2.getType() - o1.getType());
    }
}
