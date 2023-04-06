import java.util.*;
import java.io.*;
import java.lang.Math;

public class badstory {

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

	public static boolean execute(int n) {
		int x = console.nextInt();
		if(x<0) {
			for (int j =0;j<(n-1) ;j++ ) {
				int trash = console.nextInt();
			}			
			return false;
		}
		int g= x;
		int max=x;
		boolean zero = false;
		if(x==0){
			zero = true;
		}
		for (int i=1;i<n ;i++ ) {
			x = console.nextInt();				
			if(x==0){
				zero = true;
			}
			if (x<0){
				for (int j =0;j<(n-1-i) ;j++ ) {
					int trash = console.nextInt();
				}
				return false;
			}
			else {
				g = gcd(g,x);
				if (x> max){
					max = x;
				}
			}
		}
		int z=0;
		if(zero){
			z = 1;
		}
		if(max==0){
			System.out.println(1);
			System.out.println(0);
			return true;
		}	

		int num_needed = max/g +z;
		if(num_needed>300){
			return false;
		}
		else {
			System.out.println("YES");

			System.out.println(num_needed);
			if(zero){
				System.out.print(0+" ");
			}
			for (int i=1;i<= max/g ;i++ ) {
				System.out.print(g*i+" ");
			}
			System.out.println();
			return true;
		}
	}
	private static Scanner console = new Scanner(System.in);

	public static void main(String[] args) {

		int t = console.nextInt();
		for (int k=0;k< t ;k++ ) {
			int n = console.nextInt();
			if(!execute(n)){
				System.out.println("NO");
			}
		}


	}

}