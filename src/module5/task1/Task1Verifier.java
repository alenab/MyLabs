package module5.task1;

public class Task1Verifier {

    public static void main(String[] args) {
        int[] testArray = new int[]{-5, 2, 7, 4, 11, 22, 15, 2, 1, 1, 1};
        int min = MinMaxValue.getMin(testArray);
        System.out.println("Minimum value from array: " + min);
        int max = MinMaxValue.getMax(testArray);
        System.out.println("Maximum value from array: " + max);
    }

}
