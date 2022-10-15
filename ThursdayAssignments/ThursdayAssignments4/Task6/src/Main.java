import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Cafe cafe = new Cafe();

        cafe.loadMenuData();

        for (String s : cafe.getCoffeeMenu()) {
            System.out.println(s);
        }
    }
}