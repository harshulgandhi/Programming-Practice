package Warmup;
import java.util.*;

class finddigit{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	for (int i = 0;i<T;i++){
		int count = 0;
		int NUM = sc.nextInt();
		int N = NUM;
		while(N!=0){
			int div = N%10;
			if(div!=0){
				if(NUM%div==0) count++;
				}
			N = N/10;
			}
		System.out.println(count);
		}
	}
}