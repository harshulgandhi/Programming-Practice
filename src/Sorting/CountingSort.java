package Sorting;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;


public class CountingSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i =  N;
		HashMap<Integer,String> inputMap = new HashMap<>();
		int[] freq = new int[100];
		while(i-->N/2){
			int input = sc.nextInt();
			String inputVal = sc.next();
			sc.nextLine();
			freq[input]++;
			if(inputMap.get(input) == null) inputMap.put(input,"- "); 
			else inputMap.put(input,inputMap.get(input) + "- ");
			}
		while(i-->=0){
			int input = sc.nextInt();
			freq[input]++;
			if(inputMap.get(input) == null) inputMap.put(input,sc.next()+" "); 
			else inputMap.put(input,inputMap.get(input) + sc.next()+" ");
//			sc.nextLine();
			
		}
		
		StringBuilder output = new StringBuilder();
//		String str="";
		for (int j = 0;j<100;j++){
			if(freq[j] > 0){
				output.append(inputMap.get(j));
//				str = str + inputMap.get(j);
			}
		}
//		System.out.println(output);
		}
}
