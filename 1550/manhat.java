import java.util.*;
import java.io.*;

public class manhat{

	// public static int solve(int xA, int yA, int xB, int yB, int xF, int yF) {	
	// }
	public static boolean monotonic(int a, int b, int c){
		if ((a<=b & b<=c)) {
			return true;
		}
		if ((a>=b & b>=c)) {
			return true;
		}
		return false;		
	}
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int t = console.nextInt();

		for(int o=0; o< t; o++){
			int n = console.nextInt();
			int[] a = new int[n];
			for (int i=0;i<n ;i++ ) {
				a[i] = console.nextInt();
			}
			int numsub = n+(n-1);//all arrays with length 1,2 work, contributes n+(n-1)
			//all subarrays with length >=5 fails

			int thr = 0;
			for (int i=0;i<n-2 ;i++ ) {//arrays with length 3: increasing or not
				if(!monotonic(a[i],a[i+1],a[i+2])) {
					thr++;
				}
			}
			// System.out.println("three: " +thr);			
			numsub += thr;

			int fr = 0;
			for (int i=0;i<n-3 ;i++ ) {//arrays with length 3: increasing or not
				if(!monotonic(a[i],a[i+1],a[i+2]) & !monotonic(a[i+1],a[i+2],a[i+3])
					& !monotonic(a[i],a[i+2],a[i+3])& !monotonic(a[i],a[i+1],a[i+3])) {
					fr++;
				}
			}	
			// System.out.println("four: " +fr);			
			numsub += fr;

			System.out.println(numsub);		

		}
	}
}