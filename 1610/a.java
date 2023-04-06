import java.io.*;
import java.util.*;

public class a {

//	public static boolean solve(int x, int y){

	public static void main(String[] args) throws FileNotFoundException, IOException{
		Scanner console = new Scanner(System.in);
		int t = console.nextInt();

		for (int o=0;o<t ;o++ ) {
			int n = console.nextInt();
			int m = console.nextInt();

			if((n==1)&& (m==1)){
				System.out.println(0);
			}
			else {
				if((n==1) || (m==1)) {
					System.out.println(1);
				}

				else {
					System.out.println(2);
				}				
			}




		}




	}
}