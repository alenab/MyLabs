package module4.task4;

public class Main {

    public static void main(String[] args) {
        FunctionX3Plus1 functionX3Plus1 = new FunctionX3Plus1(5, 20);
        double result = functionX3Plus1.calculate(10_000);
        System.out.println(result);
    }
}
