package Hackerrank.Warmup;
import java.util.Scanner;

public class fillingjars {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		double avg = 0.0;
		while(M-->0){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int k = sc.nextInt();
			avg += ((double)((b-a)+1)/N)*k;
		}
		System.out.println((long)avg);
	}
}
