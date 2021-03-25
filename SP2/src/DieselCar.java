public class DieselCar extends Car {
    boolean hasParticleFilter;
    float consumption;

    public DieselCar(String licensePlate, String make, String model, int year, int numberOfDoors,
                     boolean hasParticleFilter, float consumption) {
        super(licensePlate, make, model, year, numberOfDoors);
        this.hasParticleFilter = hasParticleFilter;
        this.consumption = consumption;
    }

    @Override
    public String toString() {
        return "DieselCar" +
                "licensePlate='" + licensePlate + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", numberOfDoors=" + numberOfDoors +
                ", hasParticleFilter=" + hasParticleFilter +
                ", consumption=" + consumption;
    }

    public boolean isHasParticleFilter() {
        return hasParticleFilter;
    }

    public void setHasParticleFilter(boolean hasParticleFilter) {
        this.hasParticleFilter = hasParticleFilter;
    }

    public float getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }
}
