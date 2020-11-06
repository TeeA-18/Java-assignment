
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Validate {
    static Scanner scanner = new Scanner(System.in);
    private static final String PHONE_VALID = "^\\d{10}$";
    
    public static int checkInputLimit(int min, int max){
        while(true){
            try{
                int choice = Integer.parseInt(scanner.nextLine().trim());
                if (min > choice || choice > max) {
                    throw new NumberFormatException();
                }
                return choice;
            }catch(NumberFormatException e){
                System.err.println("Your choice must in range [ " + min + "-" + max + " ]");
                System.out.println("Enter again: ");
            }
        }
    }
    
    public static String checkInputString(){
        while(true){
            String result = scanner.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Your input can't be empty.");
                System.out.println("Enter again: ");
            }else{
                return result;
            }
        }
    }
    
    public static int checkInputNumber(){
        while(true){
            try{
                int number = Integer.parseInt(scanner.nextLine().trim());
                if (number < 0) {
                    throw new NumberFormatException() ;
                }
            }catch(NumberFormatException e){
                System.err.println("You must input number > 0");
                System.out.println("Enter again: ");
            }
        }
    }
    
    public static String checkInputPhone(){
        while (true){
            String result = checkInputString();
            if (result.matches(PHONE_VALID)){
                return result;
            }else{
                System.err.println("Phone is number with minimum 10 characters");
                System.out.println("Enter again: ");
            }
        }
    }
    
}
