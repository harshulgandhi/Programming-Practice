package com.practice.before2017.LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MajorityElementII {
	public List<Integer> majorityElement(int[] nums) {
        List<Integer> output = new ArrayList<>();
        HashMap<Integer,Integer> freq = new HashMap<>();
        int len = nums.length;
        int benchmark = (int) Math.floor(len/3);
        for(int i = 0;i<len;i++){
        	if(!freq.keySet().contains(nums[i])) freq.put(nums[i], 1); 
        	else freq.put(nums[i], freq.get(nums[i])+1);
        }
        
        for(Integer key: freq.keySet()){
        	if(freq.get(key) > benchmark) output.add(key);
        }
        return output;
    }
	
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		MajorityElementII obj = new MajorityElementII();
		int N = s.nextInt();
		int[] inp = new int[N];
		for(int i = 0;i<N;i++){
			inp[i] = s.nextInt();
		}
		List<Integer> output = obj.majorityElement(inp);
		for(Integer each:output) System.out.println(each);
	}
}
