import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        String [] numbers = S.split("\\+");
        Arrays.sort(numbers);
        System.out.println(String.join("+", numbers));
         
    }
}
