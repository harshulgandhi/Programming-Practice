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

public void sortList(){
	Collections.sort(numList);
}

public void getElementToFind(){
	System.out.println("Enter element to be found: ");
	Scanner sn1 = new Scanner(System.in);
	toFind = sn1.nextInt();
}

public void findElement(){
	System.out.println("Seaching for element, please wait.... ");
		
}

}
