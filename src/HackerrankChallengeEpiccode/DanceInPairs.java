package HackerrankChallengeEpiccode;

import java.util.Arrays;
import java.util.Scanner;
public class DanceInPairs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] boy = new int[N];
		int[] girl = new int[N];
		
		for (int i = 0;i<N;i++){
			boy[i] = sc.nextInt();
		}
		
		for (int i = 0;i<N;i++){
			girl[i] = sc.nextInt();
		}
		
		Arrays.sort(boy);
		Arrays.sort(girl);
		int i = 0,j=0;
		int countPair = 0;
		while(i<N && j<N){
			if(Math.abs(boy[i] - girl[j])<=K){
				countPair++;
				i++;
				j++;
			}
			else if(boy[i]>girl[j]){
				j++;
			}
			else
				i++;
		}
		
		System.out.println(countPair);
	}
}