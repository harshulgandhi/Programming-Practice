package com.practice.before2017.IndeedExam;
import java.util.Scanner;

public class Rotate {
	
	char[] inpArr;
	
	public void rotate(int L, int R, int K){
//		System.out.println("Rotating : "+new String(this.inpArr));
		int rot = K % (R-L); // actual rotation count
//		System.out.println("rot "+rot);
		String inStr = new String(this.inpArr);
		String toRot = inStr.substring(R-rot, R);
//		System.out.println("toRot "+toRot);
		String toRep = inStr.substring(L-1, R-rot);
//		System.out.println("toRep "+toRep);
		for(int i = L, j = 0, k = 0;i<R;i++){
			if(j == toRot.length() -1 ){
				this.inpArr[i-1] = toRep.toCharArray()[k];
			}
			else if(!( j == toRot.length()-1 )){
			this.inpArr[i-1] = toRot.toCharArray()[j];
			j++;
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Rotate obj = new Rotate();
		int N = s.nextInt();
		String inStr = s.next();
		obj.inpArr = inStr.toCharArray();
		int M = s.nextInt();
		while(M-->0){
			int L = s.nextInt();
			int R = s.nextInt();
			int K = s.nextInt();
			obj.rotate(L, R, K);
		}
		
		System.out.println(new String(obj.inpArr));
	}
}
