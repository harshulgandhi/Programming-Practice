package Hackerrank.Sorting;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;

public class CountingSortCummulativeFreq {
	
	public static void countingSort(int[] freq){
		int prev = 0;
		for(int i = 0;i<100;i++){
			if(i == 0){
				System.out.print(freq[i]+" ");
				prev = freq[i];
			}
			else{
				System.out.print((freq[i]+ prev) +" ");
				prev = freq[i]+ prev;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		HashMap<Integer,List<String>> inputMap = new HashMap<>();
		int[] freq = new int[100];
		while(N-->0){
			int input = sc.nextInt();
			freq[input]++;
			if(inputMap.get(input) == null){
				inputMap.put(input, new ArrayList<String>());
			}
			inputMap.get(input).add(sc.next());
		}
		
		countingSort(freq);
	}
}
