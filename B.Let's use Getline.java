
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        String s = scanner.nextLine();
 
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '\\') {
                break; 
            }
            result.append(c); 
        }
 
       
        System.out.println(result.toString());
 
        scanner.close();
    }
}
