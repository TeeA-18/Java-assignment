
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Management {
    
    public static int loginSystem(ArrayList<Contestant> list, ArrayList<String> passwords){
        System.out.println("WELCOME TO CONTEST MANAGEMENT SYSTEM.");
        System.out.println("Please login first to use the system.");
        while(true){
            System.out.println("Enter your email: ");
            String email = Validate.checkInputString();
            System.out.println("Enter your password");
            String password = Validate.checkInputString();
            
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getEmail().equalsIgnoreCase(email)
                        && passwords.get(i).equalsIgnoreCase(password)) {
                    System.err.println("Login successfully");
                    return i;
                }                                  
            }
            System.out.println("Your email or password is incorrect");
            System.out.println("Please enter again: ");
        }
    }
    
    public static void updateProfileContestant(ArrayList<Contestant> list, ArrayList<String> passwords,int i){
        System.out.println("WELCOME TO UPDATE CONTESTANT'S PROFILE");
        System.out.println("1. Change contestant's profile ");
        System.out.println("2. Change contestant's password ");
        System.out.println("Please enter your choice: ");
        int choice = Validate.checkInputLimit(1, 2);
        
        switch(choice){
            case 1:
                System.out.println("Enter contestant name: ");
                String name = Validate.checkInputString();
                System.out.println("Enter contestant ID: ");
                String ID = Validate.checkInputString();
                System.out.println("Enter contestant email: ");
                String email = Validate.checkInputString();
                System.out.println("Enter contestant phone: ");
                String phone = Validate.checkInputPhone();
                
                
        }
        
    }
}
