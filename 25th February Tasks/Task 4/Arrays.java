import java.util.Arrays;

class Main {
// 4.A
public static void main (String [] args) {

    String [] words = {"Nul", "En", "To", "Tre"};
    int [] numbers = {3, 2, 1, 4};
    boolean [] trueFalse = new boolean[4];

    arrayOfWords(words);
    arrayOfNumbers(numbers);
    arrayOfBoolean(trueFalse);

// 4.B
}
    public static void arrayOfWords(String[] words) {

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
    
// 4.C + 4.D + 4.E
    public static void arrayOfNumbers(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            System.out.println("The sum of the numbers array is " +sum);
        }
        float average = (float)sum/numbers.length;
        System.out.println("The average of the numbers array is " +average);
        Arrays.sort(numbers); // Had to import Array Utilities to sort the array and then list lowest to highest. I could have just listed the array in order.
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void arrayOfBoolean(boolean[] trueFalse) {

        for (int i = 0; i < trueFalse.length; i++) {
            System.out.println(trueFalse[i]);
        }
    }
}