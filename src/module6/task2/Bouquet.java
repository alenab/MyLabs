package module6.task2;

public class Bouquet {
    public Flower[] flowers; //почему переменные публичные? хорошая практика - инкапсуляция.
    public int flowersQuantity;

    public Bouquet(int bouquetSize) {
        if (bouquetSize < 1) { // на самом деле размер может равняться 0, это не отрицательное число.
            throw new NegativeArraySizeException("Bouquet should contain at least one flower!");
        }
        if (bouquetSize % 2 == 0) {
            throw new IllegalStateException("Bouquet for a present should contain odd number of flowers!");
        }
        flowers = new Flower[bouquetSize];
        flowersQuantity = 0;// какой-то неиспользуемый атрибут
    }

}
