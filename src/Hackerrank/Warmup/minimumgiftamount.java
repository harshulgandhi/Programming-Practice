package Hackerrank.Warmup;
import java.util.Scanner;

public class minimumgiftamount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
			long B = sc.nextInt();
			long W = sc.nextInt();
			long X = sc.nextInt();
			long Y = sc.nextInt();
			long Z = sc.nextInt();
			if(X+Z < Y) System.out.println(((B+W)*X)+(W*Z));
			else if(Y+Z < X) System.out.println(((B+W)*Y)+(B*Z));
			else System.out.println((B*X+W*Y));
		}
	}
}
