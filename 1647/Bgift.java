import java.io.*;
import java.util.*;

public class Bgift {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int t = console.nextInt();

		for (int o=0;o<t ;o++ ) {
			int n = console.nextInt();
			int m = console.nextInt();

			int[][] board = new int[n][m];
			for (int i=0;i<n ;i++ ) {
				String s = console.next();
				for (int j=0;j<m ;j++ ) {
					board[i][j] = s.charAt(j)-48;
				}
			}

			// for (int i=0;i<n ;i++ ) {
			// 	for (int j=0;j<m ;j++ ) {
			// 		System.out.print(board[i][j]);
			// 	}
			// 	System.out.println();
			// }
			boolean works = true;

			for (int i=0;i<n-1 ;i++ ) {
				for (int j=0;j<m-1 ;j++ ) {
					if(board[i][j]+board[i+1][j]+board[i][j+1]+board[i+1][j+1]==3){
						works = false;
					}
				}
			}
			if(works){
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}