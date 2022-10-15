package ReadingFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\Users\\Grind\\Desktop\\asdf\\javaLessons\\src\\ReadingFromFile\\test";

        File file = new File(path);

        Scanner scanner = new Scanner(file);
//        while(scanner.hasNextLine()){
//            System.out.println(scanner.nextLine());
//        }
//
//        scanner.close();

        String line  = scanner.nextLine();
        String[] numbers = line.split(" ");

        System.out.println(Arrays.toString(numbers));
    }
}
