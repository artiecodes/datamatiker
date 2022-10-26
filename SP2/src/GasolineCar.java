public class GasolineCar extends AFuelCar {

    public GasolineCar (String registrationNumber, String make, String model, int numberOfDoors, String fuelType, double kmPrLitre) {
        super (registrationNumber, make, model, numberOfDoors, fuelType, kmPrLitre);
    }

    @Override
    public int getRegistrationFee() {
        if (kmPrLitre >= 20 && kmPrLitre < 50) {
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
        return "The car with registration " + registrationNumber + " is a " + fuelType + " driven " + make + " " + model + " with " +
                numberOfDoors + " doors.";
    }
}
