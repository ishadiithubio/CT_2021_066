package Q_02;
import java.util.Scanner;

    public class Que_02 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter length in cm: ");
            double cm = scanner.nextDouble();

            double inches = cm / 2.54;
            int feet = (int) (inches / 12);
            inches %= 12;

            System.out.printf("%.2f cm is %d feet %.2f inches%n", cm, feet, inches);
            scanner.close();
        }
    }


