import java.util.Scanner;
import java.util.ArrayList;


public class GameMenu{


//Private instance variable named "actions" with the type ArrayList<String> to the class	
private ArrayList<String>actions;


//Constructor with a parameter of the type ArrayList
public GameMenu(ArrayList<String>actions){
	this.actions = actions;	
}

    // 4.h Method to display the menu
    public void displayMenu() {
        for (String action : actions) {
            System.out.println(action);
        }
    }

    public String getAction(){
        System.out.println("Type a number to choose an action");
        
        displayMenu();

        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();

        return number;

        }
    }

