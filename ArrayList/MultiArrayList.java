import java.util.*;

public class MultiArrayList {
    public static void main(String[] args) {
        // ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        // ArrayList<Integer> list1 = new ArrayList<>();

        // list1.add(1); list1.add(2); list1.add(3);
        // mainList.add(list1);

        // ArrayList<Integer> list2 = new ArrayList<>();

        // list2.add(4); list2.add(5); list2.add(6);
        // mainList.add(list2);

        // for (int i = 0; i < mainList.size(); i++) {
        //     AbstractList<Integer> currlist = mainList.get(i);
        //     for (int j = 0; j < currlist.size(); j++) {
        //         System.out.print(currlist.get(j) + " ");
        //     }
        //     System.out.println();
        // }

        // System.out.println(mainList);
        
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 1; i < 6; i++) {
            list.add(i*1);
            list1.add(i*2);
            list2.add(i*3);
        }
        mainList.add(list);
        mainList.add(list1);
        mainList.add(list2);

        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + "  ");
            }
            System.out.println();
        }

        System.out.println(mainList);
    }

}
