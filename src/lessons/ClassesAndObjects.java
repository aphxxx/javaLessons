package lessons;

public class ClassesAndObjects {  //lessons.ClassesAndObjects это класс
  public static void main(String[] args) { //main это метод
    Person person1 = new Person();
    person1.setName("");
    person1.setAge(-5);
    person1.getName();
    person1.getAge();
//    System.out.println(person1.getAge() + person1.getName());
//    person1.speak();
//    person1.setup("asd", 13);
//    person1.speak();
//    person1.sayHello();
//    int year1 = person1.calculateYearsToRetritment();
//    System.out.println("My name is "+person1.name+','+ " my age is " + person1.age);
//    lessons.Person person2 = new lessons.Person();
//    person2.name = "Pavel";
//    person2.age = 26;
//    person2.speak();
//    int year2 = person2.calculateYearsToRetritment();
//    int year3 = person2.speak(); нужно вернуть int, а возвращается void, так тоже низя
//    System.out.println("first person "+year1 + " second person "+year2);
//    System.out.println("My name is "+person2.name+','+ " my age is " + person2.age);
  }
}

class Person{
  //У класса могут быть:
  //1. Данные(поля)
  //2. Действия, которые он может совершать(методы)
  private String name;
  private int age;

  public void setName(String username){
    if (username.isEmpty()){
      System.out.println("Empty name");
    } else {
      name = username;
    }
  }

  public String getName(){
    return name;
  }
  public void setAge(int userAge){
    if(userAge < 0){
      System.out.println("Incorrect age");
    } else{
      age = userAge;
    }
  }

  public int getAge(){
    return age;
  }


  void setup(String username, int year){
    name = username;
    age = year;
  }

  int calculateYearsToRetritment(){
    int years = 65 - age;
//    String s = "Hi"; Так делать нельзя ну ты пон чел. бож. эм.
    return years;
  }
  void speak(){
    for(int i = 0; i < 1; i++){
      System.out.println("My name is "+name+','+ " my age is " + age);
    }
  }

  void sayHello(){
    System.out.println("Hello!");
  }
}
