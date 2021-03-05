import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.lang.String;

public class Main {
    static Scanner scan;
    private static String[][] text = new String[12][1];

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/data.txt");
        scan = new Scanner(file);
        int i = 0;

        while (scan.hasNextLine()) {
            text[i] = scan.nextLine().split("\\.");

            i++;
        }

        // Print all words with a given variable
        // printWordsStartingWith("Ø");
        // Print all words with a given length
        // printWordsOfLength(3);
        // Print the longest sentence in the data.txt file
        printLongestSentence();
        // Print a part of a word
        printPartOfWord("Ligeledes", 3,9);
        // Print a word if it's a palindrome
        printIfPalindrome("Den laks skal ned");

        // I could not work out how to complete task 1...

    }
    // Task 2
    private static void printLongestSentence() throws FileNotFoundException {

        String[] splitArray;
        File file = new File("src/data.txt");
        scan = new Scanner(file);
        String longestSentence = "";

        int i = 0;
        while(scan.hasNextLine()) {

            splitArray = scan.nextLine().split("\\.");
            System.out.println(splitArray[i].length() + " : " + splitArray[i]);
            if (longestSentence.length() < splitArray[i].length())
            {
                longestSentence = splitArray[i];
            }
        }

        System.out.println("\nThe longest sentence is: " + longestSentence);
    }

    // Task 3
    private static void printPartOfWord(String word, int index, int length) {
        try {
            System.out.println("Printing a part of the word: " + word);
            System.out.println("Here is part of the word: " + word.substring(index, length));
        } catch (StringIndexOutOfBoundsException ex) {
            System.out.println("This is not possible");
        }

    }

    // Task 4 - I couldn't find a function to disregard case sensitivity based off... I tried playing with String.equalsIgnoreCase
    private static void printIfPalindrome(String word) {
        String input = word;
        String backwards = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            backwards = backwards + input.charAt(i);
        }
        if (input.equals(backwards)) {
            System.out.println("The word is a palindrome.");
        } else {
            System.out.println("The word is not a palindrome.");
        }
    }
}
 /*   private static void printWordsOfLength(int l) {
        boolean wordisvalid = true;

        for (int i = 0; i < text.length; i++) {
            for (String s : text[i]) {
                if (s.length() == l) {
                    if (s.contains(",") || s.contains(".")) {
                        wordisvalid = false;
                    }
                     /*for (int j = 0; j < s.length(); j++) {
                         char c = s.charAt(j);
                         if(c == '.' || c == ','){
                             wordisvalid = false;
                         }
                     }
                    if (wordisvalid) {
                        System.out.println(s);
                    }

                }
            }
        }

    }

    private static void printWordsStartingWith(String pattern) {

        for (int i = 0; i < text.length; i++) {
            for (String s : text[i]) {
                if (s.startsWith(pattern) || s.startsWith(pattern.toLowerCase())) {
                    System.out.println(s);
                }
            }

        }

    } */