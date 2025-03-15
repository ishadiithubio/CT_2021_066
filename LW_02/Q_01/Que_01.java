package Q_01;

import java.util.Scanner;
public class Que_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 01.a
        System.out.print("Enter A: ");
        double A = scanner.nextDouble();
        System.out.print("Enter B: ");
        double B = scanner.nextDouble();
        System.out.print("Enter C: ");
        double C = scanner.nextDouble();
        double resultA = Math.sqrt(Math.pow(B, 2) + (4*A*C));
        System.out.println("The square root of B^2 + 4AC: " + resultA);
        //01.b
        System.out.print("Enter X: ");
        double X = scanner.nextDouble();
        System.out.print("Enter Y: ");
        double Y = scanner.nextDouble();
        double resultB = Math.sqrt(X + 4 * Math.pow(Y, 3));
        System.out.println("The square root of X + 4Y^3: " + resultB);
        //01.c
        double resultC = Math.cbrt(X * Y);
        System.out.println("The cube root of the product of X and Y: " + resultC);
        //01.d
        System.out.print("Enter Radius: ");
        double radius= scanner.nextDouble();
        final double PI=3.14;
        double area =  PI * Math.pow(radius,2) ;
        System.out.print("The area of circle: "+ area);
        scanner.close();
    }
}
