import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
         int a = scanner.nextInt() , b = scanner.nextInt() , c = scanner.nextInt() ;
         int [] numbers = {a, b, c};
          java.util.Arrays.sort(numbers);
        for (int num : numbers) {
            System.out.println(num );
        }
        System.out.println();
        System.out.println(a);
         System.out.println(b);
         System.out.println(c);
        scanner.close();



    }
}
