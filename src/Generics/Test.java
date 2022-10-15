package Generics;
import java.util.ArrayList;
import java.util.List;


public class Test {
  public static void main(String[] args) {
    /*
    List animals = new ArrayList();
    Animal ourAnimal = new Animal();
    animals.add("cat");
    animals.add("dog");
    animals.add("frog");
    animals.add(ourAnimal);

    String animal = (String) animals.get(1);
    System.out.println(animal);

    //////////////////////////////////////////////
    List<String> animals2= new ArrayList<String>();
    animals2.add("cat");
    animals2.add("dog");
    animals2.add("frog");
//    animals2.add(ourAnimal); error

    String animal2 = animals2.get(1);

    //////////////////////////////////////////////
    List<String> animals3 = new ArrayList<>();

     */

    List<Animal> listOfAnimal = new ArrayList<>();
    listOfAnimal.add(new Animal(1));
    listOfAnimal.add(new Animal(2));


    List<Dog> listOfDogs = new ArrayList<>();
    listOfDogs.add(new Dog());
    listOfDogs.add(new Dog());

    test(listOfAnimal);
    test(listOfDogs);


  }
  // WildCards
  private static void test(List<? extends Animal> list){
    for(Animal animal : list){
      System.out.println(animal);
    }
  }

}

/*
class Animal{

}
 */