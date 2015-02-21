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
		for(int i=0;i<numQuery;i++){
			query = sn.next();
			//Call the function to search the string here.
			if(searchHorizontal(query,mat)){
				System.out.println("FOUND");
				break;
			}
			else if(searchVertical(query,mat)){
				System.out.println("FOUND");
				break;
			}
			/*else if(searchDiagonal1(query,mat)){
				System.out.println("FOUND");
				break;
			}
			else if(searchDiagonal2(query,mat)){
				System.out.println("FOUND");
				break;
			}*/
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
			//}
		}
		return false;
	}
	
	public String reverse(String str){
		int len=str.length();
		char[] strChar = str.toCharArray();
		for (int front=0, rear=len; (front+1 != rear && front != rear) ;front++,rear--){
			char temp=strChar[front];
			strChar[front] = strChar[rear];
			strChar[rear] = temp;
		}
		
		return strChar.toString();
	}
	
	
}
