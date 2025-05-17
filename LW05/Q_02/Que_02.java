package Q_02;

import java.util.Scanner;

public class Que_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do{
            System.out.print("Enter a Num: ");
            num = scanner.nextInt();

            if(num>=0){
                int digit = digitCount(num);
                System.out.println(num + " has "+ digit + " digits");

            }

        }while(num>=0);



    }

    private static int digitCount(int num) {


     int count = 0;
     while (num > 0) {
         num = num / 10;
         count++;
     }
     return count;
 }}
