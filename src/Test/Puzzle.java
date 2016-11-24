package Test;

import java.math.BigInteger;
import java.util.Scanner;

public class Puzzle {
	
	static BigInteger factorial(int num) {
		BigInteger fact = BigInteger.valueOf(1);
		for (long i = 1; i<=num;i++) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
//		System.out.println(fact);
		return fact;
	}
	
	static int numberOfPlaylist(int N, int K, int L) {
		if ( N == K ) return 0;
		else if (N == K && K == L) return 1;
		
//		BigInteger temp1 = (((factorial(N)).divide((factorial(K).multiply(factorial(N-K))))));
		BigInteger temp1 = (factorial(N)).multiply(factorial(N));
		
//		BigInteger temp2 = BigInteger.valueOf(N).pow(L-N);
		BigInteger temp2 = (factorial(K)).multiply(factorial(N-K)).multiply(factorial(L-N)).multiply(factorial(2*N-L));
		return (temp1.multiply(temp2)).mod(BigInteger.valueOf(1000000007)).intValue();
//		return (((factorial(L-1)).divide((factorial(N-1).multiply(factorial(L-N))))).mod(BigInteger.valueOf(1000000007))).intValue();
//		return (((factorial(L+N-K)).divide((factorial(N-1).multiply(factorial(L-K+1))))).mod(BigInteger.valueOf(1000000007))).intValue();
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int K = s.nextInt();
		int L = s.nextInt();
//		Puzzle m = new Puzzle();
		System.out.println(Puzzle.numberOfPlaylist(N, K, L));
	}
}
