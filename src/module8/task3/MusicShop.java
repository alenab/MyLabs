package module8.task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MusicShop {
    private final String name;
    private final List<MusicalInstrument> musicalInstrumentsList = new ArrayList<>();

    public MusicShop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addMusicalInstrument(MusicalInstrument musicalInstrument) {
        musicalInstrumentsList.add(musicalInstrument);
    }

    public void printSortedInstruments() {
        musicalInstrumentsList
                .stream()
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }

}

