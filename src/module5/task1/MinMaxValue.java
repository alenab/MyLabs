package module5.task1;

public class MinMaxValue {

    public static int getMax(int[] intArray) {
        return getNumber(intArray, true);
    }

    private static int getNumber(int[] intArray, boolean isMax) {
        int value = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (isMax && value < intArray[i]) {
                value = intArray[i];
            }
        }
        return value;
    }

    public static int getMin(int[] intArray) {
        return getNumber(intArray, false);
    }
}
