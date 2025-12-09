package topics;

import java.util.Scanner;

public class C45_SetSentence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String sentence = "";
        do {
            System.out.println("Enter a word:");
            sentence += scanner.next() + " ";
            System.out.println("To add more enter '+'\nTo exit enter '-'");
        } while (scanner.next().equals("+"));

        System.out.println(sentence);

    }

}
