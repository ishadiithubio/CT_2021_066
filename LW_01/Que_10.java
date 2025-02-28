package Q_10;
import java.util.Scanner;

public class Que_10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an odd-length word: ");
        String word = scanner.next();
        scanner.close();

        int length = word.length();

        if (length % 2 == 1) {
            int middleIndex = length / 2;
            System.out.println(word.charAt(middleIndex));
        }
        else {
            System.out.println("Error. The word doesn't have odd number of characters.");
        }
    }
}

