//package jp.co.worksap.global;
import java.util.*;
import java.lang.IllegalArgumentException;
import java.lang.Exception;

/** * The Queue class represents 
 * an immutable first-in-first-out (FIFO)
 *  queue of objects.  
 *  @param <E> 
 */

public class ImmutableQueue<E>{
	/*
	 * requires default constructor
	 * */
	private final LinkedList<E> immutableq;
	
	public ImmutableQueue(){
		//modify this constructor if necessary, but do not remove default constructor
		immutableq = new LinkedList<E>(); 
	}
	
	public ImmutableQueue(LinkedList<E> immutableQ){
		//modify this constructor if necessary, but do not remove default constructor
		immutableq = new LinkedList<E>();
		if(immutableQ != null){
			this.immutableq.addAll(immutableQ);
		}
	}
	
	//add other constructors if necessary
	
	/*
	 * Returns the queue that adds an item into the tail of this queue without modifying this queue
	 * If the element e is null, throws IllegalArgumentException
	 * @param e
	 * @return
	 * @throws IllegalArgumentException
	 * */
	public ImmutableQueue<E> enqueque(E e){
		if(e.equals(null)){
			throw new IllegalArgumentException();
		}
		ImmutableQueue<E> q_copy = new ImmutableQueue<E>(this.immutableq);
		q_copy.immutableq.add(e);
		return q_copy;
	}
	
	/*
	 * Returns the queue that removes the object at the head of this queue without modifying this queue
	 * If queue is empty, throw java.util.NoSuchElementException
	 * @return
	 * @throws java.util.NoSuchElementException 
	 * */
	public ImmutableQueue<E> dequeue(){
		
		return null;
	}
	
	public void print(){
		Iterator itr = this.immutableq.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+"-");
		}
	}
	
}