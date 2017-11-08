package com.practice.after2017.algorithm.sorting;

public class QuickSort{
    public QuickSort() {}
    public void sort(int[] arr, int start, int end) {
        if(end <= start) return;
        int pivot = partition(arr, start, end);
        sort(arr, start, pivot-1);
        sort(arr, pivot+1, end);
    }

    private int partition(int[] arr, int start, int end) {
        int pivot = end;
        int j = start;
        for(int i = start; i <= end - 1; i++) {
            if(arr[i] < arr[pivot]) {
                swap(arr, i , j);
                j++;
            } 
        }
        swap(arr, j, pivot);
        return j;
    }
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        int[] arr = new int[]{9,8,7,6,5,4,3,2,3};
        qs.sort(arr, 0, arr.length-1);
        for(Integer each : arr){
            System.out.print(each+" - ");
        }
        System.out.println();
    }
}
