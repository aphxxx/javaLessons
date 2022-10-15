package UpcastingDowncasting;

public class Test {
  public static void main(String[] args) {
//    Dog dog = new Dog();
//    Animal animal = dog; // переменная типа Animal // Upcasting -- Восходящее преобразование
//
//    //Downcasting -- Неисходящее преобразование
//    Dog dog2 = (Dog) animal;
//    dog2.bark();
//    dog2.eat();
    Animal a = new Animal();
    Dog dog = (Dog) a;
    dog.bark();
  }
}
