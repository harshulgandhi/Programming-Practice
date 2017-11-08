package com.practice.after2017.algorithm.sorting;

public class BubbleSort {

    public void sort(int[] arr) {

        for ( int i = 1 ; i < arr.length ; i++ ) {
            for(int j = 0; j<arr.length - i; j++) {
                if(arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
    }

    private void swap(int[] arr, int idxA, int idxB) {
        int temp = arr[idxA];
        arr[idxA] = arr[idxB];
        arr[idxB] = temp;
    }

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int[] arr =  new int[]{3,2,1};
        bs.sort(arr);
        for(Integer each : arr) {
            System.out.println(each);
        }
    } 

}