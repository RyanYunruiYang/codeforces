import java.util.*;
import java.io.*;



public class stabilize {
    public static int gcd(int a, int b)
    {
        if (b==0) {
            return a;
        }
        else{
            return gcd(b,a%b);
        }
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int q = console.nextInt();    
        for (int j=0;j<q ;j++ ) {
            int n = console.nextInt();

            int[] a= new int[n];
            a[0] = console.nextInt();
            int gcd = a[0];
            int max = a[0];

            for (int i=1;i<n ;i++ ) {
                a[i] = console.nextInt();
                if(a[i]>max){
                    max = a[i];
                }
                gcd = gcd(gcd,a[i]);
            }

            for (int i=0;i<n ;i++ ) {
                a[i] = a[i]/gcd;
            }
            max = max/gcd;
            
            int maxrun = 0;
            for (int p=1;p<=max+1 ;p++ ) {
                int run = 0;
                for (int k=0;k<2*n+3 ;k++ ) {
                    if((a[k%n]%p) == 0){
                        run++;
                    }
                    else{
                        if(run>maxrun){
                            maxrun = run;
                        }
                        run = 0;
                    }
                }
            }
            System.out.println(maxrun);


        }    
    }
}
