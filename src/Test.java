import java.util.ArrayList;


public class Test {
public static void main(String[] args) {
	String s = null;
	ArrayList<Integer> test = new ArrayList<>();
	test.add(3);
	test.add(18);
	test.add(239);

	char[] c = {'*','.','M'};
	System.out.println(new String(c).contains("M"));
	if(new String(c).contains("S") ){
		System.out.println("YES");
	}
	
}
}
