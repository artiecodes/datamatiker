public class Debug {
    public static void main(String[] args) {

        int a = 7;
        int b = 42;
        //minimum(a, b);
        if (a < b) {
            System.out.println(a + " is the smallest!");
        } else {
            System.out.println(a + " is greater than or equal to " + b);
        }
    }
/*
    public static void minimum(int a, int b) {
        if (a < b) {
        int smaller = a;
        System.out.println("a is the smallest.");
      } else(a > b) {
        int smaller = b;
    }
    */
}