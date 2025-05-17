package Q_01;
public class Que_01 {
    public static void main(String[] args) {
        int number = 10;
        while (number <= 49){
            System.out.print(number + " ");

            if(number %10 == 9){
                System.out.println();
            }
            number = number + 1;
        }
    }
}
