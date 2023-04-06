import java.util.Scanner;

public class E_chainchips { 
    public static void main(String[] args){
        // System.out.println("hello");
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int[] a = new int[n-1];
        for(int i=0; i<n-1; i++) { 
            a[i] = console.nextInt();
        }
        
        int q = console.nextInt();

        for(int j=0; j<q; j++){
            int k = console.nextInt();
            int x = console.nextInt();
            a[k-1] = x;
            solve(a);
        }
    }
    public static void solve(int[] a){
        // for(int i=0; i<a.length; i++){
        //     System.out.print(a[i] +" ");
        // }
        // System.out.println();
        int n = a.length;
        int[] dp = new int[n];
        dp[0] = a[0];
        dp[1] = a[0] + a[1];
        dp[2] = a[0] + a[2];
        for(int i=3; i<n; i++){
            dp[i] = Math.min(dp[i-3]+a[i-1]+a[i], dp[i-2]+a[i]);
        }

        System.out.println(2*dp[n-1]);
    }
}