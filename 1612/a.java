import java.io.*;
import java.util.*;

public class a {
	public static boolean solve(int x, int y){
		int d = x+y;

		if (d%2==1) {
			return false;
		}

		if (x%2==0) {
			System.out.println(x/2 + " " + y/2);
			return true;
		}
		
		if(x>=y){
			System.out.println((x-d/2)+" " + (y));
			return true;
		}

		if(x<y){
			System.out.println((x)+ " " + (y- d/2));
			return true;
		}
		return true;
	}

	public static void main(String[] args) throws FileNotFoundException, IOException{
		Scanner console = new Scanner(System.in);
		int t = console.nextInt();

		for (int o=0;o<t ;o++ ) {
			int x = console.nextInt();
			int y = console.nextInt();

			if(!solve(x,y)){
				System.out.println("-1 -1");
			}
		}

		//evens: dif + 1
		//odds: dif


	}
}