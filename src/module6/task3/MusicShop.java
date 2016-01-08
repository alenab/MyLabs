package module6.task3;

public class MusicShop {

    private MusicalInstrument[] musicalInstruments;
    private int currentIndex;

    public MusicShop(int shopShelfSize) {
        if (shopShelfSize < 0) {
            throw new NegativeArraySizeException("Shelf size could not be negative!");
        }
        musicalInstruments = new MusicalInstrument[shopShelfSize];
        currentIndex = 0;
    }

    public void addMusicalInstrument(MusicalInstrument instrument) throws IllegalStateException {
        if (musicalInstruments.length > currentIndex) {
            musicalInstruments[currentIndex] = instrument;
            currentIndex++;
        } else {
            throw new IllegalStateException("There is no space to fit more instruments. Please, create a bigger shop!");
        }
    }
}
