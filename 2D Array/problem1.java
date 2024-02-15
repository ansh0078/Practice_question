public class problem1 {
    public static void main(String[] args) {
        int arr[][] = {
        {1,2,3},
        {4,5,6}, 
        {7,8,9}
        /* {7,4,1}
         * {8,5,2}
         * {9,6,3}
         */
        };
        int row = arr.length;
        int col = arr[0].length;
        int arrr [][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arrr[j][i] = arr[i][j];
            }
        }
        for (int i = 0; i < arrr.length; i++) {
            arr[i][0] = arrr[i][2];
            arr[i][2] = arrr[i][0];
            arrr[i][2] = arr[i][2];
            arrr[i][0] =arr[i][0];
        }
        

        for (int i = 0; i < arrr.length; i++) {
            for (int j = 0; j < arrr.length; j++) {
                System.out.print(arrr[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
