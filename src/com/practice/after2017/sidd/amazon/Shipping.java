package com.practice.after2017.sidd.amazon;

public class Shipping {
    public static int minimalNumberOfPackages(int items, 
                                              int availableLargePackages, 
                                              int availableSmallPackages) {
        
    	if (items < 5) {
    		if(availableSmallPackages >= items) {
    			return items;
    		} else { 
    			return -1;
    			}
    	} else {
    		int allowedLargePackages = items / 5;
    		int numberOfLargePackages = Math.min(availableLargePackages, allowedLargePackages);
    		int neededSmallerPackages = items - (numberOfLargePackages * 5);
    		if (neededSmallerPackages > availableSmallPackages) {
    			return -1;
    		}
    		return numberOfLargePackages + neededSmallerPackages;
    	}
    }
    
    public static void main(String[] args) {
        System.out.println(minimalNumberOfPackages(4,1,0));
    }
}

