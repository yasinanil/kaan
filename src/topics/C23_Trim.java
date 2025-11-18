package topics;

public class C23_Trim {

    public static void main(String[] args) {

        String str = "   Hi      World,  How are        you       today?   ";
        System.out.println(str.trim());
        System.out.println(str.trim().replaceAll("\\s+"," "));
        str = str.trim().replaceAll("\\s+"," ");
        System.out.println(str.charAt(str.length()-1));
        System.out.println(str.charAt(str.indexOf(" ")+1));
        System.out.println(str.charAt(str.lastIndexOf(" ")+1));

    }

}
