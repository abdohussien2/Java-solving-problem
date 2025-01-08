 
import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S=scanner.nextLine();
        scanner.close();
        String x="hello";
        int targetIndex=0;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i) == x.charAt(targetIndex)){
                targetIndex++;
            if(targetIndex==x.length()){
                System.out.println("YES");
                return;
            }
            }
        }
        System.out.println("NO");
    }
 
}
