import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int q=scanner.nextInt();
         scanner.nextLine();
         String s = scanner.nextLine();
         String key = "PgEfTYaWGHjDAmxQqFLRpCJBownyUKZXkbvzIdshurMilNSVOtec#@_!=.+-*/";
         String original = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
 
        HashMap<Character, Character> encryptMap = new HashMap<>();
        HashMap<Character, Character> decryptMap = new HashMap<>();
        for(int i = 0; i < key.length(); i++) {
            encryptMap.put(original.charAt(i), key.charAt(i));
            decryptMap.put(key.charAt(i), original.charAt(i));
        }
 
        StringBuilder result = new StringBuilder();
        if(q==1) {
            for(char c :s.toCharArray()){
                result.append(encryptMap.getOrDefault(c,c));
            }
        } else if(q==2) {
            for(char c :s.toCharArray()){
                result.append(decryptMap.getOrDefault(c,c));
            }
        }
        System.out.println(result.toString());
 
    }
 
 
 
}
