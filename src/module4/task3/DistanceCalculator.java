package module4.task3;

public class DistanceCalculator {
    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    public static void main(String[] args) {
        double distance = calculateDistance(0, 0, 0, 2);
        System.out.println("Distance " + distance);
    }
}
