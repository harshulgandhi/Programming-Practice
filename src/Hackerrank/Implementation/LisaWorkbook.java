package Hackerrank.Implementation;

import java.util.Scanner;

public class LisaWorkbook {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int pageNumber = 0;
		int specialProblems = 0;
		for ( int i = 0; i < n; i++){
			int t_i = s.nextInt();
			int chapterPages = t_i < k ? 1 : t_i % k == 0 ? t_i / k : t_i / k + 1;
			
//			System.out.println("[ch "+(i+1)+"]No of questions = "+t_i+" and no of pages this chapter will span thru is = "+chapterPages);
			int j = 0;
			int m = 1;
			// Iterating each page
			
			while ( j < chapterPages) {
				++pageNumber;
//				System.out.println("Page : "+pageNumber+" m = "+m);
				for (int n1 = 0; n1 < k && m <= t_i ; m++, n1++ ) {
//					System.out.println("Scan Stats:\n[ch "+(i+1)+"] Question number "+m+" and page in chapter is "
//							+ (j+1) + " and page number over all is "+pageNumber);
					if ( m == pageNumber){
						specialProblems++;
					}
				}
				j++;
			}
			
//			System.out.println("============Next Chapter============");
		}
		
		System.out.println(specialProblems);
	}
}
