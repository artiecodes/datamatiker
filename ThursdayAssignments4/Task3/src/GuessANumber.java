import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class GuessANumber {
    private static Random random = new Random();
    private static int rnd_number = random.nextInt(100) + 1;
    private static int tries = 0;
    private static int guess;

    public static void makeAGuess() {
        Scanner input = new Scanner(System.in);

        try {
            while (input.hasNextLine()) {
                guess = input.nextInt();
                tries++;
                if (guess == rnd_number) {
                    System.out.println("Congratulations, you've guessed the number!");
                    System.out.println("It took you " + tries + " guesses.");
                    break;
                } else if (guess < rnd_number) {
                    System.out.println("Your guess is too low.");
                } else if (guess > rnd_number) {
                    System.out.println("Your guess is too high.");
                }
            }

        } catch (InputMismatchException imx) {
            System.out.println("Please enter a number between 0-100 (inclusive)");

        }
    }

    public int getRnd_number() {
        return rnd_number;
    }
}