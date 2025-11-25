package topics;

public class C33_MethodOverloading {

    public static void main(String[] args) {

        greet();
        greet("John");
        greet("Mary", 2020);
        greet(2000, "Tim");

        System.out.println(new C33_MethodOverloading().add());
        System.out.println(add(3, 2));
        System.out.println(add(1, 2, 3, 4));
        System.out.println(add(1, 2, 3));

    }

    public static void greet() {
        System.out.println("Hello everyone!");
    }

    public static void greet(String name) {
        System.out.println("Hello " + name + "!");
    }

    public static void greet(String name, int yob) {
        System.out.println("Hello " + name + "! You are " + (2025 - yob) + " years old!");
    }

    public static void greet(int yob, String name) {
        System.out.println("Hello " + name + "! You are " + (2025 - yob) + " years old!");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    int add() {
        System.out.println("Enter parameters!");
        return 0;
    }


}
