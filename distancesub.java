import java.util.*;
import java.io.*;

public class distancesub {
	public static void main(String[] Args) {
		Scanner console = new Scanner(System.in);
		int t = console.nextInt();

		for(int i=0; i<t;i++){
			int n = console.nextInt();

			int[] val = new int[n];

			for ( int j = 0; j < n; j++) {
				val[j] = console.nextInt();
			}
			int k = 0;

			ArrayList<Integer> locals = new ArrayList<Integer>();

			for ( int j = 0; j < n; j++) {
				boolean x = (val[(j+(n-1))%n] > val[j]);
				boolean y = (val[j]< val[(j+1)%n]);				
				if (j==0) {
					k++;
					locals.add(val[j]);
				}
				else if (j==n-1) {
					k++;
					locals.add(val[j]);

				}
				else{
					if (x==y){
						k++;
						locals.add(val[j]);
					}	
				}
				
			}
			System.out.println(k);
			for (int r = 0; r <k ;r++ ) {
				System.out.print(locals.get(r)+" ");
			}
			System.out.println();


		}
	}


}