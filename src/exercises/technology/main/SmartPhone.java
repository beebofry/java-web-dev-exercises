package exercises.technology.main;

public class SmartPhone extends Computer{
    private double version;

    public SmartPhone(String brand, int year, double storage, double version){
        super(brand, year, storage);
        this.version = version;
    }

    public void updateVersion(double newVersion){
        this.version = newVersion;
    }
}
