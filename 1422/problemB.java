import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays; 


public class problemB
{

	public static void main(String[] args) {
		  // Use the Scanner class
     	Scanner sc = new Scanner(System.in);  
     	int t = sc.nextInt();

     	int n;
     	int m;



		for (int k = 0;k < t ;k++ ) {
			n = sc.nextInt();
			m = sc.nextInt();

			int[][] matrix = new int[n][m];

			for (int i = 0;i < n ;i++ ) {
				for (int j = 0;j < m ;j++ ) {
					matrix[i][j] = sc.nextInt();
				}
			}

			int moves = 0;
			for (int i = 0;i < n/2 ;i++ ) {
				for (int j = 0;j < m/2 ;j++ ) {
					
					int[] corner = new int[4];					
					
					corner[0] = matrix[i][j];
					corner[1] = matrix[n-1-i][j];
					corner[2] = matrix[i][m-1-j];				
					corner[3] = matrix[n-1-i][m-1-j];


					Arrays.sort(corner); 


					moves+=(corner[3]+corner[2]-corner[1]-corner[0]);
				}
			}
			if (n%2 == 1) {
				for (int c = 0;c < m/2  ;c++ ) {
					moves+=Math.abs(matrix[n/2][c]-matrix[n/2][m-1-c]);
				}
			}
			if (m%2 == 1) {
				for (int c = 0;c < n/2  ;c++ ) {
					moves+=Math.abs(matrix[c][m/2]-matrix[n-1-c][m/2]);
				}	
			}


			System.out.println(wmoves);

		}

	}
}