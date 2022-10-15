import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    int choice;
    private ArrayList<String> options = new ArrayList<>();

    public Menu(ArrayList options) {
        this.options = options;
    }

    public String showMenu() {
        for (String o : options) {
            System.out.println(o);
        }
        System.out.println("Please enter a number to choose an option:");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        System.out.println("You have chosen - " + options.get(Integer.parseInt(choice)-1));
        Integer.parseInt(choice);
        return choice;
    }
}