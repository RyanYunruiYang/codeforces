import java.util.*;
import java.io.*;
import java.lang.Math;

public class arrayorder {
	public static int gcd(int a, int b)
	{
		if (a<b){
			int temp =a;
			a = b;
			b=temp;
		}
		if (b==0) {
			return a;
		}
		else{
			return gcd(b,a%b);
		}
	}	

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int t = console.nextInt();

		for (int i=0;i< t ;i++ ) {
			int n = console.nextInt();
			int[] vals = new int[n];

			int left = 0;
			int right = n-1;
			for(int j=0; j<n; j++) {
				int x = console.nextInt();
				if ((x%2)==0){
					vals[left]=x;
					left++;
				}
				else {
					vals[right]=x;
					right--;
				}
			}
			int count = 0;
			for (int a=0;a<n ;a++ ) {
				for (int b=0;b<a ;b++ ) {
					if(gcd(vals[b],2*vals[a]) >1) {
						count++;
					}
				}
			}
			System.out.println(count);





		}
	}
}