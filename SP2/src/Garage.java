import java.util.ArrayList;

public class Garage
{
    ArrayList<Car> garage = new ArrayList<Car>();
    String owner;

    Garage (String owner)
    {
        this.owner = owner;
    }

    public String getOwner()
    {
        return owner;
    }

    public void addCar(Car bil)
    {
        garage.add(bil);
    }

    @Override
    public String toString()
    {
        System.out.println("Here are the current cars in "+ getOwner() + "s garage: ");

        for (int i = 0; i < garage.size(); i++)
        {
            System.out.println(garage.get(i).make + " | " + garage.get(i).model + " | " + garage.get(i).year);
        }
        return "";
    }

    public void calculateGarageGreenTax()
    {
        double amount = 0;

        for (int i = 0; i < garage.size(); i++)
        {
            amount += garage.get(i).calculateGreenTax
                    (garage.get(i));
        }

        System.out.println("Total green tax amount for cars : " + amount + " DKK");
    }
}