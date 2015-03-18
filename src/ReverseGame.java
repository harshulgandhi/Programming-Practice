import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ReverseGame {
	
	public static int[] reverse(int arr[], int start){
		int len = arr.length;
		if(start == len-1){return arr;}
		for(int fr = start,re = len-1;fr!=re;fr++,re--){
			arr = swapElement(arr,fr,re);
			if(fr+1 == re){break;}
		}
		return arr;
	}
	
	
	public static int[] swapElement(int arr[], int swp1, int swp2){
		System.out.println("swp1 = "+swp1+"; swp2 "+swp2);
		arr[swp1] = arr[swp1] + arr[swp2];
		arr[swp2] = arr[swp1] - arr[swp2];
		arr[swp1] = arr[swp1] - arr[swp2];
		return arr;
	}
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int numTest = sc.nextInt();
		
		int testCases[][] = new int[numTest][2];
		for(int i = 0; i<numTest;i++){
			testCases[i][0] = sc.nextInt();
			testCases[i][1] = sc.nextInt();
		}
		
		for(int i = 0; i<numTest;i++){
			int arr[] = new int[testCases[i][0]];
			for (int j = 0;j<testCases[i][0];j++){
				arr[j] = j;
			}
			
			for (int k = 0;k<testCases[i][0];k++){
				arr = reverse(arr,k);
			}
			
			System.out.println(Arrays.binarySearch(arr,arr[testCases[i][1]]));
			//System.out.println(arr[testCases[i][1]]);
		}
		
	}
	
}
