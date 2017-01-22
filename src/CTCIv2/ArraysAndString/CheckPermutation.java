package CTCIv2.ArraysAndString;

public class CheckPermutation {
	
	public int[] getFrequencyMatrix(String str) {
		int[] freq = new int['z'-'A'];
		for(int i = 0; i<str.length(); i++){
			if(str.charAt(i) >'A' && str.charAt(i) < 'Z'){
				freq[str.charAt(i) - 'A']++;
			} else if(str.charAt(i) >'a' && str.charAt(i) < 'z'){
				freq[str.charAt(i) - 'a']++;
			}
			
		}
		return freq;
		
	}
	
	public boolean ctciSolution(String s, String t) {
		if(s.length() != t.length()) return false;
		
		int[] letters = new int[128];
		char[] s_arr = s.toCharArray();
		for(char c : s_arr) {
			letters[c]++;
		}
		
		for(int i = 0; i<t.length(); i++) {
			int c = (int) t.charAt(i);
			letters[c]--;
			if(letters[c] < 0) {
				return false;
			}
		}
		return true;
	}
	public boolean checkPermutation(String str1, String str2) {
		boolean isPermutation = true;
		int[] strOneFreq = getFrequencyMatrix(str1);
		int[] strTwoFreq = getFrequencyMatrix(str2);
		for(int j = 0; j<('z'-'A'); j++) {
			if(strOneFreq[j] != strTwoFreq[j]) return false;
		}
		return isPermutation; 
	}
	public static void main(String[] args) {
		CheckPermutation cp = new CheckPermutation();
		System.out.println(cp.checkPermutation("asBbhdAsdA", "dbsShAABda"));
		System.out.println(cp.ctciSolution("abcc", "cabc"));
	}
}
