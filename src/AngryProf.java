import java.util.*;

public class AngryProf {
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		Scanner sn = new Scanner (System.in);
		int numTestCases = sn.nextInt();
//		System.out.println("Number of test cases : "+numTestCases);
		ArrayList ans = new ArrayList();
		for (int i = 0;i<numTestCases;i++){
			int countStudBefore = 0;
			Scanner sn1 = new Scanner (System.in);
			int numStud = sn1.nextInt();
//			System.out.println("Number of students : "+numStud);
			int threshold = sn1.nextInt();
//			System.out.println("Threshold count : "+threshold);
			Scanner sn2 = new Scanner (System.in);
			for (int j = 0;j<numStud;j++){
				int time = sn2.nextInt();
				if(time>=0){countStudBefore++;}
				if(countStudBefore == threshold){
					ans.add("NO");
//					System.out.println("NO");
					break;
				}
			}
			if(countStudBefore < threshold){
				ans.add("YES");
//				System.out.println("YES");
			}
		}
		for (int i = 0;i<ans.size();i++){
			System.out.println(ans.get(i));
		}
	}
}
