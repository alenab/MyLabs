package module4.task1;

import module4.task1.figures.Circle;
import module4.task1.figures.Rectangle;
import module4.task1.figures.SquareCalculator;
import module4.task1.figures.Triangle;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(2, 5);
        double rectangleSquare = SquareCalculator.calculateSquareFor(rectangle);
        System.out.println("Rectangle Square  " + rectangleSquare);

        Triangle triangle = new Triangle(2, 3, 4);
        double triangleSquare = SquareCalculator.calculateSquareFor(triangle);
        System.out.println("Triangle Square  " + triangleSquare);

        Circle circle = new Circle(4);
        double circleSquare = SquareCalculator.calculateSquareFor(circle);
        System.out.println("Circle Square  " + circleSquare);
    }

}
