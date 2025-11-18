package topics;

import java.util.Scanner;

public class C26_VowelOrConsonant {

    //Check if a given character is a vowel or a consonant.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter:");
        String letter = scanner.nextLine().trim().substring(0, 1).replaceAll("[^a-zA-Z]", "");

        if (letter.isEmpty()) {
            System.out.println("Invalid Input");
        } else {
            if ("aeiou".contains(letter.toLowerCase())) {
                System.out.println(letter + " is a vowel!");
            } else {
                System.out.println(letter + " is a consonant!");
            }
        }
    }
}
