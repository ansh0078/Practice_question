import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(5);


        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        // Reverse oreder sorting

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
