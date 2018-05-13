package com.practice.after2017.java;

public class Sample {
	public int calculateArea(int l, int b) throws BreadthException {
		if (l > 1000) {
			throw new LengthException("Length is outside bounds");
		}
		if (b > 20) {
			throw new BreadthException("Breadth is outside bounds");
		}
		int area = l * b;
		if (area > 10000) {
			throw new AreaError("Area is more than expected");
		}
		return l * b;
	}

	public void area(int l, int b) throws BreadthException {
		System.out.println("Input received");
		System.out.println(this.calculateArea(l, b));
	}

	public static void main(String[] args) {
		SampleAbstract abs = new SampleAbstractExtends();
		abs.print();
		abs.abs();

		SampleAbstract abstra = new SampleAbstract() {

			@Override
			void abs() {
				// TODO Auto-generated method stub

			}
		};

		// Sample s = new Sample();
		// try {
		// s.area(1000, 11);
		// } catch (BreadthException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		// final List<SampleChild> l = new ArrayList<SampleChild>();
		// l.add(new SampleChild(2));
		// l.add(new SampleChild(3));
		// l.add(new SampleChild(5));
		// for(SampleChild sc : l) {
		// System.out.println(sc.i);
		// }
		//
		// l.get(0).setI(10);
		// for(SampleChild sc : l) {
		// System.out.println(sc.i);
		// }
		//
		// l.remove(1);
		// for(SampleChild sc : l) {
		// System.out.println(sc.i);
		// }
		// l.set(1, new SampleChild(99));
		// for(SampleChild sc : l) {
		// System.out.println(sc.i);
		// }
	}

}
