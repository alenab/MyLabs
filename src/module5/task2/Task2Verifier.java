package module5.task2;

public class Task2Verifier {
    public static void main(String[] args) {
        int testArray[] = new int[]{3, 2, -1, 5, 10, -5};
        SortSelection.getSort(testArray);
        for (int item:testArray){
            System.out.println(item);
        }
    }

}
