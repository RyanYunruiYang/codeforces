import java.util.*;
import java.io.*;
import java.lang.Math;

public class C{

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int t = console.nextInt();

		for (int k=0;k< t ;k++ ) {
			//reading in
			String s = console.next();
			int len = s.length();
			long vals[] = new long[s.length()];

			long aTrue = 0;
			long bTrue = 0;
			long cTrue = 0;
			long a_count=0;
			long b_count=0;
			long c_count=0;

			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
		        int a = ch - '0';
			   	if (a == 0) {
			   		vals[i] = 0;
			   	}
			   	else if (a == 1) {
			   		vals[i] = 1;
			   	}
			   	else  {//(s.charAt(i).equals("1"))
			   		vals[i] = -1;
			   	}

		   		if(vals[i]== (i%2)){
		   			aTrue++;
					b_count += bTrue*(bTrue+1)/2;
					bTrue = 0;	
					c_count += cTrue*(cTrue+1)/2;
					cTrue = 0;						   			
		   		}
				if(vals[i]== 1-(i%2)){
		   			bTrue++;
					a_count += aTrue*(aTrue+1)/2;	
					aTrue = 0;
					c_count += cTrue*(cTrue+1)/2;
					cTrue = 0;						   			

		   		}
		   		if(vals[i]==-1){
		   			aTrue++;
		   			bTrue++;
		   			cTrue++;
		   		}		   		


			}
			a_count += aTrue*(aTrue+1)/2;
			b_count += bTrue*(bTrue+1)/2;			
			c_count += cTrue*(cTrue+1)/2;
			// System.out.println("acount: "+a_count);
			// System.out.println("bcount: "+b_count);
			// System.out.println("ccount: "+c_count);

			System.out.println(a_count-c_count+b_count);


		}
	}
}

