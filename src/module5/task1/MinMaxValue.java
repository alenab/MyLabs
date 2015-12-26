package module5.task1;

public class MinMaxValue {

    public static int getMax(int[] intArray) {
        int max = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (max < intArray[i]) {
                max = intArray[i];
            }
        }
        return max;
    }

    public static int getMin(int[] intArray) {
        int min = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (min > intArray[i]) {
                min = intArray[i];
            }
        }
        return min;
    }
}
