/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Scanner;

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

        public static double checkInputDouble(){
            while(true){
                try{
                    double number = Double.parseDouble(scanner.nextLine().trim());
                    if (number < 0) {
                        throw new NumberFormatException() ;
                    }else{
                        return number;
                    }
                }catch(NumberFormatException e){
                    System.err.println("You must input number > 0");
                    System.out.println("Enter again: ");
                }
            }
        }

    public static int checkInputInteger(){
        while(true){
            try{
                int number = Integer.parseInt(scanner.nextLine().trim());
                if (number < 0) {
                    throw new NumberFormatException() ;
                }else{
                    return number;
                }
            }catch(NumberFormatException e){
                System.err.println("You must input number > 0");
                System.out.println("Enter again: ");
            }
        }
    }

        public static String checkInputDate() {
            while (true) {               
                String input = checkInputString();

                String regex = "^(([012]?\\d)|(3[01]))\\/((0?\\d)|(1[012]))\\/\\d{4}$";
                if (!input.matches(regex)) {
                    System.out.println("Please input a valid date");
                } else {
                    return input;
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
