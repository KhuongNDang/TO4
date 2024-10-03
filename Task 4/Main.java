import java.util.ArrayList;


public class Main{
	

public static void main(String[] args) {

	//An ArrayList<String> called actions
	ArrayList<String> actions = new ArrayList<>();

	//String values added to the actions list
	actions.add("1) Start game");
	actions.add("2) Resume game");
	actions.add("3) Pause game");
	actions.add("4) End game");

	//Instantiate GameMenu
	GameMenu gameMenu = new GameMenu(actions);

	//Get user choice and store it in variable "userChoice"
	String userChoice = gameMenu.getAction();

	//Convert the user choice to an int and store it in variable "actionNumber"
	int actionNumber = Integer.parseInt(userChoice);

	//Calling the doAction() method to perform corresponding action
	doAction(actionNumber);

}
	
	//Method to perform the action based on the user input
	public static void doAction(int userChoice) {
        switch (userChoice) {
            case 1:
                System.out.println("Starting the game now");
                break;
            case 2:
                System.out.println("Fetching previously saved game data");
                break;
            case 3:
                System.out.println("Game paused");
                break;
            case 4:
                System.out.println("Ending game");
        }
    }
}
