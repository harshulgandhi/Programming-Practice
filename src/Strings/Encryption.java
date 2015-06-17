package Strings;
import java.util.Scanner;

public class Encryption {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inStr = sc.nextLine();
		int len = inStr.length();
		float sqrt = (float) Math.sqrt(len);
		int sqrt_c = (int) Math.ceil(sqrt);
		int sqrt_f = (int) Math.floor(sqrt);
		int row,col;
		if (sqrt_f*sqrt_c < len){
			row = sqrt_f +1;
			col = sqrt_c;
		}
		else {
			row = sqrt_f;
			col = sqrt_c;
		}
		
		int i = 0,j=0;
		while(i < col){
			j = i;
			while(j<len){
				System.out.print(inStr.charAt(j));
				j += col;
			}
			i++;
			System.out.print(" ");
		}
	}
}
