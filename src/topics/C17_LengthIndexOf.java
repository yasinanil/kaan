package topics;

public class C17_LengthIndexOf {

    public static void main(String[] args) {

        String text = "John Doe, how are you?";
        int numOfElements = text.length();
        System.out.println(numOfElements);

        //Print the last element of the String:
        System.out.println(text.charAt(text.length() - 1));

        //indexOf():
        System.out.println(text.indexOf("D"));
        System.out.println(text.indexOf("h"));
        System.out.println(text.indexOf("o"));
        System.out.println(text.indexOf("w"));
        System.out.println(text.indexOf(","));
        System.out.println(text.indexOf("?"));
        System.out.println(text.indexOf("ho"));
        System.out.println(text.indexOf("how"));
        System.out.println(text.indexOf("how "));
        System.out.println(text.indexOf("how are"));

        //lastIndexOf():
        System.out.println(text.lastIndexOf("o"));
        System.out.println(text.lastIndexOf("h"));

        //John Doe, how are you?

    }
}
