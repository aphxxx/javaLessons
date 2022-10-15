package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception3 {
    public static void main(String[] args) {
        //Checked exception(Compile time exception) = исключительные случаи в работе программы
        //Unchecked (Runtime exception) = ошибка в работе программы (она не должна возникать в работе программы)

        /*
        File file = new File("test");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
         */

//        int a = 1 / 0;

//        String name = null;
//        name.length();

        int[] arr = new int[2];
        System.out.println(arr[2]);
    }
}
