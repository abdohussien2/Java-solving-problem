 
import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toUpperCase();
 
        int [] frq = new int[26];
 
        for(char c : s.toCharArray()) {
            if(c>='A' && c<='Z') {
                frq[c-'A']++;
            }
        }
        int eCount = frq['E' - 'A'];
        int gCount = frq['G' - 'A'];
        int yCount = frq['Y' - 'A'];
        int pCount = frq['P' - 'A'];
        int tCount = frq['T' - 'A'];
 
        int result = Math.min(Math.min(eCount, gCount) ,Math.min(yCount, Math.min(pCount, tCount)));
        System.out.println(result);
 
 
    }
}
 
