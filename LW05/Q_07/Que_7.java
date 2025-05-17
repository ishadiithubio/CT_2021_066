package Q_07;
import java.util.Scanner;

public class Que_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the sentence: ");
        String sentence = input.nextLine();

        System.out.print("Enter the word to replace: ");
        String wordToReplace = input.nextLine();

        System.out.print("Enter the replacement word: ");
        String replacementWord = input.nextLine();

        String modifiedSentence = replaceWord(sentence, wordToReplace, replacementWord);
        System.out.print("Modified sentence: " + modifiedSentence);

        input.close();
    }

    private static String replaceWord(String sentence, String wordToReplace, String replacementWord) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase(wordToReplace)) {
                words[i] = replacementWord;
            }
        }
        return String.join(" ", words);
    }
}
