package com.practice.before2017.TopCoder.BruteForce;

public class SuperUserDo {
	
	public int install(int[] A, int[] B) {
		int toInstall = 0;
		for(int i = 0; i<A.length; i++) {
			if(i > 0 && A[i] <= B[i-1]) {
				toInstall = toInstall + B[i] - B[i-1];
			} else {
				toInstall = toInstall + B[i] - A[i] + 1;
			}
		}
		return toInstall;
	}
	
	
	public static void main(String[] args) {
		SuperUserDo sudo = new SuperUserDo();
		int[] A = {1,101};
		int[] B = {10,110};

		System.out.println(sudo.install(A, B));
	}
}