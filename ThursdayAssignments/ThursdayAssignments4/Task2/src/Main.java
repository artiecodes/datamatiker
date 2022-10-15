import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        readInput();

    }

    public static void readInput() {
        // Scanner reads next line and asks questions
        System.out.println("Please type your name:");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        // Capitalize first letter of the name regardless of input capitalization
        s = s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
        System.out.println("Hello "+s+"!");
        System.out.println("Please type your age:");
        // Parse from the string s to an int
        int userAge = Integer.parseInt(input.nextLine());
        System.out.println("You are " + userAge + " years old.");
        int retirementAge = 67;
        int result = retirementAge-userAge;
        System.out.println("The age of retirement is 67 years old. " +
                "You may retire in "+result+ " years.");
    }
}