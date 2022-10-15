package lessons;

import java.util.Scanner;

public class Switch {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter age");
    String age = scanner.nextLine();
    switch(age){
      case "null":
        System.out.println("you a newborn");
        break;
      case "seven":
        System.out.println("you going to school");
        break;
      case "eighteen":
        System.out.println("you finish a school");
        break;
      default:
        System.out.println("ni odno ne podoshlo");
    }
  }
}
