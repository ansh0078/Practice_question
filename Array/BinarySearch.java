public class BinarySearch {
    static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length-1;
        while(start <= end) {
            int mid = (start+end)/2;
            if(numbers[mid] == key) {
                return mid;
            }
            if(numbers[mid] < key){
                start = mid +1;
            }
            else {
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {1, 2, 4, 5, 7, 8, 9, 20, 25, 40, 45, 90};
        int key = 90;

        System.out.println("index of key is : " +binarySearch(numbers, key));
    }
}
