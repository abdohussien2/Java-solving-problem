import java.util.Scanner;
 
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        for(int i=0;i<n;i++){
            String s = scanner.next();
            int lenght = s.length();
            if(lenght <= 10 ) {
                System.out.println(s);
            } else {
                System.out.println(s.charAt(0) +""+  ( s.length() - 2)  + "" + s.charAt(lenght - 1) );
            }
        }
    }
}
