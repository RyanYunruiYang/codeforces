import java.util.*;
import java.io.*;

public class kayakingB {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int n = console.nextInt();

		int[] kayaks = new int[2*n];
		// int type1=0;// (2,3),(4,5),...(2n-2,2n-1)
		// int type2=0;// (1,2),(3,4).... (2n-3,2n-2)
		// int type3=0;// (0,1),(2,3)...(2n-4, 2n-3)

		for (int i=0;i<2*n ;i++ ) {
			int x = console.nextInt();
			kayaks[i] = x;
		}
		Arrays.sort(kayaks);

		// for (int i=0;i<2*n ;i++ ) {
		// 	System.out.print(kayaks[i]+" ");
		// }
		// System.out.println();

		int stable = Integer.MAX_VALUE;
		for (int i=0;i<n ;i++ ) {
			for (int j=i;j<n ;j++ ) {
				int x =0;				
				for (int k=0;k<i ;k++ ) {
					x += kayaks[2*k+1]-kayaks[2*k];
				}
				for (int k=i;k<j ;k++ ) {
					x += kayaks[2*k+2]-kayaks[2*k+1];
				}
				for (int k=j; k<=n-2; k++ ) {
					x += kayaks[2*k+3]-kayaks[2*k+2];
				}
				// System.out.println(x);
				if(x<stable){
					stable = x;
				}
			}

		}
		System.out.println(stable);


	}
}