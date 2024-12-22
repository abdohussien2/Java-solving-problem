 
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(swapping(sc.nextInt(), sc.nextInt()));
    }
    public static String swapping (int x , int y){
        return y + " " + x ;
    }
 
}
