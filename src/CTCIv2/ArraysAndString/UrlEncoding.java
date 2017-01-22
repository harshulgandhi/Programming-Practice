package CTCIv2.ArraysAndString;

public class UrlEncoding {
	
	private void shiftRightByTwo(char[] inp, int idx) {
		int i = inp.length-1;
		while(inp[i] == ' '){
			i--;
		}
		for(int j = i; j>= idx; j--) {
			inp[j+2] = inp[j];			
		}
	}
	public String urlEncodedString(String inp) {
		char[] inpArr = inp.toCharArray();
		for(int i = 0; i<inp.length(); i++) {
			if(inpArr[i] == ' ') {
				shiftRightByTwo(inpArr, i+1);
				inpArr[i] = '%';
				inpArr[i+1] = '2';
				inpArr[i+2] = '0';
			}
			
		}
		return new String(inpArr);
	}
	
	public static void main(String[] args) {
		UrlEncoding ue = new UrlEncoding();
		System.out.println(ue.urlEncodedString("Mr John Smith    "));
	}
}
