

public class StringRevRecursion{

	public void swap(char[] arr, int i , int j){
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public void reverseRecursion(char[] arr, int i, int j){
		if(i > j) return;
		else{
			reverseRecursion(arr,i+1, j-1);
			swap(arr, i,j);
		}
	}

	public static void main(String[] args){
		StringRevRecursion obj = new StringRevRecursion();
		String input = "reverse";
		char[] input_c = input.toCharArray();

		obj.reverseRecursion(input_c, 0, input.length()-1);
		System.out.println(new String(input_c));
	}
}