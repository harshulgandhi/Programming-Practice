import java.util.*;

public class AngryProf {
	
	public static void main(String[] args){
		Scanner sn = new Scanner (System.in);
		int numTestCases = sn.nextInt();
		for (int i = 0;i<numTestCases;i++){
			int countStudBefore = 0;
			int numStud = sn.nextInt();
			int threshold = sn.nextInt();
			
			for (int j = 0;j<numStud;j++){
				int time = sn.nextInt(); 
				if(time<1){
					countStudBefore++;
				}
			}
			if(countStudBefore < threshold){
				System.out.println("YES");
			}
			else System.out.println("NO");
		}
	}
}	
	
	
	
	/*
	 * 
10
10 4
-93 -86 49 -62 -90 -63 40 72 11 67
10 10
23 -35 -2 58 -67 -56 -42 -73 -19 37
10 9
13 91 56 -62 96 -5 -84 -36 -46 -13
10 8
45 67 64 -50 -8 78 84 -51 99 60
10 7
26 94 -95 34 67 -97 17 52 1 86
10 2
19 29 -17 -71 -75 -27 -56 -53 65 83
10 10
-32 -3 -70 8 -40 -96 -18 -46 -21 -79
10 9
-50 0 64 14 -56 -91 -65 -36 51 -28
10 6
-58 -29 -35 -18 43 -28 -76 43 -13 6
10 1
88 -17 -96 43 83 99 25 90 -39 86
	 * 
	 * */

