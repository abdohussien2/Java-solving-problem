import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong(), b = scan.nextLong(), c = scan.nextLong();
        if (a >= b && a >= c && c >= b) {
            System.out.println(b + " " + a);
        } else if (b >= c && b >= a && a >= c) {
            System.out.println(c + " " + b);
        } else if (c >= b && c >= a && a >= b) {
            System.out.println(b + " " + c);
        } else if (a >= b && a >= c && b >= c) {
            System.out.println(c + " " + a);
        } else if (b >= c && b >= a && c >= a) {
            System.out.println(a + " " + b);
        } else if (c >= b && c >= a && b >= a) {
            System.out.println(a + " " + c);
        }
        }
    }
