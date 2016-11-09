package Test;

import java.math.BigInteger;
import java.util.Scanner;

public class Puzzle {
	
	private BigInteger factorial(int num) {
		BigInteger fact = BigInteger.valueOf(1);
		for (long i = 1; i<=num;i++) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
//		System.out.println(fact);
		return fact;
	}
	
	private BigInteger numberOfPlaylist(int N, int K, int L) {
		if ( N == K ) return BigInteger.valueOf(0);
		return ((factorial(L-1)).divide((factorial(N-1).multiply(factorial(L-N)))));//.mod(BigInteger.valueOf(1000000007));
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int K = s.nextInt();
		int L = s.nextInt();
		Puzzle m = new Puzzle();
		System.out.println(m.numberOfPlaylist(N, K, L));
	}
}
