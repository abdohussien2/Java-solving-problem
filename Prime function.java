import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        StringBuilder result = new StringBuilder();
        while (t-- > 0) {
            long n = scanner.nextLong(); 
            if (isPrime(n)) {
                result.append("YES\n");
            } else {
                result.append("NO\n");
            }
        }
 
        System.out.print(result.toString());
        scanner.close();
 
    }
 
 
    public static boolean isPrime(long n) {
        if (n <= 1) return false; 
        if (n <= 3) return true; 
        if (n % 2 == 0 || n % 3 == 0) return false;
 
        for (long i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}
