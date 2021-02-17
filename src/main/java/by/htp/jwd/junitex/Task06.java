package by.htp.jwd.junitex;

//6.Идет n-я секунда суток, определить, сколько полных часов, полных минут и
// секунд прошло к этому моменту.

public class Task06 {

	public int[] task06(int sec) {

		int minute = 0;
		int hour = 0;
		int[] result;

		while (sec > 3600) {
			sec = sec - 3600;
			hour++;
		}
		while (sec > 60) {
			sec = sec - 60;
			minute++;
		}

		result = new int[] { hour, minute, sec };
		return result;
	}

}
