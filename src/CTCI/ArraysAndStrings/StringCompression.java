package CTCI.ArraysAndStrings;

import java.lang.StringBuffer;
public class StringCompression{

	public int sizeOfCompressed(String input){
		char[] c_input = input.toCharArray();
		char last = c_input[0];
		int count = 1;
		int size = 0;
		for(int i = 0;i<input.length();i++){
			if(c_input[i] == last){
				count++;
			}else{
				last = c_input[i];
				size = size + (""+count).length() + 1;
				count = 1;
			}
		}
		size = size + (""+count).length() + 1;

		return size;
	}


	public String bestCompression(String input){
		if(input == null || input.length() == 0) return null;

		if(input.length() < sizeOfCompressed(input)) return input;

		StringBuffer outputStr = new StringBuffer();
		char[] c_input = input.toCharArray();
		char last = c_input[0];
		int count = 1;
		for(int i = 0;i<input.length();i++){
			if(c_input[i] == last){
				count++;
			}
			else{
				outputStr.append(last+""+count);
				last = c_input[i];
				count = 1;
			}
		}

		outputStr.append(last+""+count);

		return outputStr.toString();
	}

	public static void main(String arfs[]){
		StringCompression compObj = new StringCompression();
		System.out.println(compObj.sizeOfCompressed("aabccccaaa"));
		System.out.println(compObj.bestCompression("aabccccaaa"));

	}
}