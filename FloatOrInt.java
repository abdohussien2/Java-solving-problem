import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float  x = scanner.nextFloat();
        if(x == (int) x) {
            System.out.println("int " + (int) x);
        }
        else{
            int integerPart = (int) x;
            float decimalPart = ((x-integerPart));
            System.out.println("float " + integerPart + " " + decimalPart);
        }



    }
}
