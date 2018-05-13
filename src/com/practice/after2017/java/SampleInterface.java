package com.practice.after2017.java;

public interface SampleInterface {
	default void defaultMethod() {
		System.out.println("Default");
	}

	default void defaultMethod2() {
		System.out.println("Default");
	}

	static void staticMethod() {
		System.out.println("Static");
	}

	static void staticMethod2() {
		System.out.println("Static");
	}
}
