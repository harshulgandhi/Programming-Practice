package com.practice.after2017.java;

public class SampleChild extends SampleParent {
	int i;

	SampleChild(int i) {
		this.i = i;
		System.out.println("Sample child const");
	}

	void setI(int i) {
		this.i = i;
	}
}
