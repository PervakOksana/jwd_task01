package by.htp.jwd.junitex;

import java.util.HashMap;
import java.util.Map;

//2.Составить программу, которая по заданным году и номеру месяца определяет
// количество дней
// в этом месяце и корректно определялись все високосные года.

public class Task02 {

	public Map<Integer, Boolean> task02(int year, int month) {

		Map<Integer, Boolean> result = new HashMap<Integer, Boolean>();
		Map<Integer, Integer> temp = new HashMap<Integer, Integer>();

		temp.put(1, 31);
		temp.put(3, 31);
		temp.put(4, 30);
		temp.put(5, 31);
		temp.put(6, 30);
		temp.put(7, 31);
		temp.put(8, 31);
		temp.put(9, 30);
		temp.put(10, 31);
		temp.put(11, 30);
		temp.put(12, 31);

		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			temp.put(2, 29);
			result.put(temp.get(month), true);
		} else {
			temp.put(2, 28);
			result.put(temp.get(month), false);
		}

		return result;
	}

}
