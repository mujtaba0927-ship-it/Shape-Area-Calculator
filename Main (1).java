import java.util.Scanner;

public class Main {

    static void circleArea() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = input.nextDouble();

        double result = 3.14 * r * r;

        System.out.println("Area of Circle = " + result);
    }

    static void rectangleArea() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = input.nextInt();

        System.out.print("Enter width: ");
        int width = input.nextInt();

        int result = length * width;

        System.out.println("Area of Rectangle = " + result);
    }

    public static void main(String[] args) {

        circleArea();
        rectangleArea();
    }
}
