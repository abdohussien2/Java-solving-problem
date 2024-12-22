import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long  n = sc.nextInt() , a=sc.nextInt() , b=sc.nextInt() , c=sc.nextInt() ;
        long result =0;
        for(int i = 0; i<=n ; i++) {
            for(int j = 0; j<=n ; j++) {
                long k = (n-a*i - b*j)/c;
                if (k <0)  k=0;
                if((a*i) + (b*j )+ (c*k) ==n) {
                    result= Math.max(result,i+j+k);
                }
            }
        }
        System.out.println(result);
    }
}
