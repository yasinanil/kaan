package topics;

public class C18_ContainsEndWithStartWith {

    public static void main(String[] args) {

        String str = "Hello World";
        boolean isE = str.contains("e");
        System.out.println(isE);
        System.out.println(str.contains("l"));
        System.out.println(str.contains("d"));
        System.out.println(str.contains("He"));
        System.out.println(str.contains("Hell"));
        System.out.println(str.contains(" "));
        System.out.println(str.contains("lo W"));

        //StartWith:
        System.out.println(str.startsWith("H"));
        System.out.println(str.startsWith("He"));
        System.out.println(str.startsWith("Hel"));

        //EndWith:
        System.out.println(str.endsWith("d"));
        System.out.println(str.endsWith("ld"));
        System.out.println(str.endsWith("rld"));
        System.out.println(str.endsWith("World"));
        System.out.println(str.endsWith("HWorld"));

    }
}
