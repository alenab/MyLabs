package module4.task1;

import module4.task1.figures.Circle;
import module4.task1.figures.Figure;
import module4.task1.figures.Rectangle;
import module4.task1.figures.Triangle;

public class Main {

    public static void main(String[] args) {
        Figure[] figures = new Figure[]{
                new Rectangle(2, 5),
                new Triangle(2, 3, 4),
                new Circle(4)
        };
        // Anti-pattern: Code duplication
        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].getClass().getSimpleName() + " Square " + figures[i].getSquare());
        }
    }
}