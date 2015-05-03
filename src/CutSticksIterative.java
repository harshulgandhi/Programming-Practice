import java.util.*;

public class CutSticksIterative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> sticks = new ArrayList<Integer>();
		for (int i = 0;i<N;i++){
			sticks.add(sc.nextInt());
		}
		Collections.sort(sticks);
//		int k = 0;
		while(sticks.size() != 0){
			for (int m = 0;m<sticks.size();m++){
				if(sticks.get(m)!=0){
					sticks.set(m, sticks.get(m)-sticks.get(0));
				}
			}
			System.out.println(sticks.size());
			sticks.removeAll(Collections.singleton(0));
//			k++;
		}
	}
}