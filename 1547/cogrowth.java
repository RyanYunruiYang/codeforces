import java.util.*;
import java.io.*;

public class cogrowth {
    public static int getBit(int a, int b) {
        return (a >> b) & 1;
    } 

    public static int solve(int a, int b){//returns smallest y such that x(+)y majorizes z
        if(b==0) {
            return 0;
        }
        if(a==b){
            return 0;
            // int k=0;

            // while(true){
            //     if(getBit(a,k)==0) {
            //         return (int) Math.pow(2, k);
            //     }
            //     k++;
            // }
        }

        return (a|b)-a;
    }//solve(x,0)=0

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int t = console.nextInt();    
        for (int j=0;j<t ;j++ ) {
            int n = console.nextInt();

            int x =0;
            int y=0;
            int z =0;

            for (int i=0;i<n ;i++ ) {//greed is good
                x = console.nextInt();
                // System.out.println(x[i]);

                y = solve(x,z);

                System.out.print(y + " ");

                z = x^y;
            }

            System.out.println();

        }    
    }
}
