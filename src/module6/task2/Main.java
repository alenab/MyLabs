package module6.task2;

public class Main {

    public static void main(String[] args) {
        try {
            Bouquet bouquet = new Bouquet(-1);
        } catch (NegativeArraySizeException e) {
            System.out.println(e.getMessage());
        }

        try {
            Bouquet bouquet = new Bouquet(4);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        try {
            Bouquet bouquet = new Bouquet(11);
            System.out.println("There was no exception! We are all good!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
