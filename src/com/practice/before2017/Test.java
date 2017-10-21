package com.practice.before2017;
import java.awt.Point;
import java.util.ArrayList;


public class Test {
public static void main(String[] args) {
	String s = null;
	ArrayList<Integer> test = new ArrayList<>();
	test.add(3);
	test.add(18);
	test.add(239);

	char[] c = {'*','.','M'};
	System.out.println(new String(c).contains("M"));
	if(new String(c).contains("S") ){
		System.out.println("YES");
	}

	String s1 = "Indian Rupee";
	String s2 = "Indian Rupee";
	
	System.out.println(s1.equals(s2));
	
	Point p = new Point(10,2);
	ArrayList<Point> l = new ArrayList<>();
	l.add(p);
	Point p2 = new Point(10,3);
	System.out.println(l.contains(p2));
	
}
}
