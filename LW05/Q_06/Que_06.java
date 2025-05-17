package Q_06;
import java.util.Random;
import java.util.Scanner;
public class Que_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("Welcome to the number guessing game!");

        do {
            System.out.print("Enter your quess(1-100) : ");
            guess = input.nextInt();
            attempts++;


            if (guess > secretNumber) {
                System.out.println("Higher");
            } else if (guess < secretNumber) {
                System.out.println("Lower");

            }else{
                System.out.println("Congratulation you guessed the secret number correctly in "+ attempts + " attempts" );
            }

    }while(guess!=secretNumber);


}}
