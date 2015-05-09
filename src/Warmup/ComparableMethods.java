package Warmup;
import java.util.ArrayList;


public class ComparableMethods {

	public static boolean lessThan(Comparable x, Comparable y){
		return x.compareTo(y)<0;		
	}
	
	public static boolean equalTO(Comparable x, Comparable y){
		return x.compareTo(y)==0;		
	}
	
	public static void exch(ArrayList<Comparable> a, int m, int n){
		Comparable temp = a.get(m);
		a.set(m, a.get(n));
		a.set(n, temp);
						
	}
	public static ArrayList<Comparable> sort(ArrayList<Comparable> list){
		for(int i = 0;i<list.size();i++){
			for (int j=i;j>0;j--){
				if(lessThan (list.get(j),list.get(j-1)))
					exch(list,j,j-1);
				else
					break;
			}
		}
		return list;
	}
}
