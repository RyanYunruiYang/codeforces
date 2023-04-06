import java.util.*;
import java.io.*;
public class steal {
    // public static int[] toArray(String s)
    // {

    // }
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int t = console.nextInt();    
        for (int o=0;o<t ;o++ ) {
            int n = console.nextInt();
            int m = console.nextInt();

            int[] vals = new int[m];            
            for (int u=0;u<n ;u++ ) {
                String w = console.next();
                for (int i=0;i<m ;i++ ) {
                    char x = w.charAt(i);
                    int y = x;
                    vals[i] += y;
                }
            }
            for (int u=0;u<n-1 ;u++ ) {
                String w = console.next();
                for (int i=0;i<m ;i++ ) {
                    char x = w.charAt(i);
                    int y = x;
                    vals[i] -= y;
                }
            }
            for (int i=0;i<m ;i++ ) {
                int x = vals[i];
                System.out.print((char) x);
            }
            System.out.println();




        }    
    }
}
