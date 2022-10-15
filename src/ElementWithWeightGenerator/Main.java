package ElementWithWeightGenerator;

public class Main {
  public static void main(String[] args) {
    int[] value = {1,2,3,4,5,6,4,66,7,9,9,0,8,6,54,34};
    int[] weight = {1,2,2,2,1,2,4,66,7,9,9,0,8,6,54,34};

    Generator generator = new Generator(value, weight);

    System.out.println(generator.generate());
  }
}
