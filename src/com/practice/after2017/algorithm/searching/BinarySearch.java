package com.practice.after2017.algorithm.searching;

import com.practice.after2017.algorithm.sorting.QuickSort;

public class BinarySearch {

    public int search(int[] arr, int ele) {
        QuickSort qs = new QuickSort();
        qs.sort(arr, 0, arr.length - 1);

        return binarySearch(arr, 0, arr.length - 1, ele);
    }

    private int binarySearch (int[] arr, int start, int end, int ele) {
        if(end < start) return -1;

        int mid = start + (end - start)/2;

        if(arr[mid] == ele) return mid;
        else if (arr[mid] < ele) return binarySearch(arr, mid+1, end,ele);
        else return binarySearch(arr, start, mid-1, ele);

    }


    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] arr = new int[]{1,2,3};
        System.out.println(bs.search(arr, 23));
    }
}