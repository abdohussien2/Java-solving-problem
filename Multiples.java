
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt(), num2 = scan.nextInt();
        if (num1 % num2==0 || num2 % num1 ==0) {
            System.out.println("Multiples");
 
        }else {
            System.out.println("No Multiples");
        }
    }
}
