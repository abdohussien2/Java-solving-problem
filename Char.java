import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       char c = sc.next().charAt(0);
        if(c >= 65 && c <= 90 ){
            System.out.println((char) (c + 32));
        } else if (c >= 97 && c <= 122) {
            System.out.println((char) (c - 32));
        }
 
    }
}
