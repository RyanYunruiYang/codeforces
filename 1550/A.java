import java.util.*;
import java.io.*;
 
public class A{
 
	// public static int solve(int xA, int yA, int xB, int yB, int xF, int yF) {	
	// }
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int t = console.nextInt();
 
		for(int o=0; o< t; o++){
			int x = console.nextInt();
			double z= Math.sqrt(x);
 
			int y =(int) Math.ceil(z);
			System.out.println(y);
 
		}
	}
}