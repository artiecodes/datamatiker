// 2.A
/*
class A { // Kan ikke få det her til at køre ordentligt, siger java.lang.exception eller sådan noget?

    public static boolean happy = true;

    public static void main(String[] args) {
        if (iAmHappy()) {
            System.out.println("I clap my hands");
        } else {
            System.out.println("I don't clap my hands");
        }
    }

    public static boolean iAmHappy() {
        if (iAmHappy()) {
            return true;
        } else {
            return false;
        }
    }
}

// 2.B

class B {

    public static void main(String[] args) {
        
        sumOfIntegers();
        upperCase();

    }

    public static void sumOfIntegers() {

        int a = 11;
        int b = 19;
        System.out.println("The sum of a and b is: " + Integer.sum(a,b));
    }

// 2.C

class C {


public static void main(String[] args) {

    String upperCase = "this should be upper case";
    String upperCase1 = upperCase.toUpperCase();
    System.out.println(upperCase1);
}
}
*/

// 2.D

class D {

    public static void main(String[] args) {

        firstUpperCase();

    }

    public static String firstUpperCase() {

        String string = "The first letter is";
        var checker = string.charAt(0);

        if (Character.isUpperCase(checker)) {
            System.out.println(string + " capitalized.");
        } else {
            System.out.println(string +  " not capitalized.");
        }
        return string;
    }
}