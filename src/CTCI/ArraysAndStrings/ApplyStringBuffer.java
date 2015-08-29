
public class ApplyStringBuffer{
	public static void main(String[] args){
		System.out.println("String buffer test");
		long startTime = System.currentTimeMillis();
		String testStr = "";
		for(int i = 0;i<50000;i++){
			testStr += "a";
		}
		long endTime = System.currentTimeMillis();
		System.out.println("String concatenation : "+(endTime - startTime));

		StringBuffer buff = new StringBuffer();
		
		startTime = System.currentTimeMillis();
		for(int i = 0;i<50000;i++){
			buff.append("a");
		}
		endTime = System.currentTimeMillis();
		System.out.println("String buffer concatenation : "+(endTime - startTime));		


	}
}