package Implementation;
import java.util.Arrays;
import java.util.Scanner;
public class ACMTeam {
	
	public static int getOR(String str1, String str2){
		int len = str1.length();
		int count = 0;
		for(int i = 0;i<len;i++){
			if(str1.charAt(i) == '1' || str2.charAt(i) == '1') count++;
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		String[] inArr = new String[N];
		for(int i = 0;i<N;i++){
			inArr[i] = sc.next();
		}
		int maxInt = 0;
		int numOfTeams = 0;
		for (int i = 0;i<N;i++){
			for (int j = i;j<N;j++){
				int numOnes = getOR(inArr[i],inArr[j]); 
				if(numOnes > maxInt){
					maxInt = numOnes;
					numOfTeams = 1;
				}
				else if(numOnes == maxInt){numOfTeams+=1;}
			}
		}
		System.out.println(maxInt);
		System.out.println(numOfTeams);
	}
}
