package com.practice.after2017.goldman;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Sample {
	public static void main(String[] args) {
		Set<Employee> sorted = new TreeSet<>(new Comparator<Employee>(){
			@Override
			public int compare(Employee o1, Employee o2) {
				return Integer.compare(o1.id, o2.id);
			}
		});
		Employee e1 = new Employee(11, "harshul");
		Employee e2 = new Employee(321, "harshul");
		Employee e3 = new Employee(1, "harshul");
		Employee e4 = new Employee(122, "harshul");
		sorted.add(e1);
		sorted.add(e4);
		sorted.add(e2);
		sorted.add(e3);
		sorted.add(e2);
		sorted.add(e4);
		
		for(Employee each : sorted) {
			System.out.println(each);
		}
	}
}

class Employee {
	int id;
	String name;
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return id + ", "+ name;
	}
}
