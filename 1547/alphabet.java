import java.util.*;
import java.io.*;

public class alphabet{

	public static boolean solve(int x, String s) {
		int[] index = new int[x];

		int[] occ = new int[26];

		int min=26;
		int max=-1;

		boolean appear = false;

		for (int i=0;i< x;i++ ) {
			char c = s.charAt(i);
			int a=c;  
			if(a==97){
				appear = true;
			}

			index[i] = a-97;
			occ[index[i]]++;

			// System.out.println(index[i]);

			if(!appear){
				if(index[i]>=min){
					// System.out.println("fail 1");
					return false;
				}
				else{
					min = index[i];
				}
			}
			else {
				if(index[i]<=max) {
					// System.out.println("fail 2");
					return false;

				}
				else {
					max = index[i];
				}
			}
		}
		for (int i=0;i<x ;i++ ) {
			if(occ[i]!=1){
				// System.out.println("fail 3");				
				return false;

			}
		}

		return true;

	}
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int t = console.nextInt();
		for(int p=0; p< t; p++){
			String s =console.next();

			int x = s.length();

			if(solve(x,s)) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}


		}
	}
}