package module4.task1.figures;

public class Circle extends Figure {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    double getSquare() {
        return Math.PI * radius * radius;
    } //Делай методы публичными. По своей сущности, такие методы должны быть доступны всем.
}
