package Hackerrank.Searching;
import java.util.Scanner;
public class SherlockAndArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		while(T-- > 0){
			int N = s.nextInt();
			int[] inpArr = new int[N];
			for(int i = 0;i<N;i++){
				inpArr[i] = s.nextInt();
			}
			
			int sumF = inpArr[0];
			int sumR = inpArr[N-1];
			boolean flag = false;
			for(int i=0,j=N-1;(i<=j);){
				if(N == 1){
					flag = true;
					break;
				}
				if(sumF == sumR){
					if(i+1 == j-1){
						flag = true;
						break;
					}
					else{
						sumR += inpArr[--j];
						sumF += inpArr[++i];
					}
				}
				else if(sumF > sumR){
					sumR += inpArr[--j];
				}
				else if(sumR > sumF){
					sumF += inpArr[++i];
				}
			}
			if(flag) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
