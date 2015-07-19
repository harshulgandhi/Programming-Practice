package Hackerrank.DataStructures;
import java.util.Scanner;
public class OneDArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		while(T-- > 0){
			int N = s.nextInt();
			int M = s.nextInt();
			int[] inArr = new int[N];
			for(int i = 0;i<N;i++){
				inArr[i] = s.nextInt();
			}
			
			for(int i =0;i<N-1;){
				
				if(inArr[i+1] == 1){
					if(i+M >= N-1) {
						System.out.println("YES");
						break;
					}
					else if(inArr[i+M] == 0){
//						System.out.println("jump");
						i = i + M;
						continue;
					}
					else {
						System.out.println("NO");
						break;
					}
				}
				else if(i+1 == N-1) System.out.println("YES");
				i++;
//				System.out.println("i : "+i);
			}
		}
	}
}
