package topics;

public class C14_StringManipulationConcatCharAt {

    public static void main(String[] args) {

        String name = "John";
        String lastName = "Doe";
        System.out.println(name + lastName);//JohnDoe
        String fullName = name.concat(lastName);
        System.out.println(fullName);

        //charAt():
        char ch1 = fullName.charAt(0);
        System.out.println("ch1 = " + ch1);
        System.out.println(fullName.charAt(1));
        System.out.println(fullName.charAt(6));

        System.out.println(fullName.charAt(10));//StringIndexOutOfBoundsException

    }


}
