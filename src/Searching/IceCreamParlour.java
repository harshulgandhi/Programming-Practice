package Searching;
import java.util.Scanner;
public class IceCreamParlour {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		while(T-->0){
			int M = s.nextInt();
			int N = s.nextInt();
		
			int[] inpArr = new int[N];
			for(int i = 0;i<N;i++){
				inpArr[i] = s.nextInt();
			}
			
			for(int i = 0;i<N;i++){
				for(int j = i+1;j<N;j++){
					if(inpArr[i] + inpArr[j] == M){
						System.out.println((i+1)+" "+(j+1));
						break;
					}
				}
			}
		}
	}
}
