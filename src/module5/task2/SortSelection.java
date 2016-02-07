package module5.task2;

public class SortSelection {

    public static int[] getSort(int[] intArray) {

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
        return intArray;
        //Нет смысла делать возвращение отсортированного массива. После вызова этого метода ты можешь дальше пользоваться
        //тем же самым массивом - он будет уже отсортированным. Пример - посмотри, как реализован стандартный джавовский
        //метод Arrays.sort(). Так что, как у тебя было - void - это было нормально.
    }
}


