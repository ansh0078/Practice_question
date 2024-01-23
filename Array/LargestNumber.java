import java.util.*;
public class LargestNumber {
    static int getLargestNumber(int numbers[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] >= max){
                max = numbers[i];
            }
            
        }
        return max;
    }
    static int getSmallestNumber(int numbers[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] <= min){
                min = numbers[i];
            }
            
        }
        return min;
    }
    public static void main(String[] args) {
        int numbers[] = {22, 3, 4, 6, 45, 100, 34, 1, 56, 89, 50, 90};

        System.out.println(getLargestNumber(numbers)); 
        System.out.println(getSmallestNumber(numbers));
        
    }
}
