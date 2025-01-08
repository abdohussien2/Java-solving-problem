import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         String s=scanner.nextLine();
        String [] words = s.split(" ");
 
        StringBuilder result = new StringBuilder();
 
        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
 
            result.append(reversedWord).append(" ");
        }
 
        System.out.println(result.toString().trim());
 
    }
    }
