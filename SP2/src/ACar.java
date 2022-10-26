public abstract class ACar implements ICar {
    String registrationNumber;
    String make;
    String model;
    int numberOfDoors;
    double kmPrLitre;

    public ACar (String registrationNumber, String make, String model, int numberOfDoors, double kmPrLitre) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.kmPrLitre = kmPrLitre;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public String toString() {
        return "The car with registration " + registrationNumber + " is a " + make + " " + model + " with " +
                numberOfDoors + " doors. ";
    }
}
