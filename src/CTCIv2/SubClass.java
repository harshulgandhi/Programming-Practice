package CTCIv2;

public class SubClass extends SuperClass {

	public void print(){
		System.out.println("Sub class: Inside sub class");
	}
	
	public static void main(String[] args) {
		SuperClass sup = new SuperClass(); // COMPILE TIME BINDING
		SuperClass supp = new SubClass();  // RUN TIME BINDING
		SubClass sub = new SubClass();     // COMPILE TIME BINDING
		
		sup.print();
		supp.print();
		sub.print();
	}
}
