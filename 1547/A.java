import java.util.*;
import java.io.*;

public class A{

	public static int solve(int xA, int yA, int xB, int yB, int xF, int yF) {
		if((xA!=xB)& (yA!=yB)) {
			return Math.abs(xA-xB)+Math.abs(yA-yB);
		}
		if((xA==xB)& (yA==yB)) {
			return 0;
		}

		if(xA==xB) {
			if(xA == xF) {
				if (((yA<yF)&(yF<yB))||((yA>yF)&(yF>yB))){
					return Math.abs(yB-yA)+2;
				}
			}
		}

		if(yA==yB) {
			if(yA == yF) {
				if (((xA<xF)&(xF<xB))||((xA>xF)&(xF>xB))){
					return Math.abs(xB-xA)+2;
				}
			}
		}
		return Math.abs(xA-xB)+Math.abs(yA-yB);	
	}
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		int t = console.nextInt();
		for(int i=0; i< t; i++){
			int xA = console.nextInt();
			int yA = console.nextInt();
			int xB = console.nextInt();
			int yB = console.nextInt();
			int xF = console.nextInt();
			int yF = console.nextInt();

			System.out.println(solve(xA,yA,xB,yB,xF,yF));
		}
	}
}