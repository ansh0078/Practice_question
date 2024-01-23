public class LinearSearch {
    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 11, 12, 45, 56, 67, 78, 89};
        int key = 11;

        int res = linearSearch(numbers, key);
        if(res == -1){
            System.out.println("Not Found");
        }
        else {
            System.out.println("key is at index of : " +res);
        }
    }
}
