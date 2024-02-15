import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(5);
        list.add(4);
        list.add(7);
        list.add(3);
        list.add(6); // O(1)

        // list.add(1,5);  // O(n)

        // System.out.println(list);

        // System.out.println(list.get(3)); // O(1)


        //delete
        // System.out.println(list.remove(3)); // O(n)
        // System.out.println(list);

        // update
        // System.out.println(list.set(3, 3)); // O(n)
        // System.out.println(list);

        // contain
        // System.out.println(list.contains(3)); // O(n)


        // count
        // System.out.println(list.size());
 
        // for (int i = 0; i < list.size(); i++) {
        //     System.out.print(list.get(i) + " ");
        // }
        // System.out.println();


        // // O(n)
        // for (int i = list.size()-1; i >= 0; i--) {
        //     System.out.print(list.get(i) + " ");
        // }
        // System.out.println();

        // find maxmimum number
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            // if(max < list.get(i))
            //     max = list.get(i);
            max = Math.max(max,list.get(i));
        }
        System.out.println(max);

    }
}
