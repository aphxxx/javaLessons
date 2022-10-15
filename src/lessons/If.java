package lessons;

public class If {
  public static void main(String[] args){
    int myInt = 15;
    if(myInt < 10){
      System.out.println("correct<10");
    } else if(myInt > 20){
      System.out.println("correct>20");
    } else{
      System.out.println("error");
    }
  }
}
