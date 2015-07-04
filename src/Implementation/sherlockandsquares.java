package Implementation;
import java.util.Scanner;
public class sherlockandsquares {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
			double A = sc.nextDouble();
			double B = sc.nextDouble();
			double A_sqrt = Math.sqrt(A);
			double B_sqrt = Math.sqrt(B);
			int count = 0;
			for (int i=(int) Math.ceil(A_sqrt);i<=(int) Math.floor(B_sqrt);i++){
				count++;
			}
			System.out.println(count);
		}
		
	}
}
