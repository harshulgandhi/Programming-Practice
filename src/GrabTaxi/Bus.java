package GrabTaxi;

public class Bus {
	
	int minCost[] = new int[30];
	int daysTravelled[] = new int[30];
	
	public int solution(int[] days) {
		
		if (days.length < 4) {
			return 6;
		}
		if (days.length > 22) {
			return 25;
		}
		for (int day:days) {
			calculateMinCost(day, days);
		}
		
		int cost = 0;
		for (int i=0; i<days.length-1; i++) {
			int day = days[i];
			if (daysTravelled[days[i]] > daysTravelled[days[i+1]]) {
				cost += minCost[days[i]];
			} else {
				cost += minCost[days[i]];
			}
		}
		
		return 0;
	}

	private void calculateMinCost(int startDay, int[] days) {
		int countInWindow = 0;
		for (int day:days) {
			if (day >= startDay && day<=startDay+7) {
				countInWindow++;
			}
		}
		daysTravelled[startDay] = countInWindow;
		minCost[startDay] = countInWindow > 3 ? 7 : countInWindow * 2;
	}

}
