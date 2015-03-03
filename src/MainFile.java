import java.awt.List;
import java.util.Iterator;
import java.util.LinkedList;

import org.omg.CORBA.portable.ValueBase;


public class MainFile {
public static void main(String[] args){
	
	/**
	 * Binary search for generic type
	 */
	/*BinarySearch bs = new BinarySearch();
	bs.getInputList();
	bs.sortList(bs.elemntList);
	bs.getElementToFind();
	bs.findElement(0,bs.numOfElements,bs.typ);*/
	
	/**
	 * Cross word puzzle solution
	 */
	/*CrossWord cw = new CrossWord();
	cw.inputQuery();*/
	
	/*
	 * Land-tree problem
	 * */
	/*Land l = new Land();
	l.input();*/
	
	/*
	 * Immutable queue
	 * */
	ImmutableQueue<Integer> imqueue_obj = new ImmutableQueue<Integer>();
	imqueue_obj = imqueue_obj.enqueque(5);
	imqueue_obj = imqueue_obj.enqueque(52);
	imqueue_obj = imqueue_obj.enqueque(2);
	imqueue_obj = imqueue_obj.enqueque(89);
	ImmutableQueue<Integer> imqueue_obj1 = imqueue_obj.enqueque(99);
	ImmutableQueue<Integer> imqueue_obj2 = imqueue_obj.enqueque(1099);
	imqueue_obj.print();
	System.out.println();
	imqueue_obj1.print();
	System.out.println();
	imqueue_obj2.print();
	
	
	ImmutableQueue<Integer> imqueue_obj1_r = imqueue_obj1.dequeue();
	System.out.println("\nobj1 removed object");
	imqueue_obj1_r.print();
	System.out.println("\nobj1 -- after removed");
	imqueue_obj1.print();
}
}
