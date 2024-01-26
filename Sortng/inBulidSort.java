import java.util.Arrays;
import java.util.Collections;

public class inBulidSort {
    public static void main(String[] args) {
        Integer arr[] = {5, 1, 3, 4, 2};
        Arrays.sort(arr);
        // Arrays.sort(arr, 0,3);

        // Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
