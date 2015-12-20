package module4.task1.figures;

public class Triangle extends Figure {

    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int a, int b, int c) {
        sideA = a;
        sideB = b;
        sideC = c;
    }

    @Override
    double getSquare() {
        int perimeter = sideA + sideB + sideC;
        return Math.sqrt(perimeter * (perimeter - sideA) * (perimeter - sideB) * (perimeter - sideC));
    }
}
