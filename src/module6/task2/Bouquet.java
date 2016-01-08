package module6.task2;

public class Bouquet {
    private Flower[] flowers;

    public Bouquet(int bouquetSize) {
        if (bouquetSize < 1 || bouquetSize % 2 == 0) {
            throw new IllegalStateException("Bouquet for a present should contain positive odd number of flowers!");
        }
        flowers = new Flower[bouquetSize];
    }
}
