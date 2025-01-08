import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        String s = scanner.next();
        scanner.close();
        char lastChar = '\0';
        int maxSize=0;
 
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
 
            if(c != lastChar){   
                maxSize++;
                lastChar = c;
            }
        }
          System.out.println(maxSize);
 
        }
    }
