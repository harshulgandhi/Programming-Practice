package com.practice.before2017.CTCIv2.SearchingAndSorting;

public class MergeSort {
	
	private int[] merge(int[] left, int[] right) {
		int[] result = new int[left.length + right.length];
		int resIdx = 0, i = 0, j = 0;
		for(i = 0, j=0;i<left.length && j<right.length;) {
			if(left[i] < right[j]) {
				result[resIdx] = left[i];
				i++;
				resIdx++;
			} else {
				result[resIdx] = right[j];
				j++;
				resIdx++;
			}
		}
		while(i < left.length) {
			result[resIdx] = left[i];
			i++;
			resIdx++;
		}
		while(j < right.length) {
			result[resIdx] = left[j];
			j++;
			resIdx++;
		}
		
		return result;
	}
	
	public int[] sort(int start, int end, int[] a) {
		if(start == end || start+1 == end) return merge(new int[]{a[start]}, new int[]{a[end]});
		int mid = (start+end) / 2 ;
		int[] left = sort(start, mid, a);
		int[] right = sort(mid+1, end, a);
		return merge(left, right);
	}
	
	public static void main(String[] args) {
		MergeSort ms = new MergeSort();
		int[] a = new int[]{2,3,1,5};
		int[] sorted = ms.sort(0, a.length - 1, a);
		for(int i = 0; i<sorted.length; i++) {
			System.out.print(sorted[i]+", ");
		}
		
	}
}
