package CTCIv2.SearchingAndSorting;

import java.util.Arrays;

public class MyBinarySearch {

	public static int search(int arr[], int element) {
		Arrays.sort(arr);
		int front = 0;
		int rear = arr.length -1;
		System.out.println("Sorted array ");
		for(int a : arr) {
			System.out.print(a+" - ");
		}
		System.out.println();
		return binarySearch(arr, element, front, rear);
	}
	
	private static int binarySearch(int arr[], int element, int start, int end) {
		if(start == end || start + 1 == end) {
			if(element == arr[start]) return start;
			else if(element == arr[end]) return end;
			else return -1;
		}
		int mid = (start + end) / 2;
		System.out.println("mid : "+mid+" | start : "+start+" | end : "+end);
		if(element > arr[mid]) { 
			start = mid+1;
			return binarySearch(arr, element, start, end);
		} else if(element < arr[mid]) {
			end = mid - 1;
			return binarySearch(arr, element, start, end);
		} else {
			return mid;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {32,33,1,2,232,22,38};
		System.out.println(MyBinarySearch.search(arr, 32));
	}
}
