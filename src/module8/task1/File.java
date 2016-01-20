package module8.task1;

public class File implements Comparable<File> {

    private String fileName;

    public File(String name) {
        fileName = name;
    }

    public String getName() {
        return fileName;
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public int compareTo(File o) {
        return getName().compareTo(o.getName());
    }
}
