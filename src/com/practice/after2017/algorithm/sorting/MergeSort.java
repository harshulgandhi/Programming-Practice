package com.practice.after2017.algorithm.sorting;

public class MergeSort {

	public MergeSort() {}
	private int[] merge(int[] a, int[] b) {

		int lenA = a.length;
		int lenB = b.length;
		int mergedLength = lenA + lenB;	
		int[] merged = new int[mergedLength];
		int aIdx = 0;
		int bIdx = 0;	
		int i = 0;
		for(i = 0;aIdx < lenA && bIdx < lenB; i++) {
			if(a[aIdx] <= b[bIdx]) {
				merged[i] = a[aIdx];
				aIdx++;
			} else {
				merged[i] = b[bIdx];
				bIdx++;
			}
	
		}
		while(aIdx < lenA) {
			merged[i] = a[aIdx];
			aIdx++;
			i++;
		}		 

		while(bIdx < lenB) {
			merged[i] = b[bIdx];
			bIdx++;
			i++;
		}	
		return merged;
	}

	public int[] sort(int start, int end, int[] toSort) {
		if(start == end){ 
			return new int[]{toSort[start]};
		}	
		int mid = (start+end)/2;	
		int[] first = sort(start, mid, toSort);
		int[] second = sort(mid+1, end, toSort);
		return merge(first, second);		
			
	}

	public static void main(String[] args) {
		MergeSort ms = new MergeSort();
		int[] merged = ms.sort(0, 0, new int[]{11});
		for(Integer ele : merged) {
			System.out.println(ele);
		}
	}	

}
