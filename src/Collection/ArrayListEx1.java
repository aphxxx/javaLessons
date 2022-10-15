package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Alex");
        arrayList1.add("Pavel");

        System.out.println(arrayList1);

        ArrayList<Integer> arrayList2 = new ArrayList<>(30); // можно ввести вместительность
        for (int i = 0; i <= 29; i++) {
            arrayList2.add(i);
        }

        System.out.println(arrayList2);

        List<String> arrayList3 = new ArrayList<>(arrayList1);
        System.out.println(arrayList3);

    }
}
