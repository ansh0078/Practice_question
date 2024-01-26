public class BubbleSort {
    static void BubbleSort(int arr[]) {
        for(int turn = 0; turn < arr.length-1; turn++) {
            int swap = 0;
            for(int j = 0; j < arr.length-1-turn; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j]; 
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap ++;
                }
            }
            if(swap == 0){
                break;

            }
        }
    }
    static void printArr(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
    public static void main (String arg []) {
        int arr[] = {5, 6, 7, 8, 9};
        BubbleSort(arr);
        printArr(arr);
    }
}
