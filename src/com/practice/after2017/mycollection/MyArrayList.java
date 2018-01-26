package com.practice.after2017.mycollection;


public class MyArrayList<E> {

    private final int MULT_FACT = 2;
    private E[] arr;
    private final int INIT = 2;
    private int lastInsert;

    public MyArrayList() {

        arr = (E[])new Object[INIT];
        lastInsert = -1;
    }

    public void add(E element) {
        if(lastInsert == arr.length - 1) {
            copyArray();
        }
        arr[++lastInsert] = element;
    }

    private void copyArray() {
        E[] arr_n = (E[])new Object[arr.length * MULT_FACT];
        for(int i = 0; i<arr.length; i++) {
            arr_n[i] = arr[i];
        }
        arr = arr_n;
    }

    public E get(int idx) {
        return arr[idx];
    }

        public static void main(String[] args) {
        MyArrayList<Integer> myList = new MyArrayList<Integer>();

        myList.add(23);
        myList.add(1);
        myList.add(43);
        myList.add(432);
        myList.add(403);
        myList.add(993);
        myList.add(4329);
        myList.add(99);
        myList.add(15);

        System.out.println(myList.get(1));
        System.out.println(myList.get(0));
        System.out.println(myList.get(4));
        System.out.println(myList.get(8));
    }
}