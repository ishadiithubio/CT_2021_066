package Que_01;

import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter first value: ");
        int f_Num = input.nextInt();

        System.out.print("enter second value: ");
        int s_Num = input.nextInt();


        System.out.print("enter third value:  ");
        int t_Num = input.nextInt();



        int smallest  = f_Num;
        if(s_Num<smallest){
            smallest = s_Num;

        }
        if(t_Num < smallest){
            smallest = t_Num;
        }
        System.out.println("Smallest value:  " + smallest);

    }
}
