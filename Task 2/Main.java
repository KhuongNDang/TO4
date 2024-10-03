import java.util.Scanner;


public class Main{


public static void main(String[] args){

//Scanner object
Scanner scanner = new Scanner(System.in);

System.out.println("Please type your name");

//Takes the input from the user and assigns it to "name"
String name = scanner.nextLine();
System.out.println();
System.out.println("Hello " + name);
System.out.println();
System.out.println("Please type your age");

//Takes the input from the user and assigns it to "age"
int age = scanner.nextInt();
System.out.println();
System.out.println("You are " + age + " years old");
System.out.println();

//Variable retirment calculates the number of years until retirement
int retirement = (67 - age);
System.out.println("You have " + retirement + " years to retirement");
}	
}
