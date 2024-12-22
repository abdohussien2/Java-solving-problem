import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudent = scanner.nextInt();
        int numberOfPuzzle = scanner.nextInt();
        int [] quantitiesOfPieces = new int [numberOfPuzzle];
           for (int i = 0; i < numberOfPuzzle; i++) {
               quantitiesOfPieces[i] = scanner.nextInt();
 
        }
           Arrays.sort(quantitiesOfPieces);
           int miniDifference = Integer.MAX_VALUE;
           for(int i = 0; i <=numberOfPuzzle -numberOfStudent  ; i++) {
               int currentDifference = quantitiesOfPieces[i+numberOfStudent-1]- quantitiesOfPieces[i];
               miniDifference = Math.min(miniDifference,currentDifference);
           }
        System.out.println(miniDifference);
    }
}
