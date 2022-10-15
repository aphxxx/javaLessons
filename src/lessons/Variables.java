package lessons;

public class Variables {
  public static void main(String[] args) {
    int myInt = 557; // -2147483648 - 2147483647 32 bit
    short myShort = 3266; // -32768 - 32767 16 bit
    long myLong = 234232344; // –9223372036854775808 - 9223372036854775807 64 bit

    double myDouble = 235.35; // ±4.9*10**-324 - ±1.7976931348623157*10**308 64 bit
    float myFloat = 235.5f; // -3.4*10**38 до 3.4*10**38 32 bit

    char myChar = 'a'; // 0 - 65535 16 bit
    boolean myBoolean = true;

    byte myByte = 127; // -128-127
    System.out.println(myInt);
  }
}
