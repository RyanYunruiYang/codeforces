import java.util.*;

public class cf1496A {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int t = console.nextInt();
        
        for(int i=0; i<t; i++) {
            int n = console.nextInt();
            int k = console.nextInt();
            String s = console.next();

            boolean works = true;
            for(int j = 0; j < k; j++) {
                if (s.charAt(j) != s.charAt(n-1-j)) {
                    works = false;
                }
                if (2*k == n){
                    works = false;
                }
            }

            if (works) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}