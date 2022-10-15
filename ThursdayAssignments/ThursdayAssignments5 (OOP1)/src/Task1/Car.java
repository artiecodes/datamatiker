package Task1;

public class Car {
    private String make;
    private String model;
    private int year;
    private String bodyStyle;
    private Class Driver;

    public Car (String make, String model, int year, String bodyStyle) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.bodyStyle = bodyStyle;

    }

    public Class getDriver() {
        return Driver;
    }

    public void setDriver(Driver driver) {
        this.Driver = driver.getClass();
    }

    @Override
    public String toString() {
        return "Make: "+ make +" Model: " + model + " (" + year + ") " + "BodyStyle: "+ bodyStyle;
    }
}
