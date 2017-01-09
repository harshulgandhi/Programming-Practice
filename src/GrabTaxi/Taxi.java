package GrabTaxi;

public class Taxi {
	private static int calculateFee(int timeDiff) {
		final int INITIAL_FEE = 2;
		final int FIRST_HOUR = 3;
		final int AFTER_HOUR = 4;
		
		int totalHours = (int) Math.ceil(timeDiff / 60.0);
		System.out.println(totalHours);
		int totalFee = INITIAL_FEE + FIRST_HOUR + (totalHours - 1) * AFTER_HOUR;
		return totalFee;
		
	}
	
	public static int fee(String E, String L) {
		String[] inTime = E.split(":");
		String[] outTime = L.split(":");
		
		int inTimeMinutes = (Integer.parseInt(inTime[0]) * 60) + (Integer.parseInt(inTime[1]));
		int outTimeMinutes = (Integer.parseInt(outTime[0]) * 60) + (Integer.parseInt(outTime[1]));
		
		int timeDiff = outTimeMinutes - inTimeMinutes;
		
		return calculateFee(timeDiff);
	}
	
	public static void main(String[] args) {
		int fees = fee("00:60", "24:00");
		System.out.println(fees);	
	}
}
