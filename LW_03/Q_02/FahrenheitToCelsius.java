package Q_02;

import Q_01.Temperature;
import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Temperature temp = new Temperature();
        System.out.print("Enter temperature in Fahrenheit: ");
        double f = scanner.nextDouble();
        temp.setFahrenheit(f);
        System.out.println("Temperature in Celsius: " + temp.toCelsius());
    }
}

