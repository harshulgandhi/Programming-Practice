package CTCIv2;

public class SingletonClassOne {
	static SingletonClassOne singletonObj = new SingletonClassOne();
	private int num;
	private SingletonClassOne() {}
	
	public static SingletonClassOne getInstance() {
//		if(singletonObj == null){
//			singletonObj = new SingletonClassOne();
//		}
		return singletonObj;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	public void print(int i) {
		System.out.println("Number "+i+" is here. With number "+num);
	}
	
}
