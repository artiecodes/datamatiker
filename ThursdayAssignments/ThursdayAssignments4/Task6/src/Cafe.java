import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

    ArrayList<String> coffeeMenu = new ArrayList<>();

    public void loadMenuData() throws FileNotFoundException {
            File file = new File("coffees.txt");
        try {
            Scanner scan = new Scanner(file);

            while (scan.hasNextLine()) {
                coffeeMenu.add(scan.nextLine());
            }
        }
        catch (FileNotFoundException nfx) {
            System.out.println("Unable to locate file. Check path and filename.");
            System.out.println(nfx.getMessage());
        }


    }

    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }
}
