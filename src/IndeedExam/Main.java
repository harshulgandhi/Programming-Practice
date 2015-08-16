package IndeedExam;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;

public class Main {
	int max =-1;
	int[] inp;
	List<Integer> validIdx = new ArrayList<Integer>();;
	public int sumOProd(int[] inp){
//		System.out.println("Calculating sum for : "+java.util.Arrays.toString(inp));
		int len = inp.length;
		int sum = 0;
		for(int i=0;i<len-1;i++){
			sum += inp[i]*inp[i+1];
		}
		return sum;
	}
	
	
	public void permute(List<Integer> arr, int k, int[] inpCopy){
		
        for(int i = k; i < arr.size(); i++){
            Collections.swap(arr, i, k);
            permute(arr, k+1, inpCopy);
            Collections.swap(arr, k, i);
            
        }
        if (k == arr.size() -1){
//        	System.out.println("Checking for : "+java.util.Arrays.toString(arr.toArray()));
        	for(int i = 0;i<this.inp.length;i++){
    			if(!this.validIdx.contains(i)) this.inp[i] = -1;
    		}
        	for(int i = 0,j=0;i<inpCopy.length;i++){
        		if(inpCopy[i] == -1){
        			inpCopy[i] = (int) arr.toArray()[j];
        			j++;
        		}
        	}
        	int sum = sumOProd(inpCopy);
//        	System.out.println("SUM  = "+sum);
        	if(this.max < sum) this.max = sum;
        	
        }
    }
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Main obj = new Main();
		List<Integer> perm = new ArrayList<Integer>();
		
		int N = s.nextInt();
		obj.inp = new int[N];
		for(int i =0;i<N;i++){
			int num  =s.nextInt();
			int idx =s.nextInt(); 
			if( idx == -1){
				perm.add(num);
			}
			else{
				obj.validIdx.add(idx-1);
				obj.inp[idx-1] = num; 
			}
		}
		
		int[] inpCopy = obj.inp;
		obj.permute(perm, 0, inpCopy);
		System.out.println(obj.max);
	}
}
