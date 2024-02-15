import java.util.*;

public class spiral1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr [][] = new int[n][m];
        int k = 1;
        int c = n-1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = c; j >= c; j--)
                arr[i][j] = k++;
            for (int j = i+1; j <= c; j++)
                arr[j][i] = k++;
            for (int j = i+1; j <= c; j++)
                arr[c][j] = k++;
            for (int j = c; j > i; j--)
                arr[j][c] = k++;
            c--;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+ " " );
            }
            System.out.println("");
        }
    }
}
