import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String B = scanner.next();
        String C = A + B ;
        char a = A.charAt(0);
        char b = B.charAt(0);
        int A_size=A.length();
        int B_size=B.length();
        String New_A = b + A.substring(1,A_size);
        String New_B = a + B.substring(1,B_size);
        System.out.println(A_size + " " + B_size);
        System.out.println(C);
        System.out.println(New_A + " " + New_B);
 
    }
}
