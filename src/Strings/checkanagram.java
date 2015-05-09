package Strings;
import java.util.*;
import java.io.*;
class checkanagram{

public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
	String checkStr = sc.nextLine();
	for(int j = 0;j<checkStr.length();j++){
		if(hm.get(checkStr.charAt(j)) != null){
			hm.put(checkStr.charAt(j),hm.get(checkStr.charAt(j)) + 1);
		}
		else{
		hm.put(checkStr.charAt(j),1);
		}
	}
	int even = 0;
	int odd = 0;
	for (Character key: hm.keySet()){
		if(hm.get(key) % 2 == 0) even++;
		else odd++;
	}
	if(odd <=1){
		System.out.println("YES");
	}
	else System.out.println("NO");
	}
}