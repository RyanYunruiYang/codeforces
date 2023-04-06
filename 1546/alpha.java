import java.util.*;
import java.io.*;
public class alpha {
    // public static int gcd(int a, int b)
    // {
    //     if (b==0) {
    //         return a;
    //     }
    //     else{
    //         return gcd(b,a%b);
    //     }
    // }
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int q = console.nextInt();    
        for (int o=0;o<q ;o++ ) {
            int n = console.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            int signsum = 0;
            int bsum = 0;
            for (int i=0;i<n ;i++ ) {
                a[i] = console.nextInt();
                signsum += a[i];
            }
            boolean allequal = true;
            for (int i=0;i<n ;i++ ) {
                b[i] = console.nextInt();
                if (b[i]!=a[i]) {
                    allequal = false;
                }
                bsum += b[i];
            }
            int minpos = 0;
            if(!allequal){
                if (signsum == bsum) {
                    System.out.println(bsum);
                    for (int j =0;j<n ;j++ ) {
                        for (int k=0;k<a[j] ;k++ ) {
                            if(b[minpos]>0){
                                System.out.println((j+1) + " " +(minpos+1));
                                b[minpos]--;
                            }
                            else {
                                while(b[minpos]==0){
                                    minpos++;
                                }
                                System.out.println((j+1) + " " +(minpos+1));
                                b[minpos]--;

                            }
                        }
                    }

                }

                else {
                    System.out.println(-1);
                } 
            }
            else{
                System.out.println(0);
            } 


        }    
    }
}
