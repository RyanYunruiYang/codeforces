import java.util.*;
import java.io.*;
import java.lang.Math;

public class stable {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int t = console.nextInt();

		for (int k=0;k< t ;k++ ) {
			//reading in
			String s = console.next();

			int vals[] = new int[s.length()];
			
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
		        int a = ch - '0';
			   	if (a == 0) {
			   		vals[i] = 0;
			   	}
			   	else if (a == 1) {
			   		vals[i] = 1;
			   	}
			   	else  {//(s.charAt(i).equals("1"))
			   		vals[i] = -1;
			   	}			   				   	
			}
			//now we have vals[i] and that's all that matters			

			
			int len = s.length();
			boolean[] typeA = new boolean[len];
			boolean[] typeB = new boolean[len];
			boolean[] typeC = new boolean[len];

			for(int x = 0; x<len; x++) {
				if (x%2==0){
					if(vals[x]==0){
						typeA[x] = true;
					}
					if(vals[x]==1){
						typeB[x] = true;
					}
					if(vals[x]==-1){
						typeA[x] = true;
						typeB[x] =true;
						typeC[x] = true;
					}
				}
				if (x%2==1){
					if(vals[x]==1){
						typeA[x] = true;
					}
					if(vals[x]==0){
						typeB[x] = true;
					}
					if(vals[x]==-1){
						typeA[x]=true;
						typeB[x]=true;
						typeC[x] = true;
					}
				}				

				
			}
			int aTrue = 0;
			int bTrue = 0;
			int cTrue = 0;
			int a_count=0;
			int b_count=0;
			int c_count=0;
			for (int x=0;x<len ;x++ ) {
				if(typeA[x]){
					aTrue++;
				}
				else{					
					a_count += aTrue*(aTrue+1)/2;
					aTrue = 0;
				}
				if(typeB[x]){
					bTrue++;
				}
				else{					
					b_count += bTrue*(bTrue+1)/2;
					bTrue = 0;
				}
				if(typeC[x]){
					cTrue++;
				}
				else{					
					c_count += cTrue*(cTrue+1)/2;
					cTrue = 0;
				}								
			}	
			a_count += aTrue*(aTrue+1)/2;
			b_count += bTrue*(bTrue+1)/2;			
			c_count += cTrue*(cTrue+1)/2;


			// System.out.println("acount: "+a_count);
			// System.out.println("bcount: "+b_count);
			// System.out.println("ccount: "+c_count);

			System.out.println(a_count+b_count-c_count);


		}
	}
}

