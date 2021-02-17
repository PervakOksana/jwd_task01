package by.htp.jwd.junitex;

import java.util.HashMap;
import java.util.Map;

// 1.Написать программу, позволяющую по последней цифре числа определить
// последнюю цифру его квадрата.

public class Task01 {

	public  int task01(int number) {

		Map<Integer, Integer> temp = new HashMap<Integer, Integer>();
		int result;

		temp.put(0, 0);
		temp.put(1, 1);
		temp.put(2, 4);
		temp.put(3, 9);
		temp.put(4, 6);
		temp.put(5, 5);
		temp.put(6, 6);
		temp.put(7, 9);
		temp.put(8, 4);
		temp.put(9, 1);
		while (number > 10) {
			number = number % 10;
		}
		result = temp.get(number);
		return result;
	}

}
