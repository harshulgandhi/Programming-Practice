package Implementation;
import java.util.Scanner;

public class timeinwords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		String[] minuteWords = {"o' clock","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen",
								"fourteen","quarter","sixteen","seventeen","eighteen","nineteen","twenty","half"};
		if(M == 0){
			System.out.println(minuteWords[H]+" "+minuteWords[M]);
		}
		else if(M<30){
			if(M<=20) {
				if(M == 1) System.out.println(minuteWords[M]+" minute past "+minuteWords[H]);
				else if(M == 15)System.out.println(minuteWords[M]+" past "+minuteWords[H]);
				else System.out.println(minuteWords[M]+" minutes past "+minuteWords[H]);
			}
			else if (M>20) System.out.println(minuteWords[20]+" "+minuteWords[M%10]+" minutes past "+minuteWords[H]);
		}
		else if(M == 30){
			System.out.println(minuteWords[21]+" past "+minuteWords[H]);
		}
		else if (M > 30){
			if((60-M)<=20){
				if((60-M) == 1) System.out.println(minuteWords[60-M]+" minute to "+minuteWords[H+1]);
				else if((60-M) == 15)System.out.println(minuteWords[60-M]+" to "+minuteWords[H+1]);
				else System.out.println(minuteWords[60-M]+" minutes to "+minuteWords[H+1]);
			}
			else if ((60-M)>20) System.out.println(minuteWords[20]+" "+minuteWords[(60-M)%10]+" minutes to "+minuteWords[H+1]);
		}
	}
}
