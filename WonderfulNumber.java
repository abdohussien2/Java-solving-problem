import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        if(isOdd(n) && palindrome(n)) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
 
    public static boolean isOdd(int n) {
        return n % 2 != 0;
          
    }
 
    public static boolean palindrome(int n) {
         String binary = Integer.toBinaryString(n);
         int left= 0 , right = binary.length()-1;
         while (left < right) {
             if (binary.charAt(left) != binary.charAt(right)) {
                 return false;
             }
             left++ ;
             right--;        
         }
         return true;
    }
}
