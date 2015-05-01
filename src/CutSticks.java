import java.util.*;

public class CutSticks {
	
	ArrayList<Integer> sticks = new ArrayList<Integer>();
	public int getCountSticksCut(int min){
		int count = 0;
		for(int i=0;i<this.sticks.size();i++){
			this.sticks.set(i, this.sticks.get(i)-min);
			count++;
			if(this.sticks.get(i) > 0){
				count++;
			}
		}
		return count;
	}
	
	public boolean getStatus(){
		for (int k = 0;k<this.sticks.size();k++){
			if(this.sticks.get(k)>0){
				return true;
			} 
		}
		return false;
	}
	

	public static void main(String[] args) {
		CutSticks cutObj = new CutSticks();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
//		ArrayList<Integer> sticks = new ArrayList<Integer>();
//		int min = 1001;
		for (int i = 0;i<N;i++){
			int num = sc.nextInt();
//			if(num<min){min = num;}
			
			cutObj.sticks.add(num);
		}
			while(cutObj.getStatus()){
				int min = Collections.min(cutObj.sticks);
				System.out.println(cutObj.getCountSticksCut(min));
		}
	}
}