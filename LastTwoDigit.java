import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int A = scanner.nextInt() , B = scanner.nextInt(), C = scanner.nextInt() , D = scanner.nextInt();
        
        int result = A % 100;
        
        result = (result * (B % 100)) % 100;
        
        result = (result * (C % 100)) % 100;
        
        result = (result * (D % 100)) % 100; 
        

        
        System.out.println(result);

        scanner.close();
    }
}
