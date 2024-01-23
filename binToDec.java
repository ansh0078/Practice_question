public class binToDec {

    public static void binToDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        while (myNum > 0) {
            int lastNum = myNum % 10;
            decNum = decNum + (lastNum * (int)Math.pow(2, pow));
            pow++;
            myNum /= 10;
        }
        System.out.println("Decimal of " + binNum + " : " + decNum);
    }
   
    public static void main(String[] args) {
        binToDec(101);
    }
}