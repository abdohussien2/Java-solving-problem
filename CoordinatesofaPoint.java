import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double  x = scanner.nextDouble(), y = scanner.nextDouble();
        if( y== 0 && x != 0) {
            System.out.println("Eixo X");
        } else if( x==0 && y != 0) {
            System.out.println("Eixo Y");
        } else if(x==0 && y==0) {
            System.out.println("Origem");
        }
         else if(x >0 && y >0) {
             System.out.println("Q1");
        }else if(x >0 && y <0){
            System.out.println("Q4");
        }else if(x <0 && y >0){
            System.out.println("Q2");
        }else if(x <0 && y<0){
            System.out.println("Q3");

        }


    }
}
