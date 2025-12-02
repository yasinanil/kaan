package topics;



import static topics.C36_ReverseString.reverseString;

public class C37_Palindrome {

    //Create a method to check if a word is palindrome or not.
    public static void main(String[] args) {

        System.out.println(isPalindrome("Eva, can I see bees in a cave?"));

    }

    public static boolean isPalindrome(String word) {
        word = word.toLowerCase().replaceAll("[^a-z]", "");
        return reverseString(word).equals(word);
    }


}
/*
"Madam, I'm Adam."

"Able was I, ere I saw Elba."

"A man, a plan, a canal, Panama!"

"Was it a car or a cat I saw?"

"Eva, can I see bees in a cave?"
 */