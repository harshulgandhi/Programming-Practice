package Strings;
import java.util.Scanner;

public class PalindromeIndex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
			String inStr = sc.next();
			int len = inStr.length();
			boolean alreadyFound = false;
			int i=0,j=len-1;
			int removeIndex=-1;
			for( i = 0,j = len-1; (i+1!=j && i!=j &&  i<=j) ;i++,j--){
				char i_char = inStr.charAt(i);
				char j_char = inStr.charAt(j);
				
				if(i_char != j_char){
					if(inStr.charAt(i+1) == j_char && i <= j){
//						System.out.println(j);
//						alreadyFound = true;
						removeIndex = i;
						i++;
						continue;
					}
					else if(i_char == inStr.charAt(j-1) && j >= i){
//						System.out.println(i);
//						alreadyFound = true;
						removeIndex = j;
						j--;
						continue;
					}
					else{
						System.out.println(-1);
						alreadyFound = true;
						break;
					}
				}
			}
			if(!alreadyFound && (i+1 == j || i == j) && removeIndex == -1) System.out.println(-1);
			else if (!alreadyFound && (i+1 == j || i == j) && removeIndex != -1) System.out.println(removeIndex); 
		}
	}
}


/*
 * 
 * 
10
quyjjdcgsvvsgcdjjyq
hgygsvlfwcwnswtuhmyaljkqlqjjqlqkjlaymhutwsnwcflvsgygh
fgnfnidynhxebxxxfmxixhsruldhsaobhlcggchboashdlurshxixmfxxxbexhnydinfngf
bsyhvwfuesumsehmytqioswvpcbxyolapfywdxeacyuruybhbwxjmrrmjxwbhbyuruycaexdwyfpaloyxbcpwsoiqtymhesmuseufwvhysb
fvyqxqxynewuebtcuqdwyetyqqisappmunmnldmkttkmdlnmnumppasiqyteywdquctbeuwenyxqxqyvf
mmbiefhflbeckaecprwfgmqlydfroxrblulpasumubqhhbvlqpixvvxipqlvbhqbumusaplulbrxorfdylqmgfwrpceakceblfhfeibmm
tpqknkmbgasitnwqrqasvolmevkasccsakvemlosaqrqwntisagbmknkqpt
lhrxvssvxrhl
prcoitfiptvcxrvoalqmfpnqyhrubxspplrftomfehbbhefmotfrlppsxburhyqnpfmqlaorxcvtpiftiocrp
kjowoemiduaaxasnqghxbxkiccikxbxhgqnsaxaaudimeowojk

1
8
33
23
25
44
20
-1
14
-1
 * */
 