import java.util.*;
import java.io.*;

public class bangle {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int n = console.nextInt();
		int a = console.nextInt();

		double x = a*1.0*n/180.0; //a = k * 180/n

		int k =(int) (x+0.5);

		if(k==0){
			k=1;
		}

		if (k>=n-1) {
			k=n-2;
		}

		System.out.println(n+" "+(n-1)+" "+k);
	}
}