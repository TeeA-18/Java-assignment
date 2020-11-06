
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Contestant contestant1 = new Contestant("nguyen van a", "he0010", "nguyenvana@fpt", "0123456789", 1);
//        Contestant contestant2 = new Contestant("nguyen van b", "he0011", "nguyenvanb@fpt", "0223456789", 2);
//        Contestant contestant3 = new Contestant("nguyen thi c", "he0012", "nguyenthic@fpt", "0323456789", 3);
//        Contestant contestant4 = new Contestant("nguyen thi d", "he0013", "nguyenthid@fpt", "0423456789", 4);
//        
//        List<Contestant> list = new ArrayList<>();
//        list.add(contestant1);
//        list.add(contestant2);
//        list.add(contestant3);
//        list.add(contestant4);
//        
//        writeToFile(list);
        
        ArrayList<Contestant> contestants = new ArrayList<>();
        ArrayList<String> passwords = new ArrayList<>();
        
        ManagementContestant.readContestantFromFile(contestants, passwords);
        //boolean statusLogin = Management.loginSystem(contestants, passwords);
        int i = ManagementContestant.loginSystem(contestants, passwords);
        ManagementContestant.updateProfileContestant(contestants, passwords, i);
        //System.out.println(i);
//        if (statusLogin) {
//            System.out.println("Welcome to system.");
//        }
//        System.out.println(contestants);
//        for (int i = 0; i < contestants.size(); i++) {
//            System.out.println(contestants.get(i).getEmail());
//            System.out.println(passwords.get(i));
//        }
    }
    
    
}
