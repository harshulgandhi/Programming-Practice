package Hackerrank.Strings;
import java.util.*;

public class FunnyString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
			String inString = sc.next();
			boolean funnyFlag = true;
			for (int i = 0,j=inString.length()-1;;i++,j--){
				//System.out.println("pairs of i & j : i = "+i+" i+1 ="+(i+1)+"|||j = "+j+ " j-1 = "+(j-1));
				if(Math.abs((int)inString.charAt(i) - (int)inString.charAt(i+1)) == Math.abs((int)inString.charAt(j) - (int)inString.charAt(j-1))){
					if((i+1 == j && i == j-1) || (i+1 == j-1)) break;
					continue;
				}
				else{
					funnyFlag = false;
					break;
				}
			}
			if(funnyFlag) System.out.println("Funny");
			else System.out.println("Not Funny");
		}
	}
}

/*
2
ivvkxq
ivvkx
 * */
