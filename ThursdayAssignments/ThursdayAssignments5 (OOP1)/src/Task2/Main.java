package Task2;

import java.util.ArrayList;
public class Main {

    public static Room room;
    public static ArrayList<Room> rooms = new ArrayList<>();

    public static void main(String[] args) {

        Room room1 = new Room(4,10,20);
        Room room2 = new Room(3,5,49);
        Room room3 = new Room(2,259,87);

        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Building building = new Building(rooms,3,2,true);
        countLampsInBuilding(building);
        isNormal(building);

        //TESTER
        /* *********************************
        System.out.println(room1.toString());
        System.out.println(room2.toString());
        System.out.println(room3.toString());
        System.out.println(building.toString());
        System.out.println(countLampsInBuilding(building)); //lamps total
        ************************************/
    }

    public static int countLampsInBuilding (Building building) {
        int numLamps = 0;

        for (int i = 0; i < rooms.size(); i++) {
            numLamps += rooms.get(i).getNumberOfLamps();
        }
        return numLamps;
    }

    public static boolean isNormal (Building building) {
        if (building.getNumberOfFloors() > rooms.size()) {
            System.out.println("This seems like a normal building");
            return true;
        } else {
            System.out.println("This is an odd building");
            return false;
        }
    }
}
