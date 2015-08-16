package IndeedExam;
import java.util.Scanner;

public class Ball {
	int[] balls = {1,2,3,4,5,6,7,8};
	
	public void exchangeInArr(int p, int q){
		
		if(balls[p-1] > balls[q-1]){
			balls[p-1] = balls[p-1] - balls[q-1];
			balls[q-1] = balls[q-1] + balls[p-1];
			balls[p-1] = balls[q-1] - balls[p-1];
		}
		
		else {
			balls[q-1] = balls[q-1] - balls[p-1];
			balls[p-1] = balls[p-1] + balls[q-1];
			balls[q-1] = balls[p-1] - balls[q-1];
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Ball obj = new Ball();
		
		int N = s.nextInt();
		int K = s.nextInt();
		int[][] op = new int[N][2];
		for(int i = 0;i<N;i++){
			op[i][0] = s.nextInt();
			op[i][1] = s.nextInt();
		}
		while(K-->0){
			for(int i = 0;i<N;i++){
				obj.exchangeInArr(op[i][0], op[i][1]);
			}
		}
		for(int each:obj.balls) System.out.print(each+" ");
	}
}
