package topics;

public class C51_MathClass {

    public static void main(String[] args) {

        System.out.println(Math.abs(-7));
        System.out.println(Math.abs(7));
        System.out.println(Math.abs(-7.4));
        System.out.println(Math.pow(4, 2));
        System.out.println(Math.pow(1, 55));
        System.out.println(Math.pow(-10, 3));
        System.out.println(Math.sqrt(49));
        System.out.println(Math.sqrt(10000));
        System.out.println(Math.random());

        for (int i = 0; i < 100; i++) {
            System.out.println((int) (Math.random() * 6) + 1);
        }

        System.out.println(Math.min(15, 2));
        System.out.println(Math.max(11, 2));
        System.out.println(Math.round(3.4));
        System.out.println(Math.round(3.5));
        System.out.println(Math.round(99.9));


    }

}
