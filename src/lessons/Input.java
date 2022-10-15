package lessons;

import java.util.Scanner;

public class Input{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in); // Мы создаем объект Scanner класса Scanner
    System.out.println("enter");
    String string = s.nextLine();
    int x = s.nextInt();
    System.out.println("you enter "+string + "and "+x);
  }
}
