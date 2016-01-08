package module6.task1;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class Directory {
    private File[] files = new File[10];
    private int currentIndex = 0;

    public void addFile(File file) throws FullDirectoryException {
        try {
            files[currentIndex++] = file;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new FullDirectoryException("Not sufficient storage!");
        }
    }

    /*
      * Ётот метод удал€ет файл по "»мени файла" и после этого сдвигает массив, заполн€€ пустое место (удаленный файл), и
      * соответвственно последний элемент обнул€еетс€.
      * Ёлементы удал€ютс€ по одному за раз, поэтому метод корректно обработает последовательное удаление любого кол-ва
      * файлов содержащщихс€ в массиве.
     **/
    public void removeFile(String fileName) throws FileNotFoundException {
        boolean fileNotFound = true;
        for (int i = 0; i < files.length; i++) {
            if (files[i] != null) {
                if (files[i].getFileName().equals(fileName)) {
                    File[] tempArray = Arrays.copyOfRange(this.files, i + 1, files.length);
                    System.arraycopy(tempArray, 0, files, i, tempArray.length);
                    files[files.length - 1] = null;
                    fileNotFound = false;
                    break;
                }
            }
        }
        if (fileNotFound) {
            throw new FileNotFoundException("There is no file '" + fileName + "' in the directory");
        }
    }

    public File[] getFiles() {
        return files.clone();
    }
}
