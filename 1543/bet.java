import java.util.*;
import java.io.*;

public class bet{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		long t = console.nextLong();

		for (long i=0;i<t ;i++ ) {
			long a = console.nextLong();
			long b = console.nextLong();
			if(a<b){
				long temp =a;
				a=b;
				b=temp;

			}

			long d = a-b;
			System.out.print(d +" ");

			long x;
			long y;
			if(d>0){
				x = a % (a-b);

				if(x>(a-b)/2){
					x=(a-b)-x;
				}
			}
			else {
				x=0;

			}
			

			// if(y<x){
			// 	x=y;
			// }
			System.out.println(x);

		}
	}
}