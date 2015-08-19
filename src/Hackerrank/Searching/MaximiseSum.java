package Hackerrank.Searching;
import java.util.Scanner;

public class MaximiseSum {
	
	public static long maxModuloM(long[] arr, int N, long M, long _M){
		long max = -1;
		for(int i = 0;i<N;i++){
			long sum = 0;
			for(int j = i;j<N;j++){
				sum = sum + arr[j];
				long mod = sum%M;
				if( mod > max) max = mod;
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		while(T-->0){
			int N = s.nextInt();
			long M = s.nextLong();
			long _M = M;
			long[] arr = new long[N];
			for(int i = 0;i<N;i++){
				arr[i] = s.nextLong()%M;
			}
			
			System.out.println(MaximiseSum.maxModuloM(arr, N, M, _M));
		}
	}
}
