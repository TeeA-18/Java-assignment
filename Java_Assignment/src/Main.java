import entity.Contest;
import entity.Contestant;
import java.util.Scanner;
import model.ContestManager;
import model.ContestantManager;
import model.ProblemManager;
import model.Validate;


public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContestantManager cManager = new ContestantManager();
        Contestant i = login(cManager);
        int userID = i.getID();
        ProblemManager pManager = new ProblemManager();
        ContestManager ctManager = new ContestManager(i, pManager);
//        ctManager.generateNewContest();
//        ctManager.generateNewContest();
//        ctManager.generateNewContest();
        while(true) {
            System.out.println("WELCOME TO CONTEST MANAGEMENT SYSTEM: ");
            System.out.println("1: Change profile information");
            System.out.println("2. Add new problem");
            System.out.println("3: Update problem");
            System.out.println("4: List of problem");
            System.out.println("5. Generate new contest");
            System.out.println("6. Print contest by ID");
            System.out.println("7. Sort all problems by Category as ascending order");
            System.out.println("8. Exit");
            int choice = Validate.checkInputLimit(1, 8);
            
            switch(choice) {
                case 1: 
                        cManager.changeInfor(userID); break;
                case 2: 
                        System.out.println("Add new question to question bank: ");
                        pManager.addNewProblem();
                        break;
                case 3: 
                        System.out.println("Update problem\nEnter ID: ");
                        pManager.updateByID();
                        break;
                case 4: 
                        pManager.printAll(); 
                        break;
                case 5: 
                        ctManager.generateNewContest();
                        break;
                case 6: 
                        ctManager.print(); 
                        break;
                case 7: 
                        pManager.sort();
                        break;
                case 8: System.out.println("Exit successfully"); return;                
            }
        }
    }
    public static Contestant login(ContestantManager cmanager) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("\n===========\nLogin to system\n===========\n");
            System.out.print("Enter email: ");
            String email = Validate.checkInputString();            
            System.out.print("Enter password: ");
            String pass = sc.nextLine();
            int status = cmanager.login(email, pass);
            if(status == -1) {
                System.out.println("Not found email: " + email);
            }
            else if(status == -2) 
                System.out.println("Incorrect password, check again!");
            else return cmanager.getList().get(status);
        }
    }
    
}
