import java.util.*;
import java.util.ArrayList;

public class BinarySearch {

int numOfElements;
int el;
int toFind;
ArrayList<Integer> numList = new ArrayList<Integer>();
public void getInputList(){
	Scanner sn = new Scanner(System.in);
	System.out.println("Enter the number of elements to be entered");
	numOfElements = sn.nextInt();
	System.out.println("Enter the list elements now:");
	for (int i = 0;i<numOfElements;i++){
		System.out.print("Enter element number "+(i+1)+": ");
		//el = sn.nextInt();
		numList.add(sn.nextInt());
	}
	
}

public void sortList(ArrayList<Integer> numList){
	Collections.sort(numList);
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
	if(toFind < numList.get(mid)){ findElement(low, mid); }
	else if(toFind > numList.get(mid)){ findElement(mid+1, high); }
	else if(toFind == numList.get(mid)){
		System.out.println("\nElement  found\n");
		return;
	}
}

}
