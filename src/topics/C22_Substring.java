package topics;

public class C22_Substring {

    public static void main(String[] args) {

        String str = "Hello World! How are you?";

        String ss = str.substring(6, 11);
        System.out.println("ss = " + ss);
        System.out.println(str.substring(13));
        System.out.println(str.substring(13, 16));


    }

}
