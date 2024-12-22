import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        System.out.println(longestNonPalindromeLength(S));
 
    }
 
    public static int longestNonPalindromeLength(String S) {
 
        if(!isPalindrome(S)) {
            return S.length();
        }
        if(allCharactersSame(S)){
            return 0;
        }
        return S.length()-1;
 
 
 
 
 
 
    }
 
        public static boolean isPalindrome (String S){
            int n = S.length();
            for (int i = 0; i < n / 2; i++) {
                if (S.charAt(i) != S.charAt(n - i - 1)) {
                    return false;
                }
            }
            return true;
        }
 
 
        public static boolean allCharactersSame (String S){
            char firstChar = S.charAt(0);
            for (int i = 1; i < S.length(); i++) {
                if (S.charAt(i) != firstChar) {
                    return false;
                }
            }
            return true;
        }
 
 
    }
