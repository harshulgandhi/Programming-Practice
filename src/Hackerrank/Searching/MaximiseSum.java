package Hackerrank.Searching;
import java.util.Scanner;

public class MaximiseSum {
	
	public static long maxModuloM(long[] arr, int N, long M, long _M){
		while(_M -- >0){
			for(int i = 0;i<N-1;i++){
				long sum = arr[i];
				for(int j = i+1;j<N;j++){
					sum = sum + arr[j];
					if(sum%M == _M) return _M;
				}
			}
		}
		return -1;
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
