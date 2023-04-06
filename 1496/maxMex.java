import java.util.*;

public class maxMex {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int t = console.nextInt();
        for(int i=0; i<t; i++) {
            int n = console.nextInt();
            int k = console.nextInt();
            
            boolean[][] flag= new boolean[1000][1000];
            int max = 0; 
            int mex = 0;

            for (int j=0; j<n; j++) {
                int x = console.nextInt();
                
                
                if (x>max){
                    max = x;
                }

            }

            
            // for (int j=0; j<n; j++) {
            //     int x = preList.get(j);
            //     presInt[x]++;
            //     if (x>max){
            //         max = x;
            //     }
            // }

            // for (int c =0;c<=max; c++) {
            //     if (presInt[c]!=0) {
            //         size +=1;
            //         if (mex == c) {
            //             mex++;
            //         }
            //     }
                
            // }

            if (mex == max+1){
                System.out.println(size+k);
            }
            else {
                boolean x = (presInt[(max+mex+1)/2]==0)&&(k>0);
                int dif = x ? 1 : 0;
                System.out.println(size+dif);
            }

        }
    }
}
