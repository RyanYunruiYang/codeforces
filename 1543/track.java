import java.util.*;
import java.io.*;

public class track{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int t = console.nextInt();

		for (int j=0;j<t ;j++ ) {
			
			int n= console.nextInt();

			long sum=0;
			for (int i=0;i<n ;i++ ) {
				sum+= console.nextLong();
			}

			long newt  = sum %n;

			System.out.println(newt*(n-newt));
		}
	}
}