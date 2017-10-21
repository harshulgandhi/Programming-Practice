package com.practice.before2017.MorePractice;
class MergeSort{

	int[] result = null;
	int[] arr = {9,8,7,6,5,4,3,2,1,0};

	public void merge(int lstart, int lend, int rstart, int rend){
		int auxl = lend - lstart + 1 + rend - rstart + 1;
		int[] aux = new int[auxl];

		int i = lstart;
		int j = rstart;
		int k = 0;

		while(i<= lend && j <= rend){
			if(arr[i] < arr[j]){
				aux[k] = arr[i];
				i++;
				k++;	
			}
			else{
				aux[k] = arr[j];
				j++;
				k++;	
			}
		}

		while(i<=lend){
			aux[k] = arr[i];
			i++;
			k++;
		}
		while(j<=rend){
			aux[k] = arr[j];
			j++;
			k++;
		}

		k=0;
		while(lstart <= rend){
			arr[lstart] = aux[k];
			lstart++;
			k++;
		}
	}

	public void mergeSort(int start, int end){
		if(start == end) return;
		int mid = start + (end - start)/2;
		mergeSort(start, mid);
		mergeSort(mid+1, end);
		merge(start,mid,mid+1,end);
	}

	public static void main(String[] args){
		MergeSort obj = new MergeSort();
		System.out.println("Before sorting");
		for(int eachnum : obj.arr) System.out.print(eachnum+" ");
		obj.mergeSort(0, obj.arr.length - 1);
		System.out.println("\nAfter sorting");
		for(int eachnum : obj.arr) System.out.print(eachnum+" ");

	}
}