package lessons;

import java.util.Scanner;

public class doWhile {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
//      System.out.println("enter 5");
//      int value = scanner.nextInt();
//      while(value != 5){
//        System.out.println("enter 5");
//        value = scanner.nextInt();
//      }
      int value;
      do{
        System.out.println("enter 5");
        value = scanner.nextInt();
      } while(value != 5);

      System.out.println("you enter 5");
  }
}
