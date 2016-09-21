package CTCI.Recursion;


import java.util.List;
import java.util.ArrayList;

public class StringPermutation{

	List<String> result = new ArrayList<>();

	public void swap(char[] inp, int i, int j){
		char temp = inp[i];
		inp[i] = inp[j];
		inp[j] = temp;
	}

	public void printAllPermutation(){
		for(String eachString : result){
			System.out.println(eachString);
		}
	}

	public void permutate(char[] inp, int start, int end){
		if(start == end-1){
			result.add(new String(inp));
			return;
		}
		else{
			for(int i = start;i<end;i++){
				swap(inp, i, start);
				permutate(inp, start + 1, end);
				swap(inp, i, start);
			}
		}
	}

	public static void main(String[] args){
		StringPermutation perm = new StringPermutation();
		String input = "ABC";
		perm.permutate(input.toCharArray(), 0, input.length());
		perm.printAllPermutation();
	}
}