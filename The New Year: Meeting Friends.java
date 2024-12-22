import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
          int [] arr = new int[3];
          arr[0] = scanner.nextInt();
          arr[1] = scanner.nextInt();
          arr[2] = scanner.nextInt();
        Arrays.sort(arr);
        int sum =0;
        int sum1 = arr[2] - arr[1] ;
        int sum2 = arr[1] - arr[0];
        sum = sum1 + sum2;
        System.out.println(sum);
    }
}
