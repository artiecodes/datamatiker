package Task3;

import java.util.ArrayList;

public class Main {

    public static ArrayList<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {

        Customer c1 = new Customer("A","Alpha","Alpha");
        Customer c2 = new Customer("B","Bravo","Bravo");
        Customer c3 = new Customer("C","Charlie","Charlie");
        Customer c4 = new Customer("D","Delta","Delta");
        Customer c5 = new Customer("E","Echo","Echo");
        Customer c6 = new Customer("F","Foxtrot","Foxtrot");

        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);
        customers.add(c5);
        customers.add(c6);

        printCustomers();

    }

    public static void printCustomers() {
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i));
        }
    }
}
