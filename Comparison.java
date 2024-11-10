import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt(); String S =scanner.next() ; int B=scanner.nextInt();
        if (A > B){
            switch (S) {
                case ">":
                    System.out.println("Right");
                    break;
                    case "<":
                        System.out.println("Wrong");
                        break;
                    case "=":
                        System.out.println("Wrong");
                        break;
            }
        }
        else if( A<B) {
            switch (S) {
                case ">":
                    System.out.println("Wrong");
                    break;
                case "<":
                    System.out.println("Right");
                    break;
                case "=":
                    System.out.println("Wrong");
                    break;
            }
        }
        else if( A==B) {
                switch (S) {
                    case "=":
                        System.out.println("Right");
                        break;
                    case "<":
                        System.out.println("Wrong");
                        break;
                    case ">":
                        System.out.println("Wrong");
                        break;

                }
            }

    }
}
