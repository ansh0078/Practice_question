import java.util.ArrayList;

public class StoreWater {

    static int StoreWater(ArrayList<Integer> height){
        int max = 0;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i+1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int width = j-i;
                int currWater = ht*width;
                max = Math.max(max, currWater);
            }
        }
        return max;
    }
    // array question
    static int storeWaterr(int arr []){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int ht = Math.min(arr[i], arr[j]);
                int width = j-1;
                int currWater = ht * width;
                max = Math.max(max, currWater);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        // System.out.println(StoreWater(list));

        // int arr [] =  {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int arr [] = {4, 2, 0, 6, 3, 2};
        System.out.println(storeWaterr(arr));
    }
}
