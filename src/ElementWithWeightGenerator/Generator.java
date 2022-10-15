package ElementWithWeightGenerator;


import java.util.Arrays;

public class Generator {
  private int[] value;
  private int[] weight;

  public Generator(int[] value, int[] weight){
    this.value = value;
    this.weight = weight;
  }

  public int generate(){
    int sum = 0;
    int index = 0;

    for(int i = 0; i < weight.length; i++){
      sum += weight[i];
    }

    int[] numbers = new int[sum];

    for(int i = 0; i < value.length; i++){
      for(int j = 0; j < weight[i]; j++){
        numbers[index] = value[i];
        index++;
      }
    }
    System.out.println(Arrays.toString(numbers));
    return numbers[(int) Math.round(Math.random()* numbers.length)];
  }
}
