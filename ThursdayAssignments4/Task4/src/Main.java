// For some reason I couldn't get my switch case to work with my code.
// I think the issue is the return statement in Menu class? Variable in global scope doesn't save value of local choice with return?

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> actions = new ArrayList<>();
        actions.add("1: Start Game");
        actions.add("2: Resume Game");
        actions.add("3: Pause Game");
        actions.add("4: End game");

        Menu menu = new Menu(actions);

        menu.showMenu();
        doAction(menu.choice);
    }

    public static void doAction(int action) {
        switch (action) {
            case 1:
                System.out.println("Starting the game now...");
                break;
            case 2:
                System.out.println("Fetching previously saved game data.");
                break;
            case 3:
                System.out.println("Game paused.");
                break;
            case 4:
                System.out.println("Ending game.");
                break;
        }
    }
}