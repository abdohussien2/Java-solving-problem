import java.util.Scanner;
 
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if(ch == ',') {
                result.append(" ");
            } else if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch);
            }
 
        }
        System.out.println(result.toString());
 
    }
}
