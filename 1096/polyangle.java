import java.util.*;
import java.io.*;


public class polyangle {

	public static int gcd(int a, int b)//precondition a>b
	{
		if (b==0) {
			return a;
		}
		else{
			return gcd(b,a%b);
		}
	}

	public static void main(String[] args) {
		Scanner console = new Scan0ner(System.in);

		int T = console.nextInt();

		for(int i = 0; i< T; i++) {
			int ang = console.nextInt();//ang= a *180/n

			int nCand = 180/gcd(ang,180);

			int a = ang*nCand/180;
			// System.out.println(a);

			if (a+2>nCand) {
				nCand*=2;
			}

			System.out.println(nCand);

			
		}

	}
}