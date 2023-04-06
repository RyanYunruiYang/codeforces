import java.lang.*;
import java.util.*;
public class diamondminers {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int t = console.nextInt();

		for (int k=0;k<t ;k++ ) {
			int n = console.nextInt();

			int[] miners = new int[n];
			int[] diam = new int[n];

			int cm=0;
			int cd=0;
			for (int i=0;i<2*n ;i++ ) {
				int next = console.nextInt();
				if (next == 0) {
					diam[cd]=Math.abs(console.nextInt());
					cd++;
				}
				else {
					miners[cm] = Math.abs(next);
					cm++;
					console.nextInt();
				}


			}
			Arrays.sort(miners);
			Arrays.sort(diam);

			double energy = 0;

			for (int p=0;p<n ;p++ ) {
				energy += Math.sqrt(Math.pow(miners[p],2)+ Math.pow(diam[p],2));
			}
			System.out.println(energy);
		}
	}
}