import java.util.Scanner;

public class Array {
    static boolean isSearch(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[i][j] == key) {
                    System.out.println("found at cell is (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("key not founded");
        return false;
    }

    static int findLargest (int matrix[] []) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
           for (int j = 0; j < matrix.length; j++) {
               if(matrix[i][j] > max) {
                  max = matrix[i][j];
                }
           } 
        }
        return max;
    }
    static int findSmallest (int matrix[] []) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
           for (int j = 0; j < matrix.length; j++) {
               if(matrix[i][j] < min) {
                  min = matrix[i][j];
                }
           } 
        }
        return min;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // int matrix [] [] = new int[3][3];

        int matrix [] [] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // taking input to user
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix.length; j++) {
        //         matrix [i] [j] = sc.nextInt();
        //     }
        // }

        // for output....

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        isSearch(matrix, 3);
        System.out.println("largest value is : "+findLargest(matrix));
        System.out.println("Smallest value is : " +findSmallest(matrix));
    }
}
