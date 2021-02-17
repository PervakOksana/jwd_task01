package by.htp.jwd.junitex;

import java.util.HashMap;
import java.util.Map;

//10.Составить программу для вычисления значений функции F(x) на отрезке [а, b]
// с
// шагом h. Результат представить в виде таблицы, первый столбец которой –
// значения
// аргумента, второй - соответствующие значения функции.

public class Task10 {

	public Map<Double, Double> task10(double a, double b, double h) {

		double temp;

		Map<Double, Double> result = new HashMap<Double, Double>();
		for (double i = a; i <= b; i = i + h) {
			if (i % 90 != 0 || (i % 90 == 0 & ((i / 90) % 2 == 0))) {
				temp = Math.tan(Math.toRadians(i));

				result.put(i, temp);
			}
		}

		return result;
	}
}
