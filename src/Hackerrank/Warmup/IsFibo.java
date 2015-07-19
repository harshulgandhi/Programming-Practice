package Hackerrank.Warmup;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class IsFibo {
	
	public static void main(String[] args) {
		long MAXINT = (long)Math.pow(10,10);
		List<Long> fibo = new ArrayList<Long>();
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		long prev = 1L;
		long pprev = 0L;
		fibo.add(pprev);
		fibo.add(prev);
		long fib=0L;
		while(fib < MAXINT){
			fib = prev + pprev;
			fibo.add(fib);
			pprev = prev;
			prev = fib;
		}
		while(T-->0){
			long N = sc.nextLong();
			if(fibo.contains(N)) System.out.println("IsFibo");
			else System.out.println("IsNotFibo");
		}
	}
}
