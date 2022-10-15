package lessons;

public class KeywordStatic {
  public static void main(String[] args) {
    Human h1 = new Human("Bob", 15);
    Human h2 = new Human("Tom", 20);
    Human.printNumberOfPeople();
    System.out.println();
    System.out.println(Math.PI);
    System.out.println(Human.PI);
  }
}

class Human{
  private String name;
  private int age;
  private static int countPeople;
  public static final double PI = 3.14;

  public static String descr;

  public Human(String name, int age){
    this.name = name;
    this.age = age;
    countPeople++;
  }

  public void setName(String name) {this.name = name;}

  public void setAge(int age) {this.age = age;}

  public void getAllFields(){
    System.out.println(name+","+age+","+descr);
  }

  public static void printAllFields(){
//    System.out.println(name);
  }

  public static void printNumberOfPeople(){
    System.out.println("Number of people "+ countPeople);
  }

}
