package CTCIv2.ArraysAndString;

public class EditDistance {
	private int[] frequencyArray(String str) {
		int[] arr = new int[26];
		for(int i = 0; i<str.length(); i++) {
			arr[str.charAt(i) - 'a']++;
		}
		return arr;
	}
	
	public boolean isOneEditDistanceAway(String A, String B) {
		if(Math.abs(A.length() - B.length()) >= 2) return false;
		int[] a = frequencyArray(A);
		int[] b = frequencyArray(B);
		int distance=0;
		for(int i = 0; i<26; i++) {
			distance += Math.abs(a[i] - b[i]);
			if(distance>2) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		EditDistance ed = new EditDistance();
		
		System.out.println(ed.isOneEditDistanceAway("abcde", "abddd"));
	}
}
