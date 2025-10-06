package topics;

public class C02_Variables {


    public static void main(String[] args) {

        //Variable declaration
        int age;
        age = 25;//Variable assignment
        System.out.println(age);//Printing on console

        int num1 = 40;
        int num2 = 60;
        int sum = num1 + num2;
        int product = num1 * num2;
        System.out.println(sum);
        System.out.println(product);

        String name = "John";
        String lastname = "Doe";
        System.out.println(name + lastname);//JohnDoe
        lastname = "Star";
        System.out.println(name + lastname);//JohnStar

        int age1, age2, age3, age4;
        age1 = 5;
        age2 = 7;
        age3 = 8;
        age4 = 2;
        System.out.println(age1 + age2 + age3 + age4);

    }
}
