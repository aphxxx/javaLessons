package Polymorph;

public class Dog extends Animal {

  @Override
  public void eat(){
    System.out.println("Dog is eating..."); // теперь метод eat() спецефичен для собаки и обращаясь к этому объекту будет вызван этот метод
  }

  public void bark(){
    System.out.println("Dog is barking...");
  }
}
