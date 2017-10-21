package com.practice.before2017.GrabTaxi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
	int count = 0;
	public void check(int[] A, int curr, int next){
		if(next == A.length) return;
		check(A, curr, next+1);
		if(A[next] == curr){
			count ++;
		}
	}
	
	 public int solution(int[] A) {
		 int len = A.length;
		 for(int i = 0;i<len-1;i++){
			 check(A, A[i], i+1);
		 }
		 
		 return count;
	    }
	 
 public static void main(String[] args) {
		Solution obj = new Solution();
		int[] arr = {1,1,1,5,1,1,5};
		obj.solution(arr);
		System.out.println(obj.count);
		
	}
}