package com.practice.before2017.Hackerrank.Warmup;
import java.awt.List;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import org.omg.CORBA.portable.ValueBase;

import com.practice.before2017.jp.co.worksap.global.ImmutableQueue;

import java.lang.Package;

public class MainFile {
public static void main(String[] args){
	
	/**
	 * Binary search for generic type
	 */
	/*BinarySearch bs = new BinarySearch();
	bs.getInputList();
	bs.sortList(bs.elemntList);
	bs.getElementToFind();
	bs.findElement(0,bs.numOfElements,bs.typ);*/
	
	/**
	 * Cross word puzzle solution
	 */
	/*CrossWord cw = new CrossWord();
	cw.inputQuery();*/
	
	/*
	 * Land-tree problem
	 * */
	/*Land l = new Land();
	l.input();*/
	
	/*
	 * Immutable queue
	 * */
	/*ImmutableQueue<Integer> imqueue_obj = new ImmutableQueue<Integer>();
	ImmutableQueue<Integer> imqueue_obj1 = imqueue_obj.enqueque(99);
	ImmutableQueue<Integer> imqueue_obj2 = imqueue_obj.enqueque(1099);
	imqueue_obj = imqueue_obj.enqueque(5);
	imqueue_obj = imqueue_obj.enqueque(52);
	imqueue_obj = imqueue_obj.enqueque(2);
	imqueue_obj = imqueue_obj.enqueque(89);
	
	//imqueue_obj.print();
	System.out.println();
	//imqueue_obj1.print();
	System.out.println();
	//imqueue_obj2.print();
	
	
	ImmutableQueue<Integer> imqueue_obj1_r = imqueue_obj1.dequeue();
	System.out.println("\nobj1 removed object");
	//imqueue_obj1_r.print();
	System.out.println("\nobj1 -- after removed");
	//imqueue_obj1.print();
	System.out.println("\n\nPEEKS");
	System.out.println("\nObj1 peek");
	System.out.println(imqueue_obj1.peek());
	System.out.println("\nObj2 peek");
	System.out.println(imqueue_obj2.peek());
	System.out.println("\nObj peek");
	System.out.println(imqueue_obj.peek());
	
	System.out.println("\n\nPrinting sizes");
	System.out.println("\nObj size");
	System.out.println(imqueue_obj.size());
	System.out.println("\nObj1 size");
	System.out.println(imqueue_obj1.size());
	System.out.println("\nObj2 size");
	System.out.println(imqueue_obj2.size());*/
	
	/*
	 * Calculating minimum abs difference of two numbers
	 * in an int array
	 * */
	/*MinDifference md_obj = new MinDifference();
	md_obj.input();
	System.out.println("Minimum difference in this array is : "+md_obj.find_minimum_gap(md_obj.in_arr, md_obj.N));*/
	
	/*
	 * Sorting a 2D array and printing it in 
	 * a spiral form
	 * */
	MatrixSortSpiral msp_obj = new MatrixSortSpiral();
	msp_obj.input();
	msp_obj.MatrixToArraySort();
	/*Scanner sn = new Scanner(System.in);
	int R = 4, C = 6;
	int a[][] = new int[R][C];
	System.out.println("Enter numbers for the 2D array");
	for (int i=0;i<R;i++){
		for(int j = 0;j<C;j++){
			a[i][j] = sn.nextInt();
		}
	}
	int m = R;
	int n = C;
	int i, k = 0, l = 0;
	while (k < m && l < n)
    {
         Print the first row from the remaining rows 
        for (i = l; i < n; ++i)
        {
            System.out.print( a[k][i]+"-");
        }
        k++;
 
         Print the last column from the remaining columns 
        for (i = k; i < m; ++i)
        {
            System.out.print(a[i][n-1]+"-");
        }
        n--;
 
         Print the last row from the remaining rows 
        if ( k < m)
        {
            for (i = n-1; i >= l; --i)
            {
                System.out.print(a[m-1][i]+"-");
            }
            m--;
        }
 
         Print the first column from the remaining columns 
        if (l < n)
        {
            for (i = m-1; i >= k; --i)
            {
                System.out.print(a[i][l]+"-");
            }
            l++;    
        }        
    }
*/	
}
}
