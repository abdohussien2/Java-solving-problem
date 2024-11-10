import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String F1 = scan.next() , S1 = scan.next();
        String F2 = scan.next() , S2 = scan.next();
        if(S1.equals(S2)){
            System.out.println("ARE Brothers");
        } else {
            System.out.println("NOT");
        }
 
        }
    }
