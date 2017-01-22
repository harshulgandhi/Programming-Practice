package Hackerrank.Warmup;

import java.util.Scanner;

public class TimeConversion {

	private String timeInMilitaryClock(String timeInTwelveHr){
		int len = timeInTwelveHr.length();
//		System.out.println(timeInTwelveHr.substring(len-2)+"|"+timeInTwelveHr.substring(0, 2));
		if(timeInTwelveHr.substring(len-2).equals("AM") && !timeInTwelveHr.substring(0, 2).equals("12")) {
			return timeInTwelveHr.substring(0, len-2);
		}else if(timeInTwelveHr.substring(len-2).equals("AM") && timeInTwelveHr.substring(0, 2).equals("12")) {
			return "00"+timeInTwelveHr.substring(2,len-2);
		}else if(timeInTwelveHr.substring(len-2).equals("PM") && !timeInTwelveHr.substring(0, 2).equals("12")) {
//			System.out.println("PM");
			return (Integer.parseInt(timeInTwelveHr.substring(0,2))+12)+timeInTwelveHr.substring(2,len-2);
		}else if(timeInTwelveHr.substring(len-2).equals("PM") && timeInTwelveHr.substring(0, 2).equals("12")) {
			return timeInTwelveHr.substring(0, len-2);
		}
		return null;
	}
	public static void main(String[] args) {
		TimeConversion tc = new TimeConversion();
		Scanner sc = new Scanner(System.in);
		
		System.out.println(tc.timeInMilitaryClock(sc.nextLine()));
	}
}
