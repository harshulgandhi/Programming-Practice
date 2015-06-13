package Warmup;
import java.util.Scanner;
public class IsFibo {
	
	public static void fibonacci(int N, int fibo){
	
		System.out.println(fibo);
		fibo =fibo + fibonacci(N, fibo);
	}
	public static int[] getMapPopulated(int[] map){
		
		return map;
	}
	public static void main(String[] args) {
		int[] mapFibo = new int[(int) Math.pow(10,10)];
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
//		
//		while(T-->0){
//			
//		}
		
		
	}
}
