import java.util.*;
import java.io.*;


class Negg implements Comparable<Negg>{
	public int val;
	public int pre;

	public Negg(int val, int pre) {
		this.val = val;
		this.pre = pre;
	}

	@Override
	public int compareTo(Negg n1) {
		return this.val - n1.val;
		// if(n1.val > n1.val) {
		// 	return 1
		// }
		// if (n1.val ==n1.val){
		// 	return 0
		// }

		// return -1
	}
}

public class potions {


	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int n = console.nextInt();

		int[] val = new int[n];
		for (int i=0;i<n ;i++ ) {
			val[i] = console.nextInt();
		}

		int num_pos = 0;
		ArrayList<Integer> part = new ArrayList<Integer>();
		part.add(0);

		int running_total = 0;

		ArrayList<Negg> nogss = new ArrayList<Negg>();

		int zeroes = 0;

		for (int i=0;i<n ;i++ ) {
			if (val[i]>0) {
				num_pos +=1;
				running_total+=val[i];
				part.add(running_total);
			}

			if(val[i]==0) {
				zeroes +=1;
			}

			if (val[i]<0) {
				Negg x = new Negg(-val[i],num_pos);
				nogss.add(x);
			}
		}

		Collections.sort(nogss);

		for (int i=0;i<nogss.size() ;i++ ) {
			for (int j=nogss.get(i).pre;j<part.size() ;j++ ) {
					part.set(i,part.get(i) - nogss.get(i).val);
	
			}
			boolean valid = true;

			for (int j=nogss.get(i).pre;j<part.size() ;j++ ) {
				if (part.get(i) - nogss.get(i).val < 0){
					valid = false;
				}
			}

			if (valid) {
				zeroes +=1;
			}
			else {
				for (int j=nogss.get(i).pre;j<part.size() ;j++ ) {
					part.set(i,part.get(i) + nogss.get(i).val);
		
				}
			}						
		}

		System.out.println(num_pos+zeroes);




	}
}