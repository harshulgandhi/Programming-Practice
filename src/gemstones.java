import java.util.*;
import java.io.*;
class gemstones{

public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
	int count = 0;
	for (int k = 0;k<=N;k++){
		String checkStr = sc.nextLine();
		
		for(int j = 0;j<checkStr.length();j++){
			System.out.println("value of k -- "+k); 
			System.out.println("Current char -- "+checkStr.charAt(j));
			if(hm.get(checkStr.charAt(j)) == null){
				System.out.println("IF -- ");
				hm.put(checkStr.charAt(j),0);
				System.out.println("HashMap ['"+checkStr.charAt(j)+"'] : "+hm.get(checkStr.charAt(j)));
			}
			else if(hm.get(checkStr.charAt(j)) == k){
				System.out.println("ELSE IF -- ");
				System.out.println("HashMap ['"+checkStr.charAt(j)+"'] : "+hm.get(checkStr.charAt(j)));
				continue;
				//hm.put(checkStr.charAt(j),hm.get(checkStr.charAt(j)) + 1);
			}			
			else{
				System.out.println("ELSE -- ");
				hm.put(checkStr.charAt(j),hm.get(checkStr.charAt(j)) + 1);
				System.out.println("HashMap ['"+checkStr.charAt(j)+"'] : "+hm.get(checkStr.charAt(j)));
			}
		}
	}
	System.out.println("N :: "+N);
	for (Character key: hm.keySet()){
			System.out.println("HashMap ['"+key+"'] : "+hm.get(key));
			if(hm.get(key)  == N) count++;
	}
	System.out.println(count);
}
}