package Implementation;
import java.util.Scanner;
public class KaprekarNumber {
	
	public static boolean checkKaprekar(long N){
//		System.out.println("Checking : "+N);
		long sqr = N*N;
		int l,r;
		int digits = sqr==0?1:(1 + (int)Math.floor(Math.log10(Math.abs(sqr))));
		//System.out.println("No of digits : "+digits);
		if(digits%2 == 0){
			r = digits/2;
			l = digits/2;
		}
		else {
			r = (digits/2) +1;
			l = digits/2;
		}
//		System.out.println("l digits : "+l +" || r digits : "+r);
		int l_num = 0; int r_num = 0;
		for(int i=digits;i>0;i--){
			
			if(i > digits-r){
				r_num += (Math.pow(10, digits-i))*(sqr%10);
				sqr /= 10;
			}
			else{
				l_num += (Math.pow(10, l-i))*(sqr%10);
				sqr /= 10;
			}
//		System.out.println("l number : "+l_num +" || r number : "+r_num);
		}
		return (l_num+r_num == N);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long p = sc.nextLong();
		long q = sc.nextLong();
		boolean atleastOneFound = false;
		while(p<=q){
			if(checkKaprekar(p)){
				System.out.print(p+" ");
				atleastOneFound = true;
			}
			p++;
		}
		
		if(!atleastOneFound) System.out.println("INVALID RANGE");
	}
}
