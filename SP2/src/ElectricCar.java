public class ElectricCar extends ACar {
    int batteryCapacity;
    int maxRange;
    double kmPrLitre;

    public ElectricCar (String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange, double kmPrLitre) {
        super (registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
        this.kmPrLitre = kmPrLitre;
    }


    public int getBatteryCapacityKWh() {
        return batteryCapacity;
    }

    public int getMaxRangeKm() {
        return  maxRange;
    }

    public double getWhPrKm() {
        return (batteryCapacity/91.25) * 100;
        // (167/91,25) = 1.83
        // 100/1.83 = 54.6
    }

    @Override
    public int getRegistrationFee() {
        if (kmPrLitre >= 20) {
            return 330;
        } else if (kmPrLitre >= 15 && kmPrLitre < 20) {
            return 1050;
        } else if (kmPrLitre >= 10 && kmPrLitre < 15) {
            return 2340;
        } else if (kmPrLitre >= 5 && kmPrLitre < 10) {
            return 5500;
        } else if (kmPrLitre < 5) {
            return 10470;
        }
        throw new RuntimeException("This message should never appear");
    }

    @Override
    public String toString() {
        return "The car with registration " + registrationNumber + " is a " + make + " " + model + " with " +
                numberOfDoors + " doors. It has a battery capacity of " + batteryCapacity + " and a max range of " + maxRange + "km" +
                " and a relative consumption of " + kmPrLitre + " kilometers per litre.";
    }
}
