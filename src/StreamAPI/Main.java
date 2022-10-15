package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
            list.add("One");
            list.add("Two");
            list.add("Three");
            list.add("Four");
            list.add("Five");
            list.add("Six");
            list.add("");
            list.add(null);
            list.add("Nine");
            list.add("Ten");
//            Stream stream = list.stream();
//            stream.filter(x -> x.toString().length() == 3).forEach(System.out::println);

            list.stream()
                    .filter(Objects::nonNull)
                    .filter(name -> !name.isEmpty() && name.contains("a"))
                    .forEach(System.out::println);

    }
}
