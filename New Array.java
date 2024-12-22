import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int N = scanner.nextInt();
          int [] A = new int[N];
          int [] B = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        for (int i = 0; i < N; i++) {
            B[i] = scanner.nextInt();}
 
        int[] C = concatenateArrays(A, B);
        for (int i = 0; i < 2 * N; i++) {
            System.out.print(C[i] + " ");}
        
    }
    public static int[] concatenateArrays(int[] A, int[] B) {
        int N = A.length;
        int[] C = new int[2 * N];
        for (int i = 0; i < N; i++) {
            C[i] = B[i];
        }
        for (int i = 0; i < N; i++) {
            C[N + i] = A[i];
        }
        return C;
    }
}
