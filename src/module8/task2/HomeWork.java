package module8.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HomeWork {
    public static void main(String[] args) {

        List<Bouquet> bouquetList = new ArrayList<>();
        bouquetList.add(new Bouquet("For Girlfriend"));
        Bouquet bouquet = new Bouquet("For Mother");
        bouquet.addFlower(new Aster());
        bouquet.addFlower(new Rose());
        bouquet.addFlower(new Aster());
        bouquetList.add(bouquet);
        bouquetList.add(new Bouquet("For Birthday"));
        bouquetList.add(new Bouquet("For Boss"));

        bouquetList.sort(Comparator.naturalOrder());
        bouquetList
                .stream()
                .forEach(System.out::println);
    }
}