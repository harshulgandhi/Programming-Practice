package com.practice.before2017.Hackerrank.Warmup;
import java.util.Scanner;

/*
 * Cross word problem to search for a word 
 * in a given matrix - in all possible directions */
public class CrossWord {
	int R, C;
	public String[] inputData(){
		String mat[];
		Scanner sn = new Scanner(System.in);
		System.out.println("Welcome to Cross Word Puzzle program\n\n");
		System.out.println("Enter the number of rows for matrix: ");
		R = sn.nextInt();
		System.out.println("Enter the number of columns for matrix: ");
		C = sn.nextInt();
		mat=new String[R];
		System.out.println("Enter character arrays (string) for each row ");
		for (int i=0;i<R;i++){
			mat[i] = sn.next();
		}
		
		System.out.println("Matrix that you entered is : ");
		for(int i=0;i<R;i++){
			System.out.println(mat[i]+"\n");
		}
		
		return mat;
	}
	
	public void inputQuery(){
		String mat[] = inputData();
		int numQuery;
		String query;
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter number of strings you are planning to check:");
		numQuery = sn.nextInt();
		for(int i=0;i<=numQuery;i++){
			query = sn.next();
			//Call the function to search the string here.
			if(searchHorizontal(query,mat)){
				System.out.println("FOUND");
				continue;
			}
			else if(searchVertical(query,mat)){
				System.out.println("FOUND");
				continue;
			}
			else if(searchDiagonal1(query,mat)){
				System.out.println("FOUND");
				continue;
			}
			else if(searchDiagonal2(query,mat)){
				System.out.println("FOUND");
				continue;
			}
			else 
				System.out.println("NOT FOUND");
		}
	}
	
	public boolean searchHorizontal(String query, String[] mat){
		int lenQuery = query.length();
		for (int i = 0;i<R;i++){
			//for(int j=0;j<mat[i].length()-lenQuery+1;j++){
			if(mat[i].contains(query)){			//searches for query LEFT TO RIGHT
				return true;
			}
			else if(mat[i].contains(reverse(query))){		//searches for query RIGHT TO LEFT
				return true;
			}
		}
		return false;
	}
	
	public boolean searchVertical(String query, String[] mat){
		int lenQuery = query.length();
		String temp="";
		for (int i = 0;i<C;i++){
			for(int j=0;j<R;j++){
				temp+= mat[j].charAt(i);
			}
			if(temp.contains(query)){			//searches for query TOP TO BOTTOM
				return true;
			}
			else if(temp.contains(reverse(query))){		//searches for query BOTTOM to TOP
				return true;
			}
			temp="";
		}
		return false;
	}
	
	
	
	public boolean searchDiagonal1(String query,String[] mat){
		String temp="";
		for (int i=0,j = 0;j<C;j++){
			int diag = i;
			int diagcol = j;
			//int j = 0;
			while(diag<R && diagcol<C){
				temp+=mat[diag].charAt(diagcol);
				diag++;
				diagcol++;
			}
			if(temp.contains(query)){
				return true;
			}
			else if(temp.contains(reverse(query))){
				return true;
			}
			temp="";
			
		}
		for (int i=1;i<R;i++){
			int j = 0;
			int diag = i;
			while(diag<R && j<C){
				temp+=mat[diag].charAt(j);
				diag++;
				j++;
			}
			if(temp.contains(query)){
				return true;
			}
			else if(temp.contains(reverse(query))){
				return true;
			}
			temp="";
		}
		return false;
	}
	

	public boolean searchDiagonal2(String query,String[] mat){
		String temp="";
		for (int i=0,j = C-1;j>=0;j--){
			int diag = i;
			int diagcol = j;
			while(diag<R && diagcol>=0){
				temp+=mat[diag].charAt(diagcol);
				diag++;
				diagcol--;
			}
			if(temp.contains(query)){
				return true;
			}
			else if(temp.contains(reverse(query))){
				return true;
			}
			temp="";
			
		}
		for (int i=1;i<R;i++){
			int j = C-1;
			int diag = i;
			while(diag<R && j>=0){
				temp+=mat[diag].charAt(j);
				diag++;
				j--;
			}
			if(temp.contains(query)){
				return true;
			}
			else if(temp.contains(reverse(query))){
				return true;
			}
			temp="";
		}
		return false;
	}

	
	public String reverse(String str){
		int len=str.length();
		char[] strChar = str.toCharArray();
		if(len>2){
			for (int front=0, rear=len-1; (front+1 != rear && front != rear) ;front++,rear--){
				char temp=strChar[front];
				strChar[front] = strChar[rear];
				strChar[rear] = temp;
			}
		}
		else if(len==1){
			return str;
		}
		else{
			char temp=strChar[0];
			strChar[0] = strChar[1];
			strChar[1] = temp;
		}
		String b = new String(strChar);
		return b;
	}
	
	
}
