package Task1;

public class Main {

    static Driver driver = new Driver(27,"Bjarke");
    static Car car = new Car("Tesla","Model 3",2022,"Sedan");

    public static void main(String[] args) {

        car.setDriver(driver);

        Car car1 = new Car("BMW","M5",2022,"Coupe");
        car1.setDriver(driver);

        System.out.print(car.toString());
        System.out.println(driver.toString());

        System.out.print(car1.toString());
        System.out.print(driver.toString());
    }
}
