import java.util.*;
import java.io.*;

public class pink{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int t = console.nextInt();

		for (int j=0;j<t ;j++ ) {
			
			double c = console.nextDouble();
			double m = console.nextDouble();
			double p = console.nextDouble();
			double v = console.nextDouble();

			System.out.println(recurse(c,m,v));

			
		}
	}

	public static double recurse(double c, double m, double v) {
		if(c*m != 0){
			double x=1;
			x+= c*recurse(c-Math.min(c,v),m+Math.min(c,v)/2,v);
			x+= m*recurse(c+Math.min(m,v)/2,m-Math.min(m,v),v);

			return x;
		}
		else {
			double y=c+m;

			return doub(y,v);
		}
	}
	public static double doub(double y, double v) {
		if(y<=v) {
			return 1 + y;
		}
		else {
			return 1+y*doub(y-v,v);
		}
	}
}