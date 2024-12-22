import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt() , b = scanner.nextInt();    
        int years=0;
       while(a<=b) {    
           years++;  
           a=a*3;  
           b=b*2;  
 
       }
       System.out.println(years);
 
    }
}
