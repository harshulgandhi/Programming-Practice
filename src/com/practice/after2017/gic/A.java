package com.practice.after2017.gic;

public class A {
	public int largestSum(int[] inp) {
		int largestSum = Integer.MIN_VALUE;
		int currentLargest = 0;

		for (int i = 0; i < inp.length; i++) {
			currentLargest = currentLargest + inp[i];
			currentLargest = currentLargest < 0 ? 0 : currentLargest;
			largestSum = currentLargest > largestSum ? currentLargest : largestSum;
		}
		return largestSum;
	}

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.largestSum(new int[] { -10, 2, 3, -2, 0, 5, -15 }));
		// -2, -3, 4, -1, -2, 1, 5, -3 }));
	}
}
