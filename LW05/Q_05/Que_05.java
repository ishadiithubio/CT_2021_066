package Q_05;

import java.util.Scanner;

public class Que_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word=input.nextLine();

        if(isPalindrome(word)){
            System.out.print("The given word is palindrome");
        }else{
            System.out.print("The given word is not palindrome ");
        }

    }
   public static boolean isPalindrome(String word) {
        String reverseWord = "";
        for(int i=word.length()-1; i>=0; i--){
        reverseWord = reverseWord + word.charAt(i);

   }
        return word.equals(reverseWord);
}}
