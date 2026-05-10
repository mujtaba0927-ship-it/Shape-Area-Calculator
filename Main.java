import java.util.Scanner;

abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    void area() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = input.nextDouble();

        double result = 3.14 * r * r;
        System.out.println("Area of Circle = " + result);
    }
}

class Rectangle extends Shape {
    void area() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = input.nextInt();

        System.out.print("Enter width: ");
        int width = input.nextInt();

        int result = length * width;
        System.out.println("Area of Rectangle = " + result);
    }
}

public class Main {
    public static void main(String[] args) {

        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.area();
        s2.area();
    }
}
