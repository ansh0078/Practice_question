public class Problem {
    static void printInc(int num){
        if(num == 1){
            System.out.println(num);
            return;
        }
        printInc(num-1);
        System.out.println(num+" ");
    }
    static int fact(int n){
        if (n == 1) {
            return 1;
        }
        int fn_1 = fact(n-1);
        int fn = n * fact(n-1);
        return fn;
    }
    static int sumNatural(int n){
        if (n == 1) {
            return 1;
        }
        int sum = n + sumNatural(n-1);
        return sum;
    }
    static int fib(int n){
        if (n == 0 || n == 1) {
            return n;
        }
        int fn_1 = fib(n-1);
        int fn_2 = fib(n-2);
        return fn_1 + fn_2;
    }
    static boolean isSorted(int arr[], int i) {
        if(i == arr.length-1){
            return true;
        }
        if (arr[i] > arr[i+1]) {
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int num = 5;
        // printInc(num);
        // System.err.println(fact(num));
        // System.out.println(sumNatural(num));
        // System.out.println(fib(num));
        int arr [] = {1, 2, 4, 5, 8};
        int i = arr[0];
        System.out.println(isSorted(arr, i));
        
   } 
}
