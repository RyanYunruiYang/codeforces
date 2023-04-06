import java.io.*;
import java.util.*;

public class a {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		Scanner console = new Scanner(System.in);
		int t = console.nextInt();

		for (int o=0;o<t ;o++ ) {
			int n = console.nextInt();
			int[] vals = new int[n];
			for (int j=0;j<n ;j++ ) {
				vals[j] = console.nextInt();
			}
			int[] dif = new int[n];
			int max = 0;
			for (int j=0;j<n ;j++ ) {
				dif[j] = Math.abs((vals[j]-1)-j);
				if (j%2==0 && dif[j]!=0) {
					dif[j]++;
				}
				// System.out.println("j: " + j + " dif[j]: " + dif[j]);
				if(dif[j]>max){
					max = dif[j];
				}
			}
			System.out.println(max);
		}

		//evens: dif + 1
		//odds: dif


	}
}