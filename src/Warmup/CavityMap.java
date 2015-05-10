package Warmup;
import java.util.Scanner;
public class CavityMap {
	public char[][] fillRow(char[][] map,String num, int row){
		int i = 0;
		while(i<num.length()){
			map[row][i] = num.charAt(i);
			i++;
		}
		return map;
	}
	public static void main(String[] args) {
		CavityMap cm_obj = new CavityMap();
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		char [][] cavMap = new char[T][T];
		int row = 0;
		while(row<T){
			String num = sc.next();
			cavMap = cm_obj.fillRow(cavMap,num,row);
			row++;
		}
		for(int i = 0;i<T;i++){
			for(int j = 0;j<T;j++){
				if(i>=1 && j>=1 && j < T-1 && i<T-1){
					if(cavMap[i][j]>cavMap[i-1][j] && cavMap[i][j]>cavMap[i+1][j] && cavMap[i][j]>cavMap[i][j-1] && cavMap[i][j]>cavMap[i][j+1]){
						System.out.print('X');
						continue;
					}
				}
				System.out.print(cavMap[i][j]);
			}
			System.out.println();
		}
	}
}
