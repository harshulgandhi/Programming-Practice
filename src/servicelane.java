import java.util.*;

class servicelane{

public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int T = sc.nextInt();
	ArrayList<Integer> freeway = new ArrayList<Integer>();
	for (int i = 0;i<N;i++){
		freeway.add(sc.nextInt());
	}
	
	for (int k = 0;k<T;k++){
	int lower = sc.nextInt();
	int upper = sc.nextInt();
	int min = 1000;
	for (int m = lower;m<=upper;m++){
		if(freeway.get(m)<min)
		{
			min = freeway.get(m);
		}
	}
	System.out.println(min);
	}
}
}