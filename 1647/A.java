import java.io.*;
import java.util.*;

public class A {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int t = console.nextInt();

		for (int o=0;o<t ;o++ ) {
			int n = console.nextInt();

			//1, 2, 21, 121, 212, 2121
			if (n%3 ==1) {
				System.out.print(1);
			}
			if (n%3 ==2) {
				System.out.print(2);
			}
			for (int i=0;i<n/3 ;i++ ) {
				if(n%3==2){
					System.out.print(12);
				}
				else {
					System.out.print(21);					
				}
			}
			System.out.println();
		}
	}
}