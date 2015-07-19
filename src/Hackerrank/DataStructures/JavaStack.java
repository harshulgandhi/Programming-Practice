package Hackerrank.DataStructures;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class JavaStack {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(s.hasNext()){
			String in = s.nextLine();
			Stack<Character> st = new Stack<>();
			char[] arr = in.toCharArray();
			HashMap<Character, Character> oppositeBraces = new HashMap<>();
			oppositeBraces.put('{', '}');
			oppositeBraces.put('(', ')');
			oppositeBraces.put('[', ']');
			oppositeBraces.put(']', 'x');
			oppositeBraces.put('}', 'x');
			oppositeBraces.put(')', 'x');
			for(int i = 0;i<in.length();i++){
//				System.out.println("st.empty() : "+st.empty());
				if(st.empty() || oppositeBraces.get(st.peek()) != arr[i]){
//					System.out.println("pushing "+arr[i]);
					st.push(arr[i]);
				}
				else{
//					if (!st.empty()) System.out.println("popping "+st.peek());
					st.pop();
				}
			}
			System.out.println(st.empty());
		}
	}
}
