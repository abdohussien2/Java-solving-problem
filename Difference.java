import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long x = scan.nextLong(), y = scan.nextLong(), z = scan.nextLong(), f = scan.nextLong();
        long result = (x * y)-(z * f);
        System.out.println("Difference = " + result);
 
    }
}
