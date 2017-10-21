package com.practice.after2017.sidd.amazon;

import java.util.HashSet;
import java.util.Set;

public class Branches {
    public static int count(int[] tree) {
    	int branches = 0;
    	Set<Integer> branch = new HashSet<>();
       for (int i = 0; i<tree.length;i++){
    	   if(tree[i] != -1) { 
    		   branch.add(tree[i]);
    	   }
       }
       
       return branch.size();
    }

    public static void main(String[] args) {
        System.out.println(Branches.count(new int[] { 1, 2, -1 }));
    }
}
