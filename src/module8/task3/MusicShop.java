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

    public void printSortedInstruments() {//и все-таки такие методы лучше выносить в мейн. принт в консоль - это временное решение
        //и его можно заменить в любое время на принт, например, в файл. Классы не должны от этого страдать. В классах лучше
        //реализовать методы, которые могут дать клиенту информацию, которую клиент уже может распечатать, сохранить и т.д.
        // (это в методе мейн уже)
        musicalInstrumentsList
                .stream()
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }

}

