package module8.task3;

public class MusicalInstrument implements Comparable<MusicalInstrument> {

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

    @Override
    public int compareTo(MusicalInstrument o) {
        return getClass().getSimpleName().compareTo(o.getClass().getSimpleName());
    }
}
