package Hackerrank.Implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AbsolutePermutations {
	
	private List<String> permutations = new ArrayList<>();
	
	private void swap(char[] c, int i, int j) {
		char temp = c[i];
		c[i] = c[j];
		c[j] = temp;
	}
	
	private void permutate(int start, int end, char[] c) {
		if (start == end - 1) {
			permutations.add(new String(c));
			return;
		}
		else {
			for ( int i = start; i<end; i++) {
				swap(c, start, i);
				permutate(start+1, end, c);
				swap(c, start, i);
			}
		}
	}
	
	private void printPermutations(String str) {
		permutate(0, str.length(), str.toCharArray());
		for (String s : permutations) System.out.println(s);
	}
	
	private StringBuffer findAbsolutePermutation(StringBuffer inp, int K) {
		int len = inp.length();
		List<Boolean> log = new ArrayList<>(inp.length());
		while(len-- > 0) log.add(false);
		StringBuffer aux = new StringBuffer(inp);
		int i = 0;
		int j = 0;
		for (i = 0; i<inp.length();i++) {
			for (j = i+1; j<inp.length();j++) {
				if(Math.abs(aux.charAt(i) - aux.charAt(j)) == K && !log.get(i) && !log.get(j)) {
					aux.setCharAt(i, inp.charAt(j));
					aux.setCharAt(j, inp.charAt(i));
					log.set(i, true);
					log.set(j, true);
 					break;
				}
			}
		}
		return log.contains(false) ? new StringBuffer("-1") : aux;
	}
	
	private int[] findAboslutePermutation2(int[] inp, int K) {
		int len = inp.length;
		List<Boolean> log = new ArrayList<>(inp.length);
		while(len-- > 0) log.add(false);
		int[] result = inp;
		
		for (int i = 0, j = i + K; i < inp.length && j < inp.length ;i++, j++) { 
			if(!log.get(i) && !log.get(j)) {
				int temp = result[i];
				result[i] = result[j];
				result[j] = temp;
				log.set(i, true);
				log.set(j, true);
			}
		}
		return log.contains(false) ? null : result;
	}
	
	private int[] findAboslutePermutationMostEfficient(int N, int K) {
		int len = N;
		List<Boolean> log = new ArrayList<>(N);
		while(len-- > 0) log.add(false);
		int[] result = new int[N];
		
		for (int i = 0, j = i + K; i < N && j < N ;i++, j++) { 
			if(!log.get(i) && !log.get(j)) {
				result[i] = j + 1;
				result[j] = i + 1;
				log.set(i, true);
				log.set(j, true);
			}
		}
		return log.contains(false) ? null : result;
	}
	
	private void printFormattedResult(int[] result) {
		if (result == null) {
			System.out.println(-1);
			return;
		}
		for (int i = 0; i<result.length; i++) {
			if(i == result.length - 1) {
				System.out.println(result[i]);
				return;
			}
			System.out.print(result[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		AbsolutePermutations o = new AbsolutePermutations();
//		o.printPermutations("12345");
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		
		while(T-- > 0) {
			int N = s.nextInt();
			int K = s.nextInt();
			int inp[] = new int[N];
			
			for (int i = 1; i<=N; i++) {
				inp[i-1] = i;
			}
			if (K == 0) {
				o.printFormattedResult(inp);
				continue;
			}
			if (N % 2 != 0 || K > N/2) {
				System.out.println("-1");
				continue;
			}
			
			int[] result = o.findAboslutePermutationMostEfficient(N, K);
			
			o.printFormattedResult(result);
		}
	}
}
