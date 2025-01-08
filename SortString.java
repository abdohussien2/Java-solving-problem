
import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        String s = scanner.next();
        char [] arr = new char[n];
        for(int i=0;i<n;i++) {
            arr[i]=s.charAt(i);
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]);
        }
 
        }
    }
