package topics;

public class C03_DataTypes {

    public static void main(String[] args) {

        /*
            Variables must be declared before use
            Variable names must be unique in their scope
            Java is case-sensitive: age ≠ Age ≠ AGE
            Local variables must be initialized before use
        */

        int age;
        age = 15;
        int ageFiveYearsLater = age + 5;
        System.out.println(ageFiveYearsLater);
        age = 5;
        System.out.println(age);

        double price;
        price = 9.99;
        System.out.println(price + 0.01);

        boolean isStudent;
        isStudent = false;
        isStudent = true;
        System.out.println(isStudent);
        boolean isBigger = 1 > 5;
        System.out.println(isBigger);

        int score;
        //System.out.println(score);

        int $age;
        int _age;
        int bAge;
        //int 1age;--> Invalid

    }
}
