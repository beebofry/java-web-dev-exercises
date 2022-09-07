package exercises.technology.main;

public class Program {
    public static void main(String[] args) {
        Computer newComputer = new Computer("Apple", 2020, 256);
        Laptop newLaptop = new Laptop("Macbook", 2021, 256, true);
        SmartPhone newSmartPhone = new SmartPhone("Iphone", 2021, 32, 6.1);

        System.out.println(newComputer.getTechId());
        System.out.println(newLaptop.getTechId());
        System.out.println(newSmartPhone.getTechId());
    }

}
