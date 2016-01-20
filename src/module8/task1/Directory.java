package module8.task1;

import java.util.SortedSet;
import java.util.TreeSet;

public class Directory implements Comparable<Directory> {

    private final String name;
    // Files are always sorted by names and duplicated files are not allowed
    private final SortedSet<File> files = new TreeSet<>();

    public Directory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addFile(File file) {
        files.add(file);
    }

    @Override
    public String toString() {
        return "Directory{" +
                "name='" + name + '\'' +
                ", files=" + files +
                '}';
    }

    @Override
    public int compareTo(Directory o) {
        return getName().compareTo(o.getName());
    }
}