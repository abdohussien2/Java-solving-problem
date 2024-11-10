import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long x = scan.nextLong();
        long y = x*(x+1)/2;
        System.out.println(y);
    }
}
