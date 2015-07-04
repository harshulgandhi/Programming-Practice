package Implementation;
import java.util.*;

class utopiantree{

public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int T = sc.nextInt();
	ArrayList<Integer> freeway = new ArrayList<Integer>();
	for (int i = 0;i<T;i++){
		int cycle = sc.nextInt();
		int init = 1;
		for(int k = 0;k<cycle;k++){
		if(k%2 == 0) init=2*init;
		else init +=1;
		}		
		System.out.println(init);
	}
}
}