import java.io.*;
import java.util.*;

public class b {

//Claim 1: If there is a solution by choosing 'x', deleting all 'x's works.
//Proof: Removing all 'x's from a palindrome keeps it as a palindrome

//Claim 2: The first failure (a\neq b) must be remedied by removing either 'a' or 'b'
//Proof: the parts before 'a' and after 'b' are symmetric, so removing from them does not help.
//Thus, it is necessary to remove one of a or b.

	public static void main(String[] args) throws FileNotFoundException, IOException{
		Scanner console = new Scanner(System.in);
		int t = console.nextInt();

		for (int o=0;o<t ;o++ ) {
			int n = console.nextInt();
			int[] a = new int[n];
			for (int i=0;i<n ;i++ ) {
				a[i] = console.nextInt();
			}			

			int[] candidate = new int[2];
			for (int i=0; i<n ;i++ ) {
				if(a[i]!=a[n-1-i]){
					candidate[0]=a[i];
					candidate[1]=a[n-1-i];
					break;
				}
			}
			// System.out.println(candidate[0] +" " +candidate[1]);

			int x;
			boolean totalBool = false;
			for(int i=0;i<2; i++) {
				x = candidate[i];
				boolean thisRound=true;

				int count = 0;
				for (int j=0;j<n ;j++ ) {
					if (a[j]==x) {
						count++;
					}
				}
				int size = n -count;
				int[] b = new int[size];
				int k=0;
				for (int j=0;j<n;j++ ) {
					if (a[j]!=x) {
						b[k] = a[j];
						k++;
					}
				}

				for (int j=0;j<size ;j++ ) {
					if (b[j]!=b[size-1-j]) {
						thisRound = false;
					}
				}
				// ArrayList<Integer> b = new ArrayList<Integer>();
				// for (int j=0;j<n ;j++ ) {
				// 	if(a[j]!=x){
				// 		b.add(a[j]);
				// 	}
				// }
				// //Array B is the result of removing all 'x's 	

				// for (int j=0;j<b.size() ;j++ ) {
				// 	if (b.get(j)!= b.get(b.size()-1-j)) {
				// 		thisRound = false;
				// 	}
				// }//this tests if B is a palindrome

				if (thisRound) {
					totalBool = true;
				}//passing it up
			}
	
			if (totalBool) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}

		}

	}
}