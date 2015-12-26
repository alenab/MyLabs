package module5.task2;

public class Task2Verifier {
    public static void main(String[] args) {
        int testArray[] = new int[]{3, 2, -1, 5, 10, -5};
        SortSelection.getSort(testArray);
        for (int i = 0; i < testArray.length; i++) {
            int item = testArray[i]; //временная переменная item излишняя. А еще идея подсказывает даже, что лучше использовать
            //цикл for-each
            System.out.println(item);
        }
    }

}
