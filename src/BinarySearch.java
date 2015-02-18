import java.util.*;
import java.util.ArrayList;

public class BinarySearch {

int numOfElements;
int el;
int toFind;
ArrayList<Comparable> elemntList = new ArrayList<Comparable>();
public void getInputList(){
	Scanner sn = new Scanner(System.in);
	System.out.println("What type of elements you want to enter [c for char, i for int]");
	String typ = sn.next();
	System.out.println("Enter the number of elements to be entered");
	numOfElements = sn.nextInt();
	System.out.println("Enter the list elements now:");
	for (int i = 0;i<numOfElements;i++){
		System.out.print("Enter element number "+(i+1)+": ");
			if(typ=="c"){
				elemntList.add(sn.next());
			}
			else if(typ=="i"){
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
	toFind = sn1.nextInt();
	System.out.println("Searching for element, please wait.... ");
}

public void findElement(int low, int high){
	if(low==high){
		System.out.println("\nSorry!Element not found...");
		return;
	}
	int mid = low + (high-low)/2;
	if(toFind < elemntList.get(mid)){ findElement(low, mid); }
	else if(toFind > elemntList.get(mid)){ findElement(mid+1, high); }
	else if(toFind == elemntList.get(mid)){
		System.out.println("\nElement  found\n");
		return;
	}
}

}
