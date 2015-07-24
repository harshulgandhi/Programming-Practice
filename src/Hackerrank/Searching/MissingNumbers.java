package Hackerrank.Searching;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MissingNumbers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		HashMap<Integer,Integer> freqA = new HashMap<>();
		HashMap<Integer,Integer> freqB = new HashMap<>();
		for(int i = 0 ;i<N;i++){
			int num = s.nextInt();
			if(freqA.keySet().contains(num)) freqA.put(num, freqA.get(num)+1);
			else freqA.put(num,1);
		}
		
		int M = s.nextInt();
		for(int i = 0 ;i<M;i++){
			int num = s.nextInt();
			if(freqB.keySet().contains(num)) freqB.put(num, freqB.get(num)+1);
			else freqB.put(num,1);
		}
		
//		System.out.println(freqA);
//		System.out.println(freqB);
		List<Integer> output = new ArrayList<>();
		for(Integer key:freqA.keySet()){
			if(freqB.keySet().contains(key)){
				int diff = freqB.get(key) - freqA.get(key);
				if(diff>0){
					output.add(key);
				}
			}
		}
		
		Collections.sort(output);
		for(Integer each:output) System.out.print(each+" ");
		
	}
}
