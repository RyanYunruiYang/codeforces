import java.util.*;
import java.io.*;

public class strange {
    public static void debug(int x) {
        if(false){
            System.out.println(x);

        }
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int t = console.nextInt();  
        int c =10*10*10*10*10+1;

        for (int o=0;o<t ;o++ ) {
            int n = console.nextInt();
                 
            int[] oriOdd = new int[c];
            int[] oriEven = new int[c];

            int[] sortOdd = new int[c];
            int[] sortEven = new int[c];


            Friend[] vals = new Friend[n];            
            for (int u=0;u<n ;u++ ) {
                int x = console.nextInt();
                debug(x);
                Friend f = new Friend(u,x);
                vals[u] = f;
                if (u%2==0) {
                    oriEven[x]++;//4,2
                }
                else {
                    oriOdd[x]++;//3,5
                }
            }
            Arrays.sort(vals);
            for (int i=0;i<n ;i++ ) {
                int x = vals[i].a;
                debug(x);
                if (i%2==0) {
                    sortEven[x]++;//2,4
                }
                else {
                    sortOdd[x]++;//3,5
                }                
            }

            boolean works = true;
            for (int i=0;i<c ;i++ ) {

                if (oriOdd[i]!=sortOdd[i]) {
                    works= false;
                }
                if (oriEven[i]!=sortEven[i]) {
                    works= false;
                }            
            }
            if (works) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }




        }    
    }
}
class Friend implements Comparable<Friend>{
    public int a;
    public int i;

    public Friend(int x, int y) {
        i = x;
        a = y;
    }
    @Override
    public int compareTo(Friend o) {
        return this.a-o.a;
    }    
}