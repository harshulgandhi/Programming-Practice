package CTCI.ArraysAndStrings;
import java.util.List;
import java.util.ArrayList;

public class StringBuffer{

	private String str = "";
	private List<String> toAppend = new ArrayList<>();

	StringBuffer(){}

	StringBuffer(String str){
		this.str = str;
	}

	public void append(String strAppend){
		toAppend.add(strAppend);
	}

	public String returnString(){
		for(String eachAppendee : toAppend){
			str += eachAppendee;
		}
		return str;
	}

	public static void main(String[] args){
	StringBuffer buff = new StringBuffer();
	buff.append("abc");
	buff.append("abc");
	buff.append("abc");
	buff.append("abc");
	buff.append("abc");
	System.out.println(buff.returnString());
}
}