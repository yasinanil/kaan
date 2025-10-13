package topics;

public class C11_CompoundAssignmentOperators {

    public static void main(String[] args) {

        int number = 5;

        number = number + 6;
        number += 3; // = number = number + 3
        number -= 10;
        number *= 15;
        number /= 4;
        number %= 8;

        System.out.println("number = " + number);


    }
}
