import java.util.*;

public class CutSticks {
	
	public int getMin(ArrayList<Integer> sticks){
		int min = 1001;
		for (int i = 0;i<sticks.size();i++){
			int x =sticks.get(i); 
			if(x<min && x != 0){
				min = sticks.get(i);
			}
		}
		return min;
	}
	
	public void cutSticks(ArrayList<Integer> sticks){
		int countCut = 0;
		int edgeCount = 0;
		for (int k = 0;k<sticks.size();k++){
			if(sticks.get(k)<=0) edgeCount++;
			if(sticks.get(k)<=0) countCut++;
		}
		if(edgeCount == sticks.size()){return;}
		System.out.println(countCut);
		int min = this.getMin(sticks);
		for (int j = 0;j<sticks.size();j++){
			sticks.set(j, sticks.get(j)-min);
		}
		cutSticks(sticks);
	}
	
	public static void main(String[] args) {
		CutSticks cutObj = new CutSticks();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> sticks = new ArrayList<Integer>();
		for (int i = 0;i<N;i++){
			int num = sc.nextInt();
			sticks.add(num);
		}
		
	}
}