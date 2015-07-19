package Hackerrank.Strings;
import java.util.*;
public class AlternatingCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
			String inputStr = sc.next();
			int i = 0,count =0;
			String inStr = inputStr;
			for(int j = 0;j<inStr.length()-1;j++){
				if(i < inStr.length() && inStr.charAt(i) == inStr.charAt(i+1)){
					count++;
				}
				else{
					if( i == inputStr.length()){ break;}
				}
				i++;
			}
			System.out.println(count);
		}
	}
}
