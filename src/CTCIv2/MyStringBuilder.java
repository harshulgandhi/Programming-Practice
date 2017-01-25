package CTCIv2;

public class MyStringBuilder {
	private MyArrayList<String> list;
	public MyStringBuilder() {
		list = new MyArrayList<>();
	}
	MyStringBuilder(String initialStr) {
		list = new MyArrayList<>();
		list.add(initialStr);
	}
	
	public void append(String inputStr) {
		list.add(inputStr);
	}
	
	@Override
	public String toString(){
		String result = "";
		if(list.size() == 0) return result;
		
		for(int i = 0; i<list.size(); i++) {
			result = result+list.getValueAt(i);
		}
		return result;
	}
	
	public static void main(String[] args) {
		MyStringBuilder sb = new MyStringBuilder("My ");
		sb.append("is ");
		sb.append("khan");
		System.out.println(sb);
	}
}
