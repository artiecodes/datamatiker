public class DieselCar extends AFuelCar {
    boolean particleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, boolean particleFilter, String fuelType, double kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, fuelType, kmPrLitre);
        this.particleFilter = particleFilter;
    }

    public boolean hasParticleFilter() {
        return particleFilter;
    }

    @Override
    public int getRegistrationFee() {
        int price = 0;
        if (kmPrLitre >= 20 && kmPrLitre <= 50) {
            price = 330 + 130;
        } else if (kmPrLitre >= 15 && kmPrLitre < 20) {
            price = 1050 + 1390;
        } else if (kmPrLitre >= 10 && kmPrLitre < 15) {
            price = 2340 + 1850;
        } else if (kmPrLitre >= 5 && kmPrLitre < 10) {
            price = 5500 + 2770;
        } else if (kmPrLitre < 5) {
            price = 10470 + 15260;
        }
        if (particleFilter) {
            return price;
        } else return price + 1000;
    }

    @Override
    public String toString() {
        return "The car with registration " + registrationNumber + " is a " + fuelType + " driven " + make + " " + model + " with " +
                numberOfDoors + " doors. It is " + particleFilter + " that it has a particle filter.";
    }
}
