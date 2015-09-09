import java.util.Scanner;

public class MergeSort{
	// int[] arr = {7,6,12,8,9,11,2,13};
	int[] arr ={7,6,5,4,3,2,1,0};
	public  void merge(int low1, int high1, int low2, int high2){
		int len = high1-low1+1+high2-low2+1;
		int[] temp = new int[len];
		int i = low1;
		int j = high2;
		int k = 0;

		while(low1 <= high1 && low2 <= high2){
			if(arr[low1] < arr[low2]){
				// System.out.println("Updating temp at "+k+" with value (low1 = "+low1+") "+arr[low1]);
				temp[k] = arr[low1];
				low1++;
			}
			else{
				// System.out.println("Updating temp at "+k+" with value "+arr[low2]);
				temp[k] = arr[low2];
				low2++;
			}
			k++;
		}

		while(low1 < high1){
			// System.out.println("Updating temp at "+k+" with value "+arr[low1]);
			temp[k] = arr[low1];
			k++;
			low1++;
		}

		while(low2 < high2){
			// System.out.println("Updating temp at "+k+" with value "+arr[low2]);
			temp[k] = arr[low2];
			k++;
			low2++;
		}
		k = 0;
		while(i < j){
			arr[i] = temp[k];
			i++;
			k++;
		}

	}


	public  void mergeSort(int low, int high){
		if(low == high) return;
		int mid = low + (high - low)/2;
		mergeSort(low, mid);
		mergeSort(mid+1, high);
		merge(low, mid, mid+1, high);
	}

	public static void main(String[] args){
		MergeSort obj = new MergeSort();
		
		System.out.println();
		System.out.print("Print before sorting : ");
		for(int eachNum : obj.arr) System.out.print(eachNum+" ");
		obj.mergeSort(0, obj.arr.length-1);
		System.out.println();
		System.out.print("Print after sorting : ");
		for(int eachNum : obj.arr) System.out.print(eachNum+" ");
		
	}
}