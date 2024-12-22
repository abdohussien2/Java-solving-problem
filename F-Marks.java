import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String[] grades = new String[n];
        for (int i = 0; i < n; i++) {
            grades[i] = scanner.next();
        }
        int[] maxMarks = new int[m];
        for (int j = 0; j < m; j++) {
            int maxMark = 0;
            for (int i = 0; i < n; i++) {
                int mark = grades[i].charAt(j) - '0';
                if (mark > maxMark) {
                    maxMark = mark;
                }
            }
            maxMarks[j] = maxMark;
        }
        boolean[] successful = new boolean[n];
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                int mark = grades[i].charAt(j) - '0';
                if (mark == maxMarks[j]) {
                    successful[i] = true;
                }
            }
        }
        int successfulCount = 0;
        for (boolean isSuccessfull : successful) {
            if (isSuccessfull) {
                successfulCount++;
            }
        }
 
        
        System.out.println(successfulCount);
 
        scanner.close();
    }
}        
