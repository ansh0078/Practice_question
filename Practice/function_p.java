import java.util.Scanner;

public class function_p {
    // public static int printHelloWorld() {
    //     System.out.println("Hello World");
    //     System.out.println("jdkhdkjh");
    //     return 3;
    // }
    // public static int multiply(int a, int b){
    //     return a*b;
    // }
    public static int factorial(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
            // res += fact;
        }
        return fact;
    }
    public static int binCoeff(int n, int r) {
        int na = factorial(n);
        int ra = factorial(r);
        int s = factorial(n-r);
        int res = na/(ra*s);
        return res;
    }
    public static void main(String[] args) {
        // printHelloWorld();
        // System.out.println(multiply(5, 3));
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int r = sc.nextInt();
        // int s = n-r;
    
        System.out.println(binCoeff(5, 2));
    }
}
