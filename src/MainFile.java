
public class MainFile {
public static void main(String[] args){
	
	/**
	 * Binary search for generic type
	 */
	BinarySearch bs = new BinarySearch();
	bs.getInputList();
	bs.sortList(bs.elemntList);
	bs.getElementToFind();
	bs.findElement(0,bs.numOfElements,bs.typ);
	
}
}
