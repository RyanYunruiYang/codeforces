import java.util.*;
import java.io.*;

public class fridge {
    // public static int getBit(int a, int b) {
    //     return (a >> b) & 1;
    // } 

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int q = console.nextInt();    
        for (int p=0;p<q ;p++ ) {
            int n = console.nextInt();
            int k = console.nextInt();

            int[] a= new int[k];
            int[] t = new int[k];

            for (int i=0;i<k ;i++ ) {
                a[i] = console.nextInt()-1;
            }
            for (int i=0;i<k ;i++ ) {
                t[i] = console.nextInt();
            }

            int[] temp = new int[n];
            for (int i=0;i<n ;i++ ) {
                temp[i] = Integer.MAX_VALUE;
            }

            for (int i=0;i<k ;i++ ) {
                for (int j=0;j<n ;j++ ) {
                    int x = t[i]+Math.abs(j-a[i]);
                    if(x < temp[j]){
                        temp[j] = x;
                    }
                }
            }
            for (int i=0;i<n ;i++ ) {
                System.out.print(temp[i] + " ");
            }
            System.out.println();

        }    
    }
}
