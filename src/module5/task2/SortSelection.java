package module5.task2;

public class SortSelection {

    public static void getSort(int[] intArray) {

        for (int i = 0; i < intArray.length; i++) {
            int min = i;
            for (int k = i + 1; k < intArray.length; k++) {
                if (intArray[min] > intArray[k]) {
                    min = k;
                }
            }
            int tempVariable = intArray[min];
            intArray[min] = intArray[i];
            intArray[i] = tempVariable;

        }
    }
}


