import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num1 = scan.nextLong() , num2 = scan.nextLong();
        long x = num1%10;
        long y = num2%10;
        long result = x+y;
        System.out.println(result);
 
    }
}
