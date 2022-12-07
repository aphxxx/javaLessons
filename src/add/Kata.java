package add;

/*
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Kata {
    public static void main(String[] args) {
        System.out.println(filterList(List.of(1, 2, "a", "b")));
    }
    public static List<Object> filterList(final List<Object> list) {
        // Return the List with the Strings filtered out
        return list.stream().filter(x -> x instanceof Integer).toList();


    }
}


 */

import java.util.Arrays;
import java.util.stream.Stream;
public class Kata {

    public static void main(String[] args) {
        System.out.println(sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    public static int sequence(int[] arr) {
        int maxValue = 0;
        int curValue = 0;

        for(int item : arr){
            curValue += item;
            maxValue = Math.max(maxValue, curValue);
            if(curValue < 0){
                curValue = 0;
            }
        }
        return maxValue;
    }
}