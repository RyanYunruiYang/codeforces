import java.util.*;
import java.io.*;
import java.lang.Math;
 
public class princess{
 
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
 
		int t = console.nextInt();
 		int large = 1000*1000;
		for (int o=0;o< t ;o++ ) {
			int n = console.nextInt();
			String s = console.next();

			int vals[] = new int[n];

			int k = 1;
			int pow = 1;
			while(pow < n*(n-1)/2){
				k++;
				pow *= 26;
			}
 
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
		        vals[i] = ch - 'a'+1;	
		        // System.out.print(vals[i]+" ");
			}

			int big = Math.max(large,pow);


			boolean[] contain = new boolean[big];

			for (int i=0;i<n ;i++ ) {
				int sub = 0;

				for (int j=i;(j<i+k)&&(j<n) ;j++ ) {
					sub = 26*sub + vals[j];
					// System.out.println(sub);
					if(sub>=big){
						break;
					}
					contain[sub]=true;
				}
			}
			int fin = 0;
			for (int i=1;i< big ;i++ ) {
				if(!contain[i]){
					// System.out.println(i);
					fin = i;

					break;
				}
			}
			// System.out.println("fin: "+fin);

			ArrayList<Integer> word = new ArrayList<Integer>();
			int size=0;
			// fin=26;
			while(fin>0){
				if(fin%26>0){
					word.add(fin%26);
					size++;
					fin = (fin-(fin%26))/26;					
				}
				else {//fin is a multiple of 26
					size++;
					word.add(26);
					fin = fin/26-1;
				}
				
			}
			// System.out.println("word.get(0): "+ word.get(0));
			// System.out.println("size: "+ size);
			for (int p=0;p<size ;p++ ) {
				char c=(char) (word.get((size-1)-p)-1+'a');
				// System.out.println("word.get(p): "+ word.get(p));
				// int c= (word.get((size-1)-p));

				System.out.print(c);
			}
			System.out.println();

		}
	}
}
