package Task2;

import java.util.ArrayList;

public class Building {
    final ArrayList<Room> rooms = new ArrayList<>();
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;

    public Building (ArrayList rooms, int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding) {
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isOfficeBuilding() {
        return isOfficeBuilding;
    }

    @Override
    public String toString() {
        return "The building has " + Main.rooms.size() + " rooms with " +
                numberOfBathrooms + " bathrooms and " + numberOfFloors + " floors.";
    }
}
