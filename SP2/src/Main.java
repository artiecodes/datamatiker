public class Main {

    public static void main(String[] args)
    {
        Garage srGarage = new Garage("Rolling Royce");

        Car FastBoi = new PetrolCar("AR47486", "BMW","M5",
                2008,3, 95, 13.5f);
        Car SilentZoomer = new ElectricCar("BE68353", "Tesla", "Model 3",
                2021, 5, 76, 423.25f, 250);
        Car EcoFriendly = new DieselCar("YY69994", "Audi", "A3",
                2021, 5, true, 23.53f);

        srGarage.addCar(FastBoi);
        srGarage.addCar(SilentZoomer);
        srGarage.addCar(EcoFriendly);

        System.out.println(srGarage.toString());

        srGarage.calculateGarageGreenTax();
    }
}