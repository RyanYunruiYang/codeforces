import java.util.*;
import java.io.*;

public class azamon {

	public static void execute(int[] jeff) {
		for(int i = 0; i < jeff.length; i++){
			char c=(char)(jeff[i]+55);  

			System.out.print(c);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int t = console.nextInt();


		for (int i = 0; i < t ;i++ ) {
			String s = console.next();
			int x=s.length();
			int[] jeff = new int[x];

			for (int j = 0;j < x ;j++ ) {
				jeff[j] = Character.getNumericValue(s.charAt(j));
			}



			String c = console.next();
			int y=c.length();
			int[] comp = new int[y];


			for (int j = 0;j <y ;j++ ) {
				comp[j] = Character.getNumericValue(c.charAt(j));
			}


			boolean boosted = false;
			boolean done = false;
			boolean failed = false;



			int k = -1;


			while ((k+1 < x )&& (k+1<y) && (!done) ) {//y is the length of the comp's string, x is jeff's
				k++;

				int beat = comp[k];//value to beat
				boolean passed = false;

				if (!boosted) {//k represents the current index of comp
					for (int j = k;j < x ;j++ ) {// if any values < beat
						if (jeff[j]<beat && !passed) {

							int store = jeff[k];
							jeff[k] = jeff[j];
							jeff[j] = store;

							if(j>k){
								boosted = true;
							}

							execute(jeff);
							done = true;
							passed = true;
						}
					}
					if (!passed) {
						for (int j = k;j < x ;j++ ) {
							if ((jeff[j] == beat) && !passed) {

								int store = jeff[k];
								jeff[k] = jeff[j];
								jeff[j] = store;

								boosted = (k != j);
								passed= true;
							}						
						}
					}

					if (!passed) {
						System.out.println("---");//in this case, all values are > beat
						done = true;
						failed = true;
					}
				}
				else { // has boosted already
					if (jeff[k]< beat) {
						execute(jeff);
						done = true;
					}
					// if (jeff[k] == beat) {
					// 	done = false;
					// }
					if (jeff[k]> beat) {
						System.out.println("---");
						done = true;
						failed= true;
					}
				}					
			
			}
			if (!done){
				// System.out.println("lol");
				if (x<y) {
					execute(jeff);
				}
				else {
					System.out.println("---");
				}
			}




		}
		//we have to get s' < c

	}
}