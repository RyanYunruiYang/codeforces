import java.util.*;
import java.io.*;

public class excellent{
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
    static int nCr(int n, int r, int p)
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
    public static long func(int n, int k ,int l, int r) {
        int pr = 1000000007;
        long total = 0;
        int min = Math.min(1-l, r-n);
        int max = Math.max(1-l, r-n);
        total += (min * nCr(n,k,pr)) % pr;

        total += nCr(n,k-1,pr) - nCr(n-min,k-min-1,pr);
        total = total %pr;
        for (int d=max+1;d+l<=r-d ;d++ ) {
            total = (total+nCr(r-l-2*d+1,max-min,pr))%pr;
        } 
        return total;      
    }
    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in);
        int t = console.nextInt();
        long pr = 1000000007;

        for(int o=0; o< t; o++){
            int n = console.nextInt();
            int l = console.nextInt();
            int r = console.nextInt();

            //on rhs, first (R-n) are free
            //on lhs, first (1-L) are free
            long x = 0;
            if(n%2 ==0){
                int k = n/2;
                x = func(n,k,l,r)%pr;
            }
            if(n%2 ==1){
                int k=n/2;
                x = (func(n,k,l,r)+func(n,k+1,l,r)) %pr;
            }
            System.out.println(x);

        }
    }
}