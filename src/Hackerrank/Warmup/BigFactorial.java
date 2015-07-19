package Hackerrank.Warmup;
import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
	
	public BigInteger factorial(long num){
//		if(num == 1){
//			return BigInteger.valueOf(1); 
//		}
//		BigInteger big = BigInteger.valueOf(1);
//		big = big.multiply(factorial(num-1));
//		return big;
		BigInteger fact = BigInteger.valueOf((long)1);
		for (long i = num;i>0;i--){
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		return fact;
	}
	public static void main(String[] args) {
		BigFactorial fact = new BigFactorial();
		Scanner s = new Scanner(System.in);
		System.out.println(fact.factorial((long)s.nextInt()));
		
	}
}
