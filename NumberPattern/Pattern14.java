package NumberPattern;

public class Pattern14 {
    public static void main(String[] args) {
        int rows = 7, i, j;
        for (i = rows; i >= 1; i--) {
            for (j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
