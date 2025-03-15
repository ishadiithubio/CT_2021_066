package Q_03;

import java.util.Scanner;

public class Que_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();


        double fahrenheit = (1.8 * celsius) + 32;


        System.out.printf("Temperature in Fahrenheit: %.2f°F%n", fahrenheit);

      
        scanner.close();
    }
}
