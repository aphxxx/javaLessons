package PrimitiveTypes;

public class Test {
  public static void main(String[] args) {
//    byte b = 123; //-128 to 127
//    long l = 123;
//    double d = 12.3;
//    float f = 12.2f;

    float f = 123.2f;

    double d = 123.5;
    int a = (int)d;
    long l = a; // неявное
    int x = (int)l; // явное
    System.out.println(x);

    long y = Math.round(d);
    System.out.println(y);

    byte k = (byte)130;
    System.out.println(k);

    Integer.parseInt("123");


    //Классы обёртки(классы для получения методов)
    //Double, Float, Long, Integer, Short, Byte, Character, Boolean
  }
}
