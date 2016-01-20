package module8.task2;

import java.util.ArrayList;
import java.util.List;

public class Bouquet implements Comparable<Bouquet> {
    private final String name;

    private List<Flower> flowerList = new ArrayList<>();

    public Bouquet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addFlower(Flower flower) {
        flowerList.add(flower);
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "name='" + name + '\'' +
                ", flowerList=" + flowerList +
                '}';
    }

    @Override
    public int compareTo(Bouquet o) {
        return getName().compareTo(o.getName());
    }
}

