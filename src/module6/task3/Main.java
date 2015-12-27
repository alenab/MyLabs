package module6.task3;

public class Main {

    public static void main(String[] args) {
        MusicShop shop = new MusicShop(1);
        Piano piano = new Piano();
        Trumpet trumpet = new Trumpet();

        try {
            shop.addMusicalInstrument(piano);
            shop.addMusicalInstrument(trumpet);
        } catch (RuntimeException e) {
            System.out.println("[ Exception ]: " + e.getMessage());
        }

        try {
            MusicShop shopInapropriate = new MusicShop(-1);
        } catch (NegativeArraySizeException e) {
            System.out.println(e.getMessage());
        }
    }
}
