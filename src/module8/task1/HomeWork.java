package module8.task1;

import java.util.SortedSet;
import java.util.TreeSet;

public class HomeWork {

    public static void main(String[] args) {

        SortedSet<Directory> directorySortedSet = new TreeSet<>();
        Directory folder1 = new Directory("folder2");
        folder1.addFile(new ImageFile("picture.png"));
        folder1.addFile(new AudioFile("audio.mp3"));
        directorySortedSet.add(folder1);
        Directory folder2 = new Directory("folder1");
        folder2.addFile(new AudioFile("song.mp3"));
        folder2.addFile(new TextFile("document.txt"));
        folder2.addFile(new TextFile("document2.txt"));
        directorySortedSet.add(folder2);

        for (Directory d : directorySortedSet) {
            System.out.println(d);
        }
    }
}



