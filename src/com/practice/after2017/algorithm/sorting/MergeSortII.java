package com.practice.after2017.algorithm.sorting;

public class MergeSortII {
	
	private void merge(int[] arr, int low1, int high1, int low2, int high2) {
		int len = (high1 - low1) + 1 + (high2 - low2) + 1;
		int[] merged = new int[len];
		int i = low1;
		int j = low2;
		int m = 0;
		while(i <= high1 && j <= high2) {
			if(arr[i] < arr[j]) {
				merged[m] = arr[i];
				i++;
			} else {
				merged[m] = arr[j];
				j++;
			}
			m++;
		}
		
		while(i <= high1) {
			merged[m] = arr[i];
			m++;
			i++;
		}
		while(j <= high2) {
			merged[m] = arr[j];
			m++;
			j++;
		}
		
		for(int k = low1, merge = 0; k <= high2; k++, merge++) {
			arr[k] = merged[merge];
		}
	}
	
	public void mergeSort(int[] arr, int start, int end) {
		if(start >= end) return;
		
		int mid = start + (end - start) / 2;
		
		mergeSort(arr, start, mid);
		mergeSort(arr, mid + 1, end);
		merge(arr, start, mid, mid+1, end);
	}
	
	public static void main(String[] args) {
		MergeSortII ms = new MergeSortII();
		int[] arr = new int[]{9,8,7,6,5,4,3,2};
		ms.mergeSort(arr, 0, 7);
		for(Integer each : arr) {
			System.out.print(each + "-");
		}
	}

}
