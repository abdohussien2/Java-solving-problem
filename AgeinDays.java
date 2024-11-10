import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int N =scanner.nextInt();  //370
         int year = N/365; //370/365
         N -= year*365;
         int month = N/30;
         N -= month*30;
        System.out.println(year + " years");
        System.out.println(month+ " months");
        System.out.println(N+ " days");



    }
}
