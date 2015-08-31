import java.util.Scanner;

public class UrlEncoder{
	String replace = "%20";
	private String encodeString(String str, int len){
		int _f_len = str.length();
		char[] _c_str = str.toCharArray();
		// int repl_idx = _f_len-1;
		for(int i = len-1;i>0;i--){
			if(_c_str[i] == ' '){
				_c_str[_f_len-1] = '0';
				_c_str[_f_len-2] = '2';
				_c_str[_f_len-3] = '%';
				// _c_str[repl_idx] = _c_str[i];
				_f_len-=3;
				// repl_idx--;
			}
			else{
				_c_str[_f_len-1] = _c_str[i];
				_f_len--;
			}
		}

		return new String(_c_str);

	}


	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		UrlEncoder obj = new UrlEncoder();
		String inp = s.nextLine();
		// int len = s.nextInt();
		System.out.println("Input :  "+inp+"end");
		System.out.println(obj.encodeString(inp,s.nextInt()));

	}
}