class Main {

    public static void main(String[] args) {

        emptyString();
        filledString();
        myNameAndAge();

    }

    public static String emptyString() {

        String emptyString = "";
        System.out.println(emptyString);
        return emptyString;

    }

    public static String filledString() {

        String filledString = "I dag er det torsdag";
        System.out.println(filledString);
        return filledString;

    }

    public static String myNameAndAge() { // Forstår ikke hvorfor det her kører 100 gange?

        String name = "Bjarke";
        int age = 25;
        System.out.println("My name is " +name+ ", I am " +age+ " years old.");
        return myNameAndAge();
    }

}