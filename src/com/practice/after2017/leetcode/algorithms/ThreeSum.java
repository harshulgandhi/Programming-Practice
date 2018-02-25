package com.practice.after2017.leetcode.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/3sum-closest/description/
 * https://leetcode.com/problems/4sum/description/
 * 
 * */
public class ThreeSum {
	public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length<3) return result;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++) {
        	if(i == 0 || nums[i] > nums[i-1]) {
	        	int l = i + 1;
	        	int r = nums.length - 1;
	        	while(l < r) {
	        		int sum = nums[i] + nums[l] + nums[r];
	        		if(nums[i] + nums[l] + nums[r] == 0) {
	        			result.add(Arrays.asList(nums[i], nums[l], nums[r]));
	        			l++;
	        			r--;
		        		while(l < r && nums[l] == nums[l-1]) {
		        			l++;
		        		}
		        		while(l < r && nums[r] == nums[r+1]) {
		        			r--;
		        		}
	        		} else if(sum < 0) {
	        			l++;
	        		} else {
	        			r--;
	        		}
	        		
	        	}
        	}
        }
        return result;
    }
	
	public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length < 4) return result;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 3; i++) {
        	if(i != 0 && nums[i] == nums[i-1]) {
        		continue;
        	}
        	for(int j = i+1; j < nums.length - 2; j++) {
        		if(j!=i+1 && nums[j] == nums[j-1]) {
        			continue;
        		}
	        	int num1 = nums[i];
	        	int num2 = nums[j];
	        	int l = j + 1;
	        	int r = nums.length - 1;
	        	while(l < r) {
	        		int sum = num1 + num2 + nums[l] + nums[r];
	        		if(sum == target) {
	        			result.add(Arrays.asList(num1, num2, nums[l], nums[r]));
	        			l++;
	        			r--;
		        		while(l < r && nums[l] == nums[l-1]) {
		        			l++;
		        		}
		        		while(l < r && nums[r] == nums[r+1]) {
		        			r--;
		        		}
	        		} else if(sum < target) {
	        			l++;
	        		} else {
	        			r--;
	        		}
	        		
	        	}
	        }
        }
        return result;
    }
	
	public static void main(String[] args) {
		List<List<Integer>> result = fourSum(new int[]{0,0,0,0}, 0);
		for(List<Integer> each : result) {
			for(Integer num:each) {
				System.out.print(num + ", ");
			}
			System.out.println();
		}
	}
}
