package Q_11;
import java.util.Scanner;

public class Que_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = scanner.next();
        System.out.print("Enter your middle name: ");
        String middleName = scanner.next();
        System.out.print("Enter your last name: ");
        String lastName = scanner.next();
        scanner.close();

        System.out.println(lastName + ", " + firstName + " " + middleName.charAt(0) + ".");
    }
}

