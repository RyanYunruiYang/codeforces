import java.util.*;
import java.io.*;

public class pair{

	// public static boolean solve(int x, String s) {
	// }

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int t = console.nextInt();
		for(int p=0; p< t; p++){
			int k =console.nextInt();
			int n =console.nextInt();
			int m =console.nextInt();

			int[] a = new int[n];
			int top = 0;
			int[] b = new int[m];
			int bot = 0;

			int[] moves = new int[n+m];
			int ind = 0;

			for (int i=0;i<n ;i++ ) {
				a[i] = console.nextInt();
			}
			for(int i=0; i<m; i++) {
				b[i] = console.nextInt();
			}

			boolean failed = false;
			while(top+bot < n+m) {
				boolean succ = false;

				if (top<n) {
					if(a[top]<=k){
						succ = true;
						if(a[top]==0){
							k++;
						}
						moves[ind]=a[top];
						ind++;

						top++;						
					}

				}

				if(bot<m) {
					if(b[bot]<=k) {
						succ = true;
						if(b[bot] ==0){
							k++;
						}
						
						moves[ind]=b[bot];
						ind++;	

						bot++;						
					}

				}
				if(!succ){
					System.out.println(-1);
					failed= true;
					break;
				}
			}

			if(!failed){		
				for (int i=0;i<n+m ;i++ ) {
					System.out.print(moves[i]+" ");
				}
				System.out.println();
			}




		}
	}
}