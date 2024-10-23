import java.util.Scanner;

abstract class Shape {
    double dimension1, dimension2;

    void inputDimensions() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dimension 1: ");
        dimension1 = scanner.nextDouble();
        System.out.print("Enter dimension 2: ");
        dimension2 = scanner.nextDouble();
    }

    abstract double computeArea();
}

class Triangle extends Shape {
    double computeArea() {
        return 0.5 * dimension1 * dimension2; // 1/2 * base * height
    }
}

class Rectangle extends Shape {
    double computeArea() {
        return dimension1 * dimension2;
    }
}

public class CalculateArea {
    public static void main(String[] args) {
        Shape shape;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1 for Triangle or 2 for Rectangle: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            shape = new Triangle();
        } else {
            shape = new Rectangle();
        }

        shape.inputDimensions();
        System.out.println("The area is: " + shape.computeArea());
    }
}
