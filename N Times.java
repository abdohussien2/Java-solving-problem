import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
            for (int i = 0; i < t; i++) {
 
                int N = scanner.nextInt(); char C = scanner.next().charAt(0);
 
                String result = PrintChar(N, C);
                System.out.println(result);
 
            }
        }
 
 
    public static String PrintChar(int N, char C) {
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < N; i++) {
            line.append(C);
            if (i < N - 1) {
                line.append(" ");
            }
        }
        return line.toString();
 
    }
}
