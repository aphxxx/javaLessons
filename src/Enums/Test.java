package Enums;

public class Test {
    public static void main(String[] args) {
        Animal animal = Animal.CAT;
        System.out.println(animal.getTranslation());

        //Object -> Enum -> Animal

        switch(animal) {
            case DOG:
                System.out.println("It's a dog");
                break;
            case CAT:
                System.out.println("It's a cat");
                break;
        }
    }
}
