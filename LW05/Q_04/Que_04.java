package Q_04;
import java.util.Scanner;

public class Que_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int row = input.nextInt();
        int space = row - 1;
        int asterisk = 1;

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < asterisk; k++) {
                System.out.print("*");
            }

            System.out.println();

            asterisk += 2;
            space--;
        }

        input.close();
    }
}
