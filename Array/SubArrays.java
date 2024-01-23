public class SubArrays {
    // static void SubArrays(int number[]) {
    //     int ts = 0;
    //     int currSum = 0;
    //     int maxSum = Integer.MIN_VALUE;
    //     for (int i = 0; i < number.length; i++) {
    //         int start = i;
    //         for (int j = i; j < number.length; j++) {
    //             int end = j;
    //             currSum = 0;
    //             for (int k = start; k <= end; k++) {
    //                 System.out.print(number[k] + " ");
    //                 currSum += number[k];
    //             }
    //             if(currSum > maxSum) {
    //                 maxSum = currSum;
    //             }
    //             System.out.print("sum of array is = " + currSum);
    //             ts++;
    //             System.out.println();
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("total number of SubArray is : " +ts );
    //     System.out.println("Maximum sum of SubArray is : " +maxSum );
    // }
    public static void main(String[] args) {
        // int numbers[] = {2, 4, 6, 8, 10};
        int numbers[] = {1, -2, 6, -1, 3};

        // SubArrays(numbers);
        maxSubArrays(numbers);

    }
    static void maxSubArrays(int number[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];


        prefix[0] = number[0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + number[i];
        }

        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                currSum = start == 0 ?prefix[end] : prefix[end] - prefix[start-1];
                
                if(currSum > maxSum) {
                    maxSum = currSum;
                }
                System.out.print("sum of array is = " + currSum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Maximum sum of SubArray is : " +maxSum );
    }
}

