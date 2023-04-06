import java.lang.Math;
import java.util.*;
import java.io.*;

public class volume {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int T = console.nextInt();

		for(int i=0; i< T; i++) {
			int a = console.nextInt();
			int b = console.nextInt();
			int d = Math.abs(a-b);

			int presses = 0;
			int x = d/5;
			presses+=x;
			d -= 5*x;

			if (d>=3) {
				presses+=2;
			}
			if (d==1 || d==2) {
				presses+=1;
			}
			System.out.println(presses);
		}
	}
}