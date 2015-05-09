package Warmup;
import java.util.*;

public class CutSticksRecursive {
	
	ArrayList<Integer> sticks = new ArrayList<Integer>();
	public int getMin(){
		int min = 1001;
		for (int i = 0;i<this.sticks.size();i++){
			int x =this.sticks.get(i); 
			if(x<min && x >0){
				min = this.sticks.get(i);
			}
		}
		return min;
	}
	
	public void cutSticks(){
		int countCut = 0;
		int edgeCount = 0;
		int anyZero = 0;
		for (int k = 0;k<this.sticks.size();k++){
			if(this.sticks.get(k)<=0) edgeCount++;
			if(this.sticks.get(k)>=0) countCut++;
			if(this.sticks.get(k)==0) anyZero =1;
		}
//		System.out.println("countCut :"+countCut);
//		System.out.println("edgeCount :"+edgeCount);
		if(anyZero==1){
		System.out.println(countCut);
		}
		if(edgeCount == this.sticks.size()){return;}
		
		int min = this.getMin();
		for (int j = 0;j<this.sticks.size();j++){
			this.sticks.set(j, this.sticks.get(j)-min);
		}
		this.cutSticks();
	}
	
	public static void main(String[] args) {
		CutSticksRecursive cutObj = new CutSticksRecursive();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
//		ArrayList<Integer> sticks = new ArrayList<Integer>();
		for (int i = 0;i<N;i++){
			int num = sc.nextInt();
			cutObj.sticks.add(num);
		}
		cutObj.cutSticks();
	}
}