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
import entity.Contestant;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContestantManager {
    private List<Contestant> list = new ArrayList<>();
    private String file;
    private IOFile fileIO;
    public ContestantManager() {
        this.file = "constestants.dat";
        this.fileIO = new IOFile();
        list = fileIO.readFile(file);
        new Contestant().setCnt(list.size());
//       list.add(new Contestant("Tran Tuan Anh", 
//               "anhtthe141110@gmail.com", "0233333333", "123456", 3)); // ID = 0
//       list.add(new Contestant("Tran Duc Manh", 
//               "manhtdhe140824@gmail.com", "0244343433", "1234", 4));
//       list.add(new Contestant("Bui Thanh Tung", 
//               "tungbthe150621@gmail.com", "0123433433", "12345", 3));
//       list.add(new Contestant("Nguyen Minh Khanh", 
//               "khanhnmhe150628@gmail.com", "0533333333", "123", 3));
//       list.add(new Contestant("Tring Ngọc Long", 
//               "longtnhe140627@gmail.com", "0466632233", "12", 3));
//        fileIO.writeFile(file, list);
    }
    public int searchByEmail(String email) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getEmail().equalsIgnoreCase(email)) {
                return i;
            }
        }
        return -1;
    }
    public int login(String email, String password) {
        int i = searchByEmail(email);
        if(i == -1) return -1;
        if(list.get(i).getPassword().equals(password)) 
            return i;
        return -2; // Password incorrect
    }
    public void changeInforInput() {
        int index;
        Scanner sc = new Scanner(System.in);
        while(true) {
            try {
                System.out.print("Change profile information\nEnter ID: ");
                index = Integer.parseInt(sc.nextLine());
                break;
            }
            catch(NumberFormatException e) {
                System.out.println("Please input a vaild number");
            }
        }
        changeInfor(index);
    }
    public void changeInfor(int ID) {
        Contestant c = list.get(ID);
        Scanner sc = new Scanner(System.in);
        loop: while(true) {
            System.out.println("1. Change name");
            System.out.println("2. Change email");
            System.out.println("3. Change phone");
            System.out.println("4. Change password");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");
            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch(NumberFormatException e) {
                System.out.println("Please enter a valid number");
                continue;
            }
            switch(choice) {
                case 1: 
                    while(true) {
                        System.out.print("Enter new name: ");
                        String io = sc.nextLine();
                        if(io.length() == 0) {
                            System.out.println("Please input non-null string");
                            continue;
                        }
                        c.setName(io);
                        break;
                    }
                    break;
                case 2: 
                    while(true) {
                        System.out.print("Enter new email: ");
                        String io = sc.nextLine();
                        if(io.length() == 0) {
                            System.out.println("Please input non-null string");
                            continue;
                        }
                        c.setEmail(io);
                        break;
                    }
                    break;
                case 3: 
                    while(true) {
                        System.out.print("Enter new phone: ");
                        String io = sc.nextLine();
                        if(io.length() == 0) {
                            System.out.println("Please input non-null string");
                            continue;
                        }
                        c.setPhone(io);
                        break;
                    }
                    break;
                case 4: 
                    while(true) {
                        System.out.print("Enter new password: ");
                        String io = sc.nextLine();
                        if(io.length() == 0) {
                            System.out.println("Please input non-null string");
                            continue;
                        }
                        c.setPassword(io);
                        break;
                    }
                    break;
                case 0: break loop;
                default: System.out.println("Please input valid choice");
            }
        }
        fileIO.writeFile(file, list);
        System.out.println("Change information successfully!");
    }

    public List<Contestant> getList() {
        return list;
    }
    
//    public Contestant getByID(int ID) {
//        int pos = searchByID(ID);
//        if(pos == -1) return null;
//        return list.get(pos);
//    }

    public void setList(List<Contestant> list) {
        this.list = list;
    }
    
}

