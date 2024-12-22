import java.util.Scanner;
 
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < S.length(); i++) {
            char digitChar = S.charAt(i);
            if (Character.isDigit(digitChar)) {
             sum += Character.getNumericValue(digitChar);
            } else {
                System.out.println("Invalid input");
                return;
            }
        }
        System.out.println(sum);
    }
}
