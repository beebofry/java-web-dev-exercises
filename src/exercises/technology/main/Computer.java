package exercises.technology.main;

public class Computer extends AbstractEntity{
    private String brand;

    private int year;
    private double storage;

    public Computer(String brand, int year, double storage) {
        this.brand = brand;
        this.year = year;
        this.storage = storage;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public double getStorage() {
        return storage;
    }


}
