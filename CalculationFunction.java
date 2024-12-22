import java.util.Scanner;
 
public class CalculateF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        scanner.close();
 
        long result;
        if (n % 2 == 0) {
            result = n / 2;
        } else {
            result = - (n + 1) / 2;
        }
 
        System.out.println(result);
    }
}
