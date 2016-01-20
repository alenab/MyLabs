package module8.task3;

public class Homework {

    public static void main(String[] args) {

        MusicShop musicShop = new MusicShop("Music instruments fot everybody");
        musicShop.addMusicalInstrument(new Piano());
        musicShop.addMusicalInstrument(new Trumpet());
        musicShop.addMusicalInstrument(new Guitar());

        musicShop.printSortedInstruments();
    }
}
