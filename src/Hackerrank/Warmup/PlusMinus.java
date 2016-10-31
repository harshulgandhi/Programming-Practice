package Hackerrank.Warmup;

import java.util.Scanner;

public class PlusMinus {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int arr[] = new int[N];
		float basicFraction = 1.0f/N;
		int pos = 0;
		int neg = 0;
		int zero = 0;
		for(int i = 0;i<N;i++){
			int num = s.nextInt();
			if (num < 0 ) {
				neg += 1;
			} else if (num > 0 ) {
				pos += 1;
			} else zero += 1;
		}
		
		System.out.println(pos*basicFraction+"\n"+neg*basicFraction+"\n"+zero*basicFraction);
		
	}
}
