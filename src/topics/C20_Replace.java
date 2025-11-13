package topics;

public class C20_Replace {

    public static void main(String[] args) {

        String str = "Hello World! How are you?";
        String newStr = str.replace("o", "");
        System.out.println(newStr);

        System.out.println(str.replace("Hello","Selam"));
        System.out.println(str.replace("World","Universe"));
        System.out.println(str.replace("!",","));

        //replaceAll();
        System.out.println(str.replaceAll(" ",""));
        System.out.println(str.replaceAll("\\s","_"));
        System.out.println(str.replaceAll("H","h"));

        String text = " Java.     0123456789 Hello ";
        System.out.println(text.replaceAll("\\d",""));
        System.out.println(text.replaceAll("[Ja.]","_"));
        System.out.println(text.replaceAll("[a-z]","_"));
        System.out.println(text.replaceAll("[0-9]","_"));
        System.out.println(text.replaceAll("[0-5]","*"));
        System.out.println(text.replaceAll("\\D","*"));
        System.out.println(text.replaceAll("[^0-9]","*"));
        System.out.println(text.replaceAll("\\s","*"));
        System.out.println(text.replaceAll("\\S","*"));
        System.out.println(text.replaceAll("\\s+","_"));

        //trim()
        String name = "  John Doe   ";
        System.out.println(name.trim());

    }

}
