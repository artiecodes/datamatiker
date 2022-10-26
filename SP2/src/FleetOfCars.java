import java.util.ArrayList;

public class FleetOfCars {
    ArrayList<ACar> fleet = new ArrayList<>();
    ACar electricCar = new ElectricCar("AY69368", "Tesla", "Model 3", 4, 75, 600, 54.6);
    AFuelCar gasolineCar = new GasolineCar("AR47486","Skoda","Fabia", 4, "gasoline", 20.8);
    AFuelCar dieselCar = new DieselCar("CD71332", "Audi","A4",4, true, "diesel", 29.07);


    public void addCar(ACar car) {
        fleet.add(car);
    }

    public String getTotalRegistrationFeeForFleet() {
        int regCost = electricCar.getRegistrationFee() + gasolineCar.getRegistrationFee() + dieselCar.getRegistrationFee();
        return "The total cost of the vehicles registration is: " + regCost;
    }

    @Override
    public String toString() {
        String cars = "";
        for (ACar carList : fleet) {
            cars += carList.toString() + "\n";
        }
        return cars;
    }
}
