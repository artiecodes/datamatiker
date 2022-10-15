package Task1;

public class Driver {
    private String name;
    private int age;

    public Driver (int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return " is driven by "+name;
    }

}
