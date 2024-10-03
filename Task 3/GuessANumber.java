import java.util.Random;
import java.util.Scanner;  

public class GuessANumber {
    
    private static int rnd_number;

	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
	System.out.println( "Can you guess what it is?...");
        makeAGuess();
    }


    private static void makeAGuess(){

        //Scanner object created
	Scanner scanner = new Scanner(System.in);   

        //If-condition that checks if the input is a "Double"
       if (scanner.hasNextDouble()) {
        double guess = scanner.nextDouble();

        //If-statement that cheks if guess = random number
            if (guess == rnd_number){
                System.out.println();
                System.out.println("Good job");
            }
        
        //Else if statement that checks if guess is smaller than random number
        else if (guess < rnd_number){
            System.out.println("Your guess is too low");
            makeAGuess();

        }
        //Else if statement that checks if guess is bigger than random number
        else if (guess > rnd_number){
            System.out.println("Your guess is too high");
            makeAGuess();
        }
    }   //Else statement that tells the user to re-enter input
        else {
            System.out.println("Please enter a whole number");
            makeAGuess();

        }
        }
       }
    
