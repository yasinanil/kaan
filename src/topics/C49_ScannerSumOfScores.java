package topics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C49_ScannerSumOfScores {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("players.txt"));
        int total = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (!line.isEmpty()) {
                total += Integer.parseInt(line.replaceAll("[^0-9]", ""));
            }
        }
        System.out.println("total = " + total);
    }
}
