
import java.io.*;
import java.util.*;

public class Dbest {
	static boolean isPrime(int n) {
	    if (n <= 1)
	        return false;
	    else if (n == 2)
	        return true;

	    else if (n % 2 == 0)
	        return false;

	    for (int i = 3; i <= Math.sqrt(n); i += 2)
	    {
	        if (n % i == 0)
	            return false;
	    }
	    return true;
	}
	static int isPrimePower(int n) {
		int sp = -1;
	    if (n % 2 == 0)
	        sp = 2;

	    for (int i = 3; i <= Math.sqrt(n); i += 2)
	    {
	        if (n % i == 0)
	            sp = i;
	    }
	    if(sp == -1) {
	    	return n;
	    }
	    while(n%sp == 0) {
	    	n=n/sp;
	    }
	    if (n==1) {
	    	return sp;
	    }
	    else {
	    	return -1;
	    }

	}

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int t = console.nextInt();


		for (int o=0;o<t ;o++ ) {
			int x = console.nextInt();
			int d = console.nextInt();
			// System.out.println("x: "+ x+ " d: "+ d);
			
			boolean special = true;
			// System.out.println(isPrimePower(d));

			if(isPrimePower(d) >0 ){//d is prime power
				int sp = isPrimePower(d);
				int k1= 0;
				int k2 = 0;

				int n = x;
				while(n%sp==0) {
					n= n/sp;
					k1++;
				}
				int dtemp = d;
				while(dtemp%sp==0){
					dtemp = dtemp/sp;
					k2++;
				}

				// System.out.println(d + "= " + sp +"^"+ k2);
				// System.out.println(x + "= " + sp + "^" + k1 + "*" + n);

				if(k2==1) {
					special = !(isPrime(n) || n==1);
				}
				if(k2==2) {
					if(k1==4) {
						special = !(isPrime(n) || n==1);											
					}
					if(k1==5 || k1==7) {
						special = (n>1);
					}
				}
				if(k2>=3) {
					if(k1==2*k2) {
						special = !(isPrime(n) || n==1);
					}
					if(k1==2*k2+1){
						special = (n>1);
					}
				}

			}
			else {
				int n = x/(d*d);
				special = !(isPrime(n) || n==1);
			}
			
			if(x%d*d != 0){
				special = false;
			}			
			
			if(special){
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}				


		}
	}
}


		// int large = 1000111222;
		// boolean[] v = new boolean[large];
		// int[] sp = new int[large];

		// for (int i = 2; i < large; i += 2) {
		// 	sp[i] = 2;//even numbers have smallest prime factor 2
		// }
		// for (int i = 3; i < large; i += 2){
		// 	if (!v[i]){
		// 		sp[i] = i;
		// 		for (int j = i; (j*i) < large; j += 2){
		// 			if (!v[j*i]) {
		// 				v[j*i] = true;
		// 				sp[j*i] = i;
		// 			}
		// 		}
		// 	}
		// }