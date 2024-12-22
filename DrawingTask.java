import java.util.Scanner;
 
import static java.lang.Math.min;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt(); int m = scanner.nextInt(); int q = scanner.nextInt();
 
 
 
        char [] [] grid = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = '.';
            }
        }
        for(int i=0 ; i<q ; i++) {
            int r1 = scanner.nextInt() - 1;
            int c1 = scanner.nextInt() - 1;
            int r2 = scanner.nextInt() - 1;
            int c2 = scanner.nextInt() - 1;
            char c = scanner.next().charAt(0);
           int r11 = Math.min(r1, r2);
           int c11 = Math.min(c1, c2);
           int r21 = Math.max(r1, r2);
           int c21 = Math.max(c1, c2);
 
            for(int row=r11 ; row <=r21 ; row++) {
                for(int col=c11 ; col <=c21 ; col++) {
                    grid[row][col] = c;
                }
            }
        }
 
        for ( int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
 
    }
}
