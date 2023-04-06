import java.util.*;

public class listMexMax {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int t = console.nextInt();
        for(int i=0; i<t; i++) {
            int n = console.nextInt();
            int k = console.nextInt();
            int max=0;
            int mex=0;
            int size=0;

            if (n<10) {
                ArrayList<Integer> presInt = new ArrayList<Integer>();

                for (int j=0; j<n; j++) {
                    int x = console.nextInt();
                    presInt.add(x);
                    if (x>max){
                        max = x;
                    }
                }
                // int[] presInt = new int[max+1];

                for (int c =0;c<=max; c++) {
                    if (presInt.contains(c)) {
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
                    boolean x = (!presInt.contains((max+mex+1)/2))&&(k>0);
                    int dif = x ? 1 : 0;
                    System.out.println(size+dif);
                }
            }

            else {
                int[] presInt = new int[100000 * n];
     
                for (int j=0; j<n; j++) {
                    int x = console.nextInt();
                    presInt[x]++;
                    if (x>max){
                        max = x;
                    }
                }
     
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
            }
        }
    }
}
