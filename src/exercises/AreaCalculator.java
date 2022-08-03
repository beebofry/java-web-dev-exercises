package exercises;
import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Length of rectangle: ");
        Integer length = input.nextInt();
        input = new Scanner(System.in);
        System.out.println("Width of rectangle: ");
        Integer width = input.nextInt();
        System.out.println("The area of the rectangle is " + length*width + " square units.");
    }
}
