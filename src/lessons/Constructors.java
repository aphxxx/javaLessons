package lessons;

public class Constructors {
  public static void main(String[] args) {
    Human3 human1 = new Human3("asd");

  }
}

class Human3 {

  private String name;
  private int age;

  public Human3(){
    this("bob", 15);
    System.out.println("First constructor");
  }

  public Human3(String name){
    System.out.println("Second constructor");
    this.name = name;
  }

  public Human3(String name, int age){
    System.out.println("Third constructor");
    this.name = name;
    this.age = age;
  }

  public void setName(String name) {this.name = name; }

  public void setAge(int age) {this.age = age; }
}
