package CTCI.Recursion;


import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class StringPermutationII{
	String input = "";
	List<String> listOfPermutations = new ArrayList<>();

	public void swap(char[] c_str, int i , int j){
		char tmp = c_str[i];
		c_str[i] = c_str[j];
		c_str[j] = tmp;
	}

	public void printPermutations(){
		for(String eachPerm : listOfPermutations){
			System.out.println(eachPerm);
		}
	}

	public void permute(char[] c_str, int start, int end){
		if(start == end-1){
			listOfPermutations.add(new String(c_str));
		}
		else{
			for(int i = start;i<end;i++){
				swap(c_str, i, start);
				permute(c_str, start+1, end);
				swap(c_str, i, start);
			}
		}
	}


	public static void main(String[] args){
		StringPermutationII obj = new StringPermutationII();
		obj.input = "ABC";
		obj.permute(obj.input.toCharArray(), 0, obj.input.length());
		obj.printPermutations();
		Collections.sort(obj.listOfPermutations);
		System.out.println("Sorted");
		obj.printPermutations();
	}
}