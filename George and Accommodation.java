import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int counter = 0;
         for(int i = 1; i <= N; i++) {
             int p=scanner.nextInt();
             int q=scanner.nextInt();
             if(q-p >=2) {
                 counter++;
             }
 
         }
        System.out.println(counter);
 
    }
}
