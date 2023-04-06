import java.util.*;
 
public class maxMexManual {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int t = console.nextInt();
        int big_num = 1000000000;
        int[] presInt = new int[big_num];

        for(int i=0; i<t; i++) {
            int n = console.nextInt();
            int k = console.nextInt();
            //ArrayList<Integer> presInt = new ArrayList<Integer>(); // Create an ArrayList object
            int size = 0;
 
            int max = 0;            
            for (int j=0; j<n; j++) {
                int x = console.nextInt();
                presInt[x]++;
                if (x>max){
                    max = x;
                }
            }
 
            int mex = 0;
            for (int c =0;c<=max; c++) {
                if (presInt[c]!=0) {
                    size +=1;
                    if (mex == c) {
                        mex++;
                    }
                }
                
            }
 
            if (mex == max+1){
                System.out.println(size+k);
            }
            else {
                boolean x = (presInt[(max+mex+1)/2]==0)&&(k>0);
                int dif = x ? 1 : 0;
                System.out.println(size+dif);
            }

            for(int r=0; r<big_num; r++) {
                presInt[r] = 0;
            }
 
        }
    }
}
