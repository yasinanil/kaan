package topics;

public class C47_ConsonatsQuestionMark {

    //Write code to extracts the consonants from the entered text starting from the first letter up to the first question mark.

    public static void main(String[] args) {


        String str = "Hello, how are you? What are you doing?";

        System.out.print("Consonants: ");
        for (int i = 0; i < str.length(); i++) {
            String letter = str.substring(i, i + 1).toLowerCase();
            if ("aeiou".contains(letter)) {
                continue;
            }

            if (letter.equals("?")) {
                break;
            }

            System.out.print(str.charAt(i) + " ");
        }


    }
}
