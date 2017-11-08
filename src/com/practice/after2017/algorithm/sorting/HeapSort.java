package com.practice.after2017.algorithm.sorting;

public class HeapSort {

    public void sort(int[] arr) {
        for(int i = 0; i<arr.length - 1; i++) {
            heapify(arr, i, arr.length -1 -i);
            swap(arr, 0, arr.length - 1 - i);
        }
    }

    private void heapify(int[] arr, int start, int end) {
        for(int curr = end; curr > 0; curr--) {
            int parent = getParent(curr);
            if(arr[parent] < arr[curr]) {
                swap(arr, parent, curr);
            }
        }
    }

    private int getParent(int index) {
        return (index % 2 == 0) ? (index-2) / 2 : (index-1) / 2;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main (String[]  args) {
        HeapSort hs = new HeapSort();
        int[] arr = new int[]{7};
        hs.sort(arr);
        System.out.println();
        for(Integer each : arr) {
            System.out.print(each+" - ");
        }
    }
}