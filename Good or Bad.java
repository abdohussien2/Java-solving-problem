import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
 
        for (int i = 0; i <n; i++) {
            String s = scanner.next();
            if(s.contains("010") || s.contains("101")) {
                System.out.println("Good");
            } else {
                System.out.println("Bad");
            }
        }
    }
}
