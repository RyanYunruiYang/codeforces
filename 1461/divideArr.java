import java.util.*;
import java.io.*;

class Message {
	public int i;
	public int lmax;
	public int rmin;
	public Message(int a, int b, int c){
		i = a;
		lmax= b;
		rmin=c;
	}
}

public class divideArr {
	public static Message middle(int n,int[] a, int check) {
		for (int i=0;i<n ;i++ ) {
			if(a[i]>check){
				Message m = new Message(i,a[i-1],a[i+1]);
				return m;
			}
		}
		return new Message(n,a[n-1],a[n-2]);
	}
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int t = console.nextInt();	

		for (int i=0;i<t  ;i++ ) {
			int n = console.nextInt();
			int q = console.nextInt();

			int[] a = new int[n];
			int sum = 0;
			for (int j=0;j<n ;j++ ) {
				a[j] = console.nextInt();
				sum+=a[j];
			}

			int[] vals = new int[sum];

			vals[sum-1]=1;
			Range first = new Range(0,sum-1,a[0],a[sum-1]);

			LinkedList<Range> qu= new LinkedList<Range>();
			qu.add(first);
			while(!qu.isEmpty()){
				Range x = qu.remove();

				Message y = middle(n,a,(x.min+x.max)/2);
				Range left = new Range(x.ld,y.i, x.min, y.lmax);
				Range right = new Range(y.i+1,x.rd-1,y.rmin,x.max);

			}







			for (int j=0;j<q ;j++ ) {
				int query = console.nextInt();


			}
		}
	}

}	

class Range {
	public int ld;
	public int rd;
	public int min;
	public int max;

	public Range(int ld, int rd, int min, int max) {
		this.ld = ld;
		this.rd = rd;
		this.min = min;
		this.max = max;
	}

}