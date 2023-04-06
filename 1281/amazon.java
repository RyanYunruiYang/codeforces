import java.util.*;
import java.io.*;

public class amazon {

	public static String execute(int[] jeff) {
		char[] ch = new char[jeff.length];

		for(int i = 0; i < jeff.length; i++){
			char c=(char)(jeff[i]+55);  
			ch[i] = c;
		}
    	String str = new String(ch);
    	return str;

	}

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int t = console.nextInt();


		for (int i = 0; i < t ;i++ ) {
			String s = console.next();
			int x=s.length();
			int[] jeff = new int[x];
			int[] sorted = new int[x];

			for (int j = 0;j < x ;j++ ) {
				jeff[j] = Character.getNumericValue(s.charAt(j));
				sorted[j] = Character.getNumericValue(s.charAt(j));
				// System.out.println(jeff[j]);
			}


			String stringc = console.next();
			int y=stringc.length();
			int[] comp = new int[y];


			for (int j = 0;j <y ;j++ ) {
				comp[j] = Character.getNumericValue(stringc.charAt(j));
			}

			Arrays.sort(sorted);

			int k=0;

			boolean done = false;
			boolean noswap = false;
			while (!done) {
				if ((k==x)) {
					done = true;
					noswap = true;
				}

				if(!noswap &&(jeff[k]==sorted[k])) {
					done = true;
				}

				k++;				
			}
			if (!noswap){
				int swapvalue = jeff[k];
				jeff[k] = sorted[k];

				boolean unswapped = true;
				for (int q=x-1;q>=0 ;q-- ) {
					if((jeff[q]==sorted[k])&& unswapped ) {
						jeff[q] = swapvalue;
						unswapped = false;
					}
				}
			}

			String str = execute(jeff);
			// System.out.println(str+stringc);
			if(str.compareTo(stringc) < 0){
				System.out.println(str);
			}
			else {
				System.out.println("---");
			}
			





		}
		//we have to get s' < c

	}
}