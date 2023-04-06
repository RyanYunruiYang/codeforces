import java.util.*;
import java.io.*;

public class rap{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int t = console.nextInt();

		for (int j=0;j<t ;j++ ) {
			
			int n =console.nextInt();
			int k= console.nextInt();

			for (int i=0;i< n ;i++ ) {
				System.out.println(i);
				if(console.nextInt()==1){
					break;
				}

			}
		}
	}

}