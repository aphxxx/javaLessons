package Polymorph;

public class Test {
  public static void main(String[] args) {
    Animal animal = new Animal();
    Dog dog = new Dog();
    Cat cat = new Cat();

    test(animal);
    test(dog);
    test(cat);

//    Animal animal = new Dog(); // мы можем обращаться через переменную родительского типа
//    animal.eat();
    /*
    animal.eat();
    // animal.bark(); нет доступа т.е обращаясь к объекту через родительский тип мы имеем только методы определённым в родителе

    Dog dog = new Dog();
    dog.eat();
    dog.bark(); // Доступ есть
     */
  }

  public static void test(Animal animal){
    animal.eat();
  }
}
