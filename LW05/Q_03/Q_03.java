package Q_03;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;

        System.out.print("Enter N: ");
        N = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            int result = N * i;
            System.out.println(N + " x " + i + " = " + result);
        }

        input.close();
    }
}
