import java.util.*;
import java.io.*;


public class moamen{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int t = console.nextInt();

		for(int o=0; o< t; o++){
			int n = console.nextInt();
			int k = console.nextInt();
			int[] a = new int[n];
			Pair[] b = new Pair[n];
			for (int i=0;i<n ;i++ ) {
				a[i]=console.nextInt();
				Pair x = new Pair(i,a[i]);
				b[i] = x;
			}
			
			Arrays.sort(b);
			int steps=0;
			for (int i=0;i<n-1 ;i++ ) {
				// System.out.print(b[i].index);
				if(b[i].index+1==b[i+1].index){
					steps++;
				}
			}
			// System.out.println();

			


			boolean answer= ((n-steps)<=k);
			if(answer){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}

		}
	}
}
class Pair implements Comparable<Pair> {
	int index,value;
	public Pair(int index, int value) { 
		this.index=index;
		this.value = value;
	}
	public int compareTo(Pair y) { 
		return this.value-y.value;
	}
}
			// if(k==1){//no movement allowed
			// 	boolean nondec = true;
			// 	for (int i=0;i<n-1 ;i++ ) {
			// 		if (a[i]>a[i+1]) {
			// 			nondec=false;
			// 		}
			// 	}
			// 	answer = nondec;

			// }
			// if(k==2){//we can only "rotate"
			// 	boolean nondec= true;
			// 	int index = mindex;
			// 	for (int i=0;i<n-1 ;i++ ) {
			// 		if(a[(index%n)]>a[((index+1)%n)]){
			// 			nondec = false;
			// 		}
			// 		index++;
			// 	}
			// 	answer = nondec;
			// }

			// if(k>=3){//always works b/c we can move any element to wherever.
			// 	answer = true;
			// }