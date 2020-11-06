
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
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
public class ManagementContestant {
    
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
    
    public static void updateProfileContestant(ArrayList<Contestant> list, ArrayList<String> passwords, int i) {
        System.out.println("WELCOME TO UPDATE CONTESTANT'S PROFILE");
        System.out.println("1. Change contestant's profile ");
        System.out.println("2. Change contestant's password ");
        System.out.println("Please enter your choice: ");
        int choice = Validate.checkInputLimit(1, 2);

        switch (choice) {
            case 1:
                System.out.println("Enter contestant name: ");
                String name = Validate.checkInputString();
                System.out.println("Enter contestant email: ");
                String email = Validate.checkInputString();
                System.out.println("Enter contestant phone: ");
                String phone = Validate.checkInputPhone();

                list.get(i).setContestantName(name);
                list.get(i).setEmail(email);
                list.get(i).setMobilePhone(phone);
                break;
            case 2:
                while (true) {
                    System.out.println("Enter your old pass word");
                    String oldPassword = Validate.checkInputString();
                    if (oldPassword.equals(passwords.get(i))) {
                        break;
                    }
                    System.err.println("Your old password is incorrect");
                    System.err.println("Enter again: ");
                }
                System.out.println("Enter new password: ");
                String newPassword = Validate.checkInputString();
                while (true) {
                    System.out.println("Confirm new password: ");
                    String newPassword1 = Validate.checkInputString();
                    if (newPassword.equals(newPassword1)) {
                        passwords.set(i, newPassword);
                        break;
                    }
                    System.err.println("Your new password isn't match confirm password");
                }
        }
        writeContestantToFile(list, passwords);

    }
    
    public static void writeContestantToFile(ArrayList<Contestant> list, ArrayList<String> passwords){
        try{
            FileWriter fw = new FileWriter("contestant.dat");
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < list.size(); i++) {               
                bw.write(list.get(i).toString() + ";" + passwords.get(i));
                bw.newLine();
            }         
            bw.close();
            fw.close();
        }catch(Exception a){
           
        }
    }
    
    public static ArrayList<Contestant> readContestantFromFile(ArrayList<Contestant> contestants, ArrayList<String> passwords){
        //List<Contestant> list = new ArrayList<>();
        try{
            FileReader fr = new FileReader("contestant.dat");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while(true){
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String contestant[] = line.split(";");
                
                String name = contestant[0];
                String id = contestant[1];
                String email = contestant[2];
                String mobilePhone = contestant[3];
                int rank = Integer.parseInt(contestant[4]);
                String password = contestant[5];
                
                contestants.add(new Contestant(name, id, email, mobilePhone, rank));
                passwords.add(password);
            }
        }catch(Exception e){   
        }
        return contestants;
    }
}
