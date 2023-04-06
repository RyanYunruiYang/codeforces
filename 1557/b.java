import java.util.*;
import java.io.*;
class ArrayTwo implements Comparator<Integer>
{
    private final int[] array;
    public ArrayTwo(int[] array)
    {
        this.array = array;
    }
    public Integer[] createIndexArray()
    {
        Integer[] indexes = new Integer[array.length];
        for (int i = 0; i < array.length; i++)
        {
            indexes[i] = i; // Autoboxing
        }
        return indexes;
    }
    @Override
    public int compare(Integer index1, Integer index2)
    {
         // Autounbox from Integer to int to use as array indexes
        return (array[index1]-array[index2]);
    }
}
public class b{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int t = console.nextInt();

		for(int o=0; o< t; o++){
			int n = console.nextInt();
			int k = console.nextInt();
			int[] a = new int[n];
			for (int i=0;i<n ;i++ ) {
				a[i]=console.nextInt();
			}
			
			ArrayTwo comparator = new ArrayTwo(a);
			Integer[] indexes = comparator.createIndexArray();
			Arrays.sort(indexes, comparator);
			for (int i=0;i<indexes.length ;i++ ) {
				System.out.print(indexes[i]);
			}
			System.out.println();
			


			boolean answer=  false;
			if(answer){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}

		}
	}
}
			// if(k==1){//no movement allowed
			// 	boolean nondec = true;
			// 	for (int i=0;i<n-1 ;i++ ) {
			// 		if (a[i]>a[i+1]) {
			// 			nondec=false;
			// 		}
			// 	}
			// 	answer = nondec;

			// }
			// if(k==2){//we can only "rotate"
			// 	boolean nondec= true;
			// 	int index = mindex;
			// 	for (int i=0;i<n-1 ;i++ ) {
			// 		if(a[(index%n)]>a[((index+1)%n)]){
			// 			nondec = false;
			// 		}
			// 		index++;
			// 	}
			// 	answer = nondec;
			// }

			// if(k>=3){//always works b/c we can move any element to wherever.
			// 	answer = true;
			// }