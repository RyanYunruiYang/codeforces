import java.util.*;
import java.io.*;

public class chess {
    static int power(long x, long y, int p)
    {
        long res = 1;
        x = x % p;
        while (y > 0) {
            if (y % 2 == 1)
                res = (res *x) %p;

            y = y/2;
            x = (x * x) % p; //square
        }
        return (int) res;
    }
    static int modInverse(long n, int p)// Returns n^(-1) mod p
    {
        return power(n, p - 2, p);
    }
    static int nCrModPFermat(int n, int r, int p)
    {
        if (n<r){
            return 0;
        }
        if (r == 0)
            return 1;
 
        long[] fact = new long[n + 1];
        fact[0] = 1;
 
        for (int i = 1; i <= n; i++)
            fact[i] = (fact[i - 1] * i) % p;
 
        return (int) (fact[n] * modInverse(fact[r], p)
                % p * modInverse(fact[n - r], p)
                % p)
            % p;
    } 

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int t = console.nextInt();  
        for (int o=0;o<t ;o++ ) {
            int n = console.nextInt();
            String board = console.next();
            
            int numzero = 0;
            int pairs = 0;
            long onerun = 0;
            for (int i=0;i<n ;i++ ) {
                char c = board.charAt(i);
                int x = c-48;
                if(x==0){
                    numzero += 1;
                    pairs += onerun/2;
                    onerun=0;
                }
                if(x==1){
                    onerun +=1;
                }
            }
            pairs+= onerun/2;
            // System.out.prlongln(numzero+pairs + " " + numzero);

            System.out.println(nCrModPFermat(numzero+pairs,numzero,998244353));
        }    
    }
}
