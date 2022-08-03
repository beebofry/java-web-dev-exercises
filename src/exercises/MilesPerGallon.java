package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of miles driven: ");
        Double miles = input.nextDouble();

        input = new Scanner(System.in);
        System.out.println("Enter number of gallons of gas consumed: ");
        Double gas = input.nextDouble();
        System.out.println(miles/gas + " miles per gallon.");
    }
}
