import java.util.*;

public class arrangedSheep {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int t = console.nextInt();

		for (int i = 0;i < t ;i++ ) {
			int n = console.nextInt();

			int[] board = new int[n];
			String position = console.next();

			int ns = 0; //number of sheep
			for (int j = 0;j <n ;j++ ) {
				char s = position.charAt(j);

				if (s == '*') {
					board[j] = 1;
					ns++;
				}
				if (s=='.') {
					board[j] = 0;
				}
			}
			// for (int k = 0;k < board.length ;k++ ) {
			// 		System.out.print(board[k]);
			// 	}
			int[] sheep = new int[ns];
			int k=0;
			for (int j=0;j < n ;j++ ) {
				if (board[j]==1) {
					sheep[k] = j;
					k++;
				}
			}
			if(ns>0){
				int mid = sheep[ns/2];

				long moves = 0;

				for (int s = 0;s <ns ;s++ ) {
					moves += Math.abs((sheep[ns/2]-sheep[s]) - (ns/2-s)); //position of the sheep - 
				}
				System.out.println(moves);
			}
			else {
				System.out.println(0);
			}

		}
	}
}