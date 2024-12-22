import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double [] arr = new double[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }
        average(arr);
    }
      public static void average(double [] arr) {
        double sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
          System.out.printf("%.7f",sum/arr.length );
 
      }
 
}
