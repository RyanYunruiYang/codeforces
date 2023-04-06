import java.util.Scanner;
import java.lang.Math;

public class problemA
{

	public static void main(String[] args) {
		  // Use the Scanner class
     	Scanner sc = new Scanner(System.in);  
     	int t = sc.nextInt();

     	int a;
     	int b;
     	int c;


		for (int i = 0;i < t ;i++ ) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();	

			System.out.println(Math.max(a,Math.max(b,c)));
		}

	}
	/*

	public static int fourthSide(int x, int y, int z)
	{
		for (int diagonal = y-x+1; diagonal < x+y ;diagonal++ ) {
			if (diagonal > z) {
				return diagonal - z +1;  
			}
		}
	}

	public static boolean isTriangle(int a, int b, int c)
	{
		//we have that b<c
		if (a+b < c) {
			return false;
		}

		if (b+c < a) {
			return false;
		}

		return true;
	}*/


}