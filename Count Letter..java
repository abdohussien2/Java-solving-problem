import java.io.BufferedReader;
 
import java.io.InputStreamReader;
 
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //using buffer-reader to decrease memory usage 
        String s = reader.readLine();
          int letterCount [] = new int [26] ;
           for ( int i = 0 ; i<s.length() ; i++ ) {
               letterCount[s.charAt(i) - 'a']++;
           }
           for (int i = 0; i < 26 ; i++) {
               if(letterCount[i] > 0) {
                   char letter = (char) (i + 'a');
                   System.out.println(letter + " : " + letterCount[i]);
               }
           }
 
 
          }
    }
