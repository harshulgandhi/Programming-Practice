package Warmup;
import java.util.ArrayList;
import java.util.Scanner;

public class SherlockGCD {
	
	public static int findGCD(int num1, int num2){
		if(num2 == 0) return num1;
		return findGCD(num2,num1%num2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
			int[] numbers = new int[sc.nextInt()];
			boolean flag = false;
			numbers[0] = sc.nextInt();
			int gcd = numbers[0];
			for (int i = 1;i<numbers.length;i++){
				numbers[i] = sc.nextInt();
				gcd = findGCD(gcd,numbers[i]);
			}
			
			if(gcd == 1) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
