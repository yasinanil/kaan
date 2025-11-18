package topics;

public class C32_MethodCreation {

    public static void main(String[] args) {
        greet();
        greetWithName("Mary");
        greetWithAge("Lily", 2010);
        System.out.println(calculateAge(2009));
        System.out.println(firstAndLastChars("John"));
        System.out.println(nameAndAge("Tom", 1975));
    }

    public static void greet() {
        System.out.println("Hello");
    }

    public static void greetWithName(String name) {
        System.out.println("Hello " + name);
    }

    public static void greetWithAge(String name, int yob) {
        System.out.println("Hello " + name + ", You are " + (2025 - yob) + " years old!");
    }

    public static int calculateAge(int yob) {
        return 2025 - yob;
    }

    public static String firstAndLastChars(String text) {
        return text.substring(0, 1) + text.substring(text.length() - 1);
    }

    public static String nameAndAge(String name, int yob) {
        return "Hello " + name + ", You are " + calculateAge(yob) + " years old!";
    }




}
