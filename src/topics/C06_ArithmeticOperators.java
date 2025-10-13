package topics;

public class C06_ArithmeticOperators {

    public static void main(String[] args) {

        int x = 5;
        int y = 2;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);
        //System.out.println(x / 0);//ArithmeticException: / by zero
        System.out.println(10.0 / 3);

        // Convert seconds to minutes and seconds
        int totalSeconds = 368;
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;
        System.out.println("minutes = " + minutes);
        System.out.println("seconds = " + seconds);



    }

}
