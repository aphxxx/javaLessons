package lessons;

public class KeywordThis {
  public static void main(String[] args) {
    Human3 human1 = new Human3();
    human1.setAge(20);
    human1.setName("Hum");
//    human1.getInfo();
  }
}

class Human2{
  String name;
  int age;

  public void setName(String name){
    this.name = name;
  }

  public void setAge(int age){
    this.age = age;
  }

  public String getName(){
    return name;
  }

  public int getAge(){
    return age;
  }

  public void getInfo(){
    System.out.println(name+", "+age);
  }

}
