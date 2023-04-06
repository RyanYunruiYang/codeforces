import java.util.*;
import java.io.*;

public class a{

	// public static int solve(int xA, int yA, int xB, int yB, int xF, int yF) {	
	// }

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int t = console.nextInt();

		for(int o=0; o< t; o++){
			int n = console.nextInt();
			int max = -Integer.MAX_VALUE;
			double total = 0;

			for (int i=0;i<n ;i++ ) {
				int x= console.nextInt();
				// System.out.println((1.0*x)/(n-1));
				total += (1.0*x)/(n-1);
				if(x>max) {
					max = x;
				}
			}
			// System.out.println("max: "+max);
			// System.out.println("total: "+total);

			if(n>=2){
				System.out.println(total + max*(1.0- 1.0/(n-1.0)));
			}


			

		}
	}
}