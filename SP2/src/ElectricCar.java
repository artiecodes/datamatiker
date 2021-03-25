public class ElectricCar extends Car {
    int batteryCapacityKWh;
    float maxKm;
    float whPrKm;

    public ElectricCar(String licensePlate, String make, String model, int year, int numberOfDoors,
                       int batteryCapacityKWh, float maxKm, float whPrKm) {
        super(licensePlate, make, model, year, numberOfDoors);
        this.batteryCapacityKWh = batteryCapacityKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    @Override
    public String toString() {
        return "ElectricCar" +
                "licensePlate='" + licensePlate + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", numberOfDoors=" + numberOfDoors +
                ", batteryCapacityKWh=" + batteryCapacityKWh +
                ", maxKm=" + maxKm +
                ", whPrKm=" + whPrKm;
    }

    public int getBatteryCapacityKWh() {
        return batteryCapacityKWh;
    }

    public void setBatteryCapacityKWh(int batteryCapacityKWh) {
        this.batteryCapacityKWh = batteryCapacityKWh;
    }

    public float getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public float getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }
}
