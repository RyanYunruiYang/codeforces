import java.io.*;
import java.util.*;

public class Cprank {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int t = console.nextInt();

		for (int o=0;o<t ;o++ ) {
			int n = console.nextInt();
			int m = console.nextInt();

			int[][] board = new int[n][m];
			int q =0;
			for (int i=0;i<n ;i++ ) {
				String s = console.next();
				for (int j=0;j<m ;j++ ) {
					board[i][j] = s.charAt(j)-48;
					q+=board[i][j];
				}
			}

			if (board[0][0]==1) {
				System.out.println(-1);
			}
			else {
				System.out.println(q);

				for (int i=0;i<n ;i++ ) {
					for (int j=m-1;j>0 ;j-- ) {
						if(board[i][j]==1){
							System.out.println((i+1) + " " + (j) + " "+ (i+1) +" "+(j+1));
						}
					}
				}
				for (int i=n-1;i>0 ;i-- ) {
					if(board[i][0]==1){
						System.out.println((i) + " " + 1+ " "+ (i+1)+ " "+ 1);
					}
				}
			}
		}
	}
}