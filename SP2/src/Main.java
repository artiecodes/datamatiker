public class Main {
    public static void main(String[] args) {
        //ACar electricCar = new ElectricCar("AY69368", "Tesla", "Model 3", 4, 75, 600, 54.6);
        //AFuelCar gasolineCar = new GasolineCar("AR47486","Skoda","Fabia", 4, "gasoline", 20.8);
        //AFuelCar dieselCar = new DieselCar("CD71332", "Audi","A4",4, true, "diesel", 29.07);

        FleetOfCars fleet = new FleetOfCars();

        fleet.addCar(fleet.electricCar);
        fleet.addCar(fleet.gasolineCar);
        fleet.addCar(fleet.dieselCar);

        System.out.println(fleet.toString());
        System.out.println(fleet.getTotalRegistrationFeeForFleet());



    }
}