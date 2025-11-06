package topics;

public class C19_IsEmptyIsBlank {

    public static void main(String[] args) {

        String str = "         ";
        boolean isEmpty = str.isEmpty();//Counts white space
        System.out.println(isEmpty);
        System.out.println(str.isBlank());//Does not count white spaces

    }
}
