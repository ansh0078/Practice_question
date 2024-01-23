public class prime {
    // public static boolean isPrime(int a ) {
    //     // boolean isPrime = true;
    //     if( a == 2) {
    //         return true;
            
    //     }
    //     for (int i = 2; i <= a-1; i++) {
    //         if(a % i == 0){
    //             // isPrime = false;
    //             // break;
    //             return false;
    //         }
    //     }
    //     // return isPrime;
    //     return true;
    // }

    public static boolean isPrime(int a) {
        if (a == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if(a % 2 == 0  ) {
                return false;
            }
        }
        return true;
    }
    public static void PrimeInRange(int a){
        for (int i = 2; i <= a; i++) {
            if(isPrime(i)) {
                System.out.print(i +" ");
            }
        }
    }
    public static void main(String[] args) {
        // System.err.println(isPrime(1));
        // PrimeInRange(20);
        
    }
}
