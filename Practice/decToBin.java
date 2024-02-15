public class decToBin {

    static void decToBin(int a) {
        int mynum = a;
        int pow = 0;
        int binNum = 0;
        while (mynum > 0) {
            int rem = mynum % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));

            pow++;
            mynum /= 2;
        }
        System.out.println("Binary from to "+ a + " : " + binNum);
    }

    public static void main(String[] args) {
        decToBin(12);
    }
}