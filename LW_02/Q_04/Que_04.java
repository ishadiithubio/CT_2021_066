package Q_04;
import java.util.Scanner;

public class Que_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = scanner.nextDouble();

        double calories = weight * 19;

        System.out.printf("Daily calorie requirement: %.2f calories%n", calories);
        scanner.close();
    }
}

