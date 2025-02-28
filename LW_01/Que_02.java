package Q_02;
import javax.swing. *;
import java.util.Scanner;

public class Que_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName;
        System.out.print("Enter your first name: ");
        firstName = scanner.next();
        String lastName;
        System.out.print("Enter your last name: ");
        lastName = scanner.next();
        scanner.close();

        String fullName = firstName + " " + lastName;

        JFrame frame;
        frame = new JFrame(fullName);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}

