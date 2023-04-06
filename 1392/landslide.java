import java.util.*;
import java.io.*;

public class landslide {

	// public static void debug(String s) {
	// 	if (true) {
	// 		System.out.println(s);
	// 	}
	// }

	public static void main(String[] args) {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader console = new BufferedReader(input);
		PrintWriter out= new PrintWriter(System.out);


		try {
			long n = Integer.parseInt(console.readLine());
			
			StringTokenizer tk = new StringTokenizer(console.readLine());

			long sum = 0;

			for (int i = 0;i<n ;i++ ) {
				sum += Long.parseLong(tk.nextToken());
			}

			long base = 0;

			// double shifted = ((sum - (n*(n-1)/2))/((double) n));

			if (((sum - (n*(n-1)/2))%n)==0) {
				base =  ((sum - (n*(n-1)/2))/ n);
			}
			else {
				base = 1 + (long) ((sum - (n*(n-1)/2))/ n);
			}

			out.println(base);

			sum -= n*base;

			long fixed = n-(n*(n-1)/2 - sum)-1;
			// System.out.println("fixed: " + fixed);

			for (int j = 1;j<= fixed ;j++ ) {
				out.println(base+j);
			}
			for (long j=fixed; j<n-1; j++) {
				out.println(base+j);
			}
			out.flush();
			// if (sum != 0) {
			// 	System.out.println("YOU FUCKED UP");
			// }


		}
		catch (IOException ex) {
			System.out.println("ERROR: IOEXCEPTION");
		}
		


	}
}