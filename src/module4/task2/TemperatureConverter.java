package module4.task2;

public class TemperatureConverter {

    public static double fromCelsiusToFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

    public static double fromFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        double celsius = 10;
        double fahrenheit = fromCelsiusToFahrenheit(celsius);
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Celsius: " + fromFahrenheitToCelsius(fahrenheit));
    }
}
