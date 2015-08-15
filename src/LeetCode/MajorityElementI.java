package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MajorityElementI {
	public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        int len = nums.length;
        int benchmark = (int) Math.floor(len/2);
        for(int i = 0;i<len;i++){
        	if(!freq.keySet().contains(nums[i])) freq.put(nums[i], 1); 
        	else freq.put(nums[i], freq.get(nums[i])+1);
        }
        
        for(Integer key: freq.keySet()){
        	if(freq.get(key) > benchmark) return key;
        }
		return 0;
    }
	
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		MajorityElementI obj = new MajorityElementI();
		int N = s.nextInt();
		int[] inp = new int[N];
		for(int i = 0;i<N;i++){
			inp[i] = s.nextInt();
		}
		int output = obj.majorityElement(inp);
		System.out.println(output);
	}
}
