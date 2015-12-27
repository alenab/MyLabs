package module6.task1;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        Directory dir = new Directory();

        try {
            for (int i = 0; i <= 10; i++) {
                dir.addFile(new ImageFile("picture" + i + ".jpg"));
            }
        } catch (FullDirectoryException e) {
            System.out.println(e.getMessage());
        }

        try {
            dir.removeFile("not_existing_file_name.bmp");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
