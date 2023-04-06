//not working yet
import java.io.*;
import java.util.*;

public class Chatban {

	public static long QRT(long x) {
		return (long) Math.ceil((-1.0+Math.sqrt(1+8*x))/2.0);
	}
	public static void main(String[] args) throws FileNotFoundException, IOException{
		Scanner console = new Scanner(System.in);
		int t = console.nextInt();

		for (int o=0;o<t ;o++ ) {
			long k = console.nextLong();
			long x = console.nextLong();
			long m=-1;
			if(x>k*(k+1)/2){
				m = (2*k-1)- (QRT(k*k-x)-1);
			}
			
			if(x<= k*(k+1)/2) {
				//find the smallest m such that m*(m+1)/2 >= x
				m = QRT(x);
			}

			System.out.println(Math.min(m, 2*k-1));




		}




	}
}