//not working yet
import java.io.*;
import java.util.*;

public class b {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		Scanner console = new Scanner(System.in);
		int t = console.nextInt();

		for (int o=0;o<t ;o++ ) {
			int n = console.nextInt();
			int a = console.nextInt();
			int b = console.nextInt();

			int left = n-b+1;
			int right = a;

			if (a>b) {
				left--;
			}
			if(b<a){
				right--;
			}


			if((left > n/2)|| (right> n/2)) {
				System.out.println(-1);
			}

			else {
				System.out.print(a + " ");

				for (int i=n;i>0 ;i-- ) {
					if((i!=a) && (i!=b)){
						System.out.print(i + " ");
					}
				}
				System.out.println(b);

			}
		}

		//evens: dif + 1
		//odds: dif


	}
}