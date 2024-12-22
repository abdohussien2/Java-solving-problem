import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFun(n);
 
    }
    static void printFun(int n) {
         if (n==0) {
             return;
         }
         printFun(n-1);
         System.out.println(n);
 
    }
}
//using Recursion
