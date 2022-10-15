package lessons;



import java.util.Scanner;
import java.util.Arrays;

public class asdf {
  public static void main(String[] args) {
    /*
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    String[] numbers = input.split(" ");
    //   System.out.println(numbers[0] + numbers[1] + Integer.parseInt(numbers[2]));
    if(Integer.parseInt(numbers[0]) * Integer.parseInt(numbers[1]) >= Integer.parseInt(numbers[2])){
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
    */


//    Scanner scanner = new Scanner(System.in);
//    String input = scanner.nextLine();
//    String[] numbers = input.split(" ");
//    //   System.out.println(numbers[0] + numbers[1] + Integer.parseInt(numbers[2]));
//    System.out.println(Integer.parseInt(numbers[1]) * Integer.parseInt(numbers[2]) * Integer.parseInt(numbers[0]) * 2);
//  }


//    Scanner asd = new Scanner(System.in);
//    String input = scanner.nextLine();
//    String[] numbers = input.split(" ");
//    //   System.out.println(numbers[0] + numbers[1] + Integer.parseInt(numbers[2]));
//    System.out.println(Integer.parseInt(numbers[0]) * Integer.parseInt(numbers[0]) * 4);
//  }

//
//    String input = scanner.nextLine();
//    String[] stringNumbers = input.split(" ");
//    int[] numbers = new int[3];
//    for(int i = 0; i < stringNumbers.length; i++){
//      numbers[i] = Integer.parseInt(stringNumbers[i]);
//    }
//    lessons.Arrays.sort(numbers);
//    for(int num : numbers){
//      System.out.println(num);
//    }
//    System.out.println("result: " + (numbers[2] - numbers[0]));


//    double[] array = new double[100];
//    for(int i = 0; i < array.length; i++){
//      array[i] = Math.random();
//      System.out.println(array[i]);
//  }

//    double max = array[0];
//    double min = array[0];
//    double avg = 0;
//
//    for(int i = 0; i < array.length; i++){
//      if(max < array[i])
//        max = array[i];
//      if(min > array[i])
//        min = array[i];
//      avg += array[i]/array.length;
//      System.out.println(avg);
//    }
//
//    System.out.println(max+", "+min+", "+avg);

    /*
    for(int i = 0; i < array.length; i++){
      for(int j = 0; j < array.length - i - 1; j++){
        if(array[j] > array[j + 1]){
          double temp = array[j];
          array[j] = array[j+1];
          array[j+1] = temp;
        }
      }


    }

    for(int i = 0; i < array.length; i++){
      System.out.println(array[i]);
    }
    */

    /*
    for(int i = 2; i <= 100; i++){
      boolean isPrime = true;

      for(int j = 2; j < i; j++){
        if(i % j == 0){
          isPrime = false;
          break;
        }
      }
      if(isPrime){
        System.out.println(i);
      }
    }
    */

    int[] array = {1,2,2,2,3,5,6,7,8,9};

    System.out.println(Arrays.toString(removeElement(array, 2)));

  }

  public static int[] removeElement(int[] nums, int val){
    int offset = 0;

    for(int i = 0; i < nums.length; i++){
      System.out.println(i);
      if(nums[i] == val){
        offset++;
      } else{
        System.out.println(i + " "+ offset);
        System.out.print(Arrays.toString(nums));
        nums[i-offset] = nums[i];
        System.out.println(Arrays.toString(nums));
      }
    }

    return Arrays.copyOf(nums, nums.length - offset);
  }
}

