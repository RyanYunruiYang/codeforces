import java.util.*;
import java.io.*;
import java.lang.Math;

public class badstory {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int t = console.nextInt();
		for (int i=0;i< t ;i++ ) {
			int a = console.nextInt();
			int b = console.nextInt();
			int c = console.nextInt();
			int d = console.nextInt();

			if (Math.min(a,b)<Math.max(c,d) && Math.min(c,d)<Math.max(a,b)) {
				System.out.println("YES");

			}
			else {
				System.out.println("NO");
			}
		}
	}
}