public abstract class AFuelCar extends ACar {

    String fuelType;

    public AFuelCar (String registrationNumber, String make, String model, int numberOfDoors, String fuelType, double kmPrLitre) {
        super (registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public double getKMPrLitre() {
        return kmPrLitre;
    }

    @Override
    public String toString() {
        return super.toString() + "KM/Litre: " + kmPrLitre + ", Fueltype: " + fuelType + ". ";
    }
}
