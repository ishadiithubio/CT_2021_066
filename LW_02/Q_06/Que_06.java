package Q_06;
import java.util.Scanner;
import java.time.Year;

public class Que_06{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int currentYear = Year.now().getValue();


        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();


        int age = currentYear - birthYear;


        System.out.printf("You were born in %d and will be (are) %d this year.%n", birthYear, age);

        scanner.close();
    }
}

