package Que_03;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        System.out.println("6 Million");
        System.out.println("9 Billion");
        System.out.println("12 Trillion");
        System.out.println("15 Quadrillion");
        System.out.println("18 Quintillion");
        System.out.println("21 Sextillion");
        System.out.println("30 Nonillion");
        System.out.println("100 Googol");

        Scanner input = new Scanner(System.in);
        System.out.print("Input the 10 th Power: ");
        int power = input.nextInt();
        String message;
        switch (power){
            case 6:
                message="Million";
                break;
            case 9:
                message="Billion";
                break;
            case 12:
                message=" Trillion";
                break;
            case 15:
                message="Quadrillion";
                break;
            case 18:
                message="Quintillion";
                break;
            case 21:
                message="Sextillion";
                break;

            case 30:
                message="Nonillion";
                break;
            case 100:
                message="Googol";
                break;
            default:
                message="null";
                break;
        }
     if(message == null){
         System.out.println("Invalid Statement");
     }
     else{
         System.out.println("Your Selection "+ message);
     }
    }
}
