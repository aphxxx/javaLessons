package lessons;

public class Arrays {
  public static void main(String[] args) {
    int number = 10; // притивный тип данных //[10]
    int[] numbers = new int[5]; // numbers -> [массив] ссылочный тип данных
//  System.out.println(numbers[0]); // 0 1 2 3 4
//  System.out.println(numbers[5]); // error

    for(int i =0; i<numbers.length; i++){
      numbers[i] = i*10;
    }
    for(int i =0; i<numbers.length; i++){
      System.out.println(numbers[i]);
    }
    int[] numbers1 = {1,2,3};
    for(int i = 0; i < numbers1.length; i++){
      System.out.println(numbers1[i]);
    }
    int[] arr1 = {1,2,3,4};
    int[] arr2 = {1,2,3,4};
    int[] a = arr1;
    int[] b = arr2;
    System.out.println(a == b);
  }
}
