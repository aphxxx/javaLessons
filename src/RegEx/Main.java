package RegEx;

public class Main {
    public static void main(String[] args) {
        /*
            \\d - одна цифра
            + - 1 или более
            * - 0 или более
            ? - 0 или 1 символов до
         */
        String a = "1234";
        String num = "555";
        System.out.println(a.matches("1234")); // true
        System.out.println(a.matches("1235")); // false
        System.out.println(num.matches("\\d")); // true но только если есть одно число, если будет больше то false
        System.out.println(num.matches("\\d+")); // true тут же возможно сколько угодно цифр
        System.out.println(num.matches("\\d+")); // true тут же возможно сколько угодно цифр
    }
}
