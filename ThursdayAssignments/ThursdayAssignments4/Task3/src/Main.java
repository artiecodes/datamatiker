public class Main {

    static GuessANumber guess = new GuessANumber();

    public static void main(String[] args) {
        // pick a random number
        System.out.println(guess.getRnd_number());
        System.out.println("I'm thinking of a number between 1 and 100 (including both).");
        System.out.println("Can you guess what it is?...");

        GuessANumber.makeAGuess();
    }
}