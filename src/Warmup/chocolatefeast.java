package Warmup;
import java.util.Scanner;
public class chocolatefeast {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T-->0){
			int countChoco = 0;
			int N = sc.nextInt();
			int C = sc.nextInt();
			int M = sc.nextInt();
			countChoco = N/C;
			int x = countChoco;
			int r = 0;
			while(x>=M){
				r = x%M;
				countChoco += x/M;
				x = x/M + r;
			}
			System.out.println(countChoco);
		}
	}
}
