package topics;

public class C16_Equals {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "World";
        String str3 = "Hello";
        String str4 = "HELLO";

        boolean s1s3 = str1.equals(str3);//true
        System.out.println(s1s3);
        System.out.println(str2.equals(str3));//false
        System.out.println(str1.equals(str4));//false
        System.out.println(str1.equalsIgnoreCase(str4));//true
        System.out.println(str1.equalsIgnoreCase(str3));//true

    }
}
