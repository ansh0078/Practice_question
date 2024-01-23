public class Patterns {
    public static void hollow_rectangle(int tolRows, int tolCols){
        for(int i = 1; i <= tolRows; i++){
            for(int j = 1; j <= tolCols; j++){
                if(i == 1 || i == tolRows || j == 1 || j == tolCols){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void inverted_rotatea_half_pyramid(int n ){
        for(int i = 1; i <= n; i++ ) {
            for(int j = 1; j <= n-i; j++ ){
                System.out.print("   ");
            }
            for(int k = 1; k <= i; k++ ) {
                System.out.print(" * ");
            }
            System.err.println();
        }
    }
    public static void half_pyramid_with_number(int n) {
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void floyds_traingle(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(counter+ " ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void odd_even_triangle(int n) {
        for(int i =1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                if((i+j) % 2 == 0){
                    System.out.print(1+ " ");
                }
                else {
                    System.out.print(0+ " ");
                }
            }
            System.out.println();
        }
    }
    public static void butterfly_pattern(int n) {
        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            for(int j = 1; j <= 2*(n-i); j++) {
                System.out.print("   ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i = n; i >= 1; i--){

            for(int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            for(int j = 1; j <= 2*(n-i); j++) {
                System.out.print("   ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void rhombus(int n){
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i; j++) {
                System.out.print("   ");
            }
            for(int j = 1; j <= n; j++){
                System.out.print(" * ");
                
            }
            System.out.println();
        }
    }
    public static void hollow_rhombus(int n){
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i; j++) {
                System.out.print("   ");
            }
            for(int j = 1; j <= n; j++){
                if(i == 1 || i == n|| j == 1 || j==n ){
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void diamond(int n) {
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= (n-i); j++) {
                System.out.print("   ");
            }
            for(int j = 1; j <= (2*i)-1; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for(int j = 1; j <= (n-i); j++) {
                System.out.print("   ");
            }
            for(int j = 1; j <= (2*i)-1; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // hollow_rectangle(10, 10);
        // inverted_rotatea_half_pyramid(5);
        // half_pyramid_with_number(4);
        // floyds_traingle(5);
        // odd_even_triangle(4);
        // butterfly_pattern(10);
        // rhombus(5);
        // hollow_rhombus(10);
        diamond(5);
    }
}
