import java.util.*;
import java.io.*;
import java.lang.Math;


public class flipsort {
	static int n;

	public static String reversi(String input ) {
		byte[] strAsByteArray = input.getBytes();
 
        byte[] result = new byte[strAsByteArray.length];
 
        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
 
        return new String(result);	
	}
	public static void entered() {
		if(false) {
			System.out.println("entered");

		}
	}

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		n = console.nextInt();
		boolean debug = false;


		int[] energy = new int[n];
		String[] names = new String[n];

		for(int i = 0; i< n; i++) {
			energy[i] = console.nextInt();
		}

		for(int i = 0; i< n; i++) {
			names[i] = console.next();
			// System.out.println(names[i]);
		}


		String original = names[0];		
		String newword = reversi(names[0]);
		long flipEnergy = energy[0];
		long nonFlipEnergy = 0;

		boolean flipfailed = false;
		boolean nonflipfailed = false;

		// System.out.println(newword);

		// int big = Integer.MAX_VALUE/3*2;

		// System.out.println("original: " + original);
		// System.out.println("newword: " + newword);
		// System.out.println("flipEnergy: " + flipEnergy);
		// System.out.println("nonFlipEnergy: " + nonFlipEnergy);
		// System.out.println();
		
		for (int i=1;i<n ;i++ ) {
			

			String nonflipped = names[i];
			String flipped = reversi(names[i]);


			ArrayList<Long>non = new ArrayList<Long>();

			if((nonflipped.compareTo(original) >= 0)&& (nonFlipEnergy>=0)){
				non.add(nonFlipEnergy);
			}
			if((nonflipped.compareTo(newword) >= 0)&&(flipEnergy>=0) ){
				non.add(flipEnergy);
			}

			ArrayList<Long>flp = new ArrayList<Long>();
			if((flipped.compareTo(original)>=0)&& nonFlipEnergy>=0) {
				flp.add(nonFlipEnergy + energy[i]);
			}
			if ((flipped.compareTo(newword)>=0)&&(flipEnergy>=0)) {
				flp.add(flipEnergy+energy[i]);
			}
			
			nonflipfailed = non.isEmpty();
			if (!non.isEmpty()) {
				nonFlipEnergy = Collections.min(non);
			}
			else {
				nonFlipEnergy = -1;
			}


			flipfailed = flp.isEmpty();
			if (!flipfailed) {
				flipEnergy = Collections.min(flp);
			}
			else {
				flipEnergy = -1;
			}

			original = nonflipped;
			newword = flipped;

			if (false){
				System.out.println("original: " + original);
				System.out.println("newword: " + newword);
				System.out.println("flipEnergy: " + flipEnergy);
				System.out.println("nonFlipEnergy: " + nonFlipEnergy);
				System.out.println();
			}
						

		}
		
		ArrayList<Long> finals = new ArrayList<Long>();
		if (flipEnergy>=0){
			finals.add(flipEnergy);
		}
		if (nonFlipEnergy>=0) {
			finals.add(nonFlipEnergy);
		}



		if (finals.isEmpty()){
			System.out.println(-1);
		}
		else {
			long x = Collections.min(finals);

			System.out.println(x);
		}



		

	}
}