package topics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C48_ScannerWithFile {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("myContacts.txt");

        Scanner scanner = new Scanner(file);

        String word1 = scanner.next();
        System.out.println("word1 = " + word1);

        String word2 = scanner.next();
        System.out.println("word2 = " + word2);

        System.out.println(scanner.nextInt() + 4);

        scanner.nextLine();//Dummy Line

        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }


        System.out.println(scanner.nextLine());
        System.out.println(scanner.hasNextLine());

    }
}
