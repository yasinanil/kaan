package topics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C50_ScannerWhichLine {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("players.txt"));

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.contains("Cameron Price")) {
                System.out.println("Cameron Price's score: " + line.charAt(line.length() - 1));
            }
        }
    }
}
