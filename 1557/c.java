import java.util.*;
import java.io.*;

public class c{

	public static long f(int n){
		long pow = 1;
		for (int i=0;i<n ;i++ ) {
			pow = (2*pow)%(1000000007);
		}
		return pow;
	}

	public static long recurse(int n, int k){
		if(k==0){
			return 1;
		}
		if(k==1){
			return f(n-1);
		}
		return (f(n*(k-1))%1000000007)+ ((f(n-1)-1)%1000000007)*(recurse(n,k-1)%1000000007);
	} 

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int t = console.nextInt();

		for(int o=0; o< t; o++){
			int n = console.nextInt();
			int k = console.nextInt();

			long x = f(n-1);

			if(n%2==1){
				long po = 1;
				for (int i=0;i<k ;i++ ) {
					po = (po*(x+1))%(1000000007);
				}
				System.out.println(po);
			}
			if(n%2==0){
				System.out.println(recurse(n,k));
			}

		}
	}
}