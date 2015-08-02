package Hackerrank.Searching;
import java.util.Arrays;
import java.util.Scanner;
public class Pairs {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int K = s.nextInt();
		int[] inarr = new int[N];
		int count = 0;
		for (int i = 0;i<N;i++){
			inarr[i] = s.nextInt();
		}
		Arrays.sort(inarr);
		for(int i = 0, j=i+1;i<N-1&&j<N;){
				if(Math.abs(inarr[i] - inarr[j])>K){
					i++;
				}
				else if(Math.abs(inarr[i] - inarr[j]) < K){
					j++;
				}
				else if(Math.abs(inarr[i] - inarr[j])== K){
					count++;
					i++;
					j++;
			}
		}
		
		System.out.println(count);
	}
}
