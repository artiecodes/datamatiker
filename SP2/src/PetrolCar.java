public class PetrolCar extends Car {
    int octaneNum;
    float consumption;


    PetrolCar(String licensePlate, String make, String model, int year, int numberOfDoors, int octaneNum, float consumption) {
        super(licensePlate, make, model, year, numberOfDoors);
        this.octaneNum = octaneNum;
        this.consumption = consumption;
    }

    @Override
    public String toString() {
        return "PetrolCar" +
                "licensePlate='" + licensePlate + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", numberOfDoors=" + numberOfDoors +
                ", octaneNum=" + octaneNum +
                ", consumption=" + consumption;
    }

    public int getOctaneNum() {
        return octaneNum;
    }

    public void setOctaneNum(int octaneNum) {
        this.octaneNum = octaneNum;
    }

    public float getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }
}
