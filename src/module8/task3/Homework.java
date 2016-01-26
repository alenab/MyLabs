package module8.task3;

import static java.util.Comparator.naturalOrder;

public class Homework {


    public static void main(String[] args) {
        MusicShop musicShop = new MusicShop("Music instruments for everybody");
        musicShop.addMusicalInstrument(new Piano());
        musicShop.addMusicalInstrument(new Trumpet());
        musicShop.addMusicalInstrument(new Guitar());

        printSortedInstruments(musicShop);
    }

    public static void printSortedInstruments(MusicShop musicShop) {
        musicShop.getMusicalInstrumentsList()
                .stream()
                .sorted(naturalOrder())
                .forEach(System.out::println);
    }
}
