package Hackerrank.Warmup;
import java.util.*;
import java.util.ArrayList;

public class BinarySearch {

int numOfElements;
int el;
int toFindInt;
String toFindChar;
String typ;
ArrayList<Comparable> elemntList = new ArrayList<Comparable>();
public void getInputList(){
	Scanner sn = new Scanner(System.in);
	System.out.println("What type of elements you want to enter [c for char, i for int]");
	typ = sn.next();
	System.out.println("Enter the number of elements to be entered");
	numOfElements = sn.nextInt();
	System.out.println("Enter the list elements now:");
	for (int i = 0;i<numOfElements;i++){
		System.out.print("Enter element number "+(i+1)+": ");
			if(typ.equals("c")){
				elemntList.add(sn.next());
			}
			else if(typ.equals("i")){
				elemntList.add(sn.nextInt());
			}
	}
	
}

public void sortList(ArrayList<Comparable> numList){
	elemntList=ComparableMethods.sort(elemntList);
}

public void getElementToFind(){
	System.out.println("Enter element to be found: ");
	Scanner sn1 = new Scanner(System.in);
	if (typ.equals("c")){ toFindChar = sn1.next(); }
	if (typ.equals("i")){ toFindInt = sn1.nextInt(); }
	
	System.out.println("Searching for element, please wait.... ");
}

public void findElement(int low, int high, String typ){
	if(low==high){
		System.out.println("\nSorry!Element not found...");
		return;
	}
	int mid = low + (high-low)/2;
	if(typ.equals("c")){
		if(ComparableMethods.lessThan(toFindChar,elemntList.get(mid))){ findElement(low, mid,typ); }
		else if(ComparableMethods.lessThan(elemntList.get(mid),toFindChar)){ findElement(mid+1, high,typ); }
		else if(ComparableMethods.equalTO(toFindChar,elemntList.get(mid))){
			System.out.println("\nElement  found\n");
			return;
		}
	}
	else if(typ.equals("i")){
		if(ComparableMethods.lessThan(toFindInt,elemntList.get(mid))){ findElement(low, mid,typ); }
		else if(ComparableMethods.lessThan(elemntList.get(mid),toFindInt)){ findElement(mid+1, high,typ); }
		else if(ComparableMethods.equalTO(toFindInt,elemntList.get(mid))){
			System.out.println("\nElement  found\n");
			return;
		}
	}
}
	

}
