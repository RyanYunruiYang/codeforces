import java.util.*;
import java.io.*;

public class cost{

	// public static int solve(int xA, int yA, int xB, int yB, int xF, int yF) {	
	// }
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int t = console.nextInt();

		for(int o=0; o< t; o++){
			int n = console.nextInt();
			int a = console.nextInt();
			int b = console.nextInt();

			int print = a*n;
			String s= console.next();
			if(b>=0){
				print += b*n;
			}
			else {
				int runs = 1;
				for (int i=0;i<n-1 ;i++ ) {
					if(s.charAt(i)!=s.charAt(i+1)) {
						runs++;
					}
				}
				// System.out.println("runs: " + runs);
				runs = runs/2+1;
				print += b*runs;
			}
			System.out.println(print);
			

		}
	}
}