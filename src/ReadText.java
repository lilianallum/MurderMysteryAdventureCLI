import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadText {

    public static void printText(String fileName) {
        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File " + fileName + " not found.");
        }

    }
}
