package by.htp.jwd.junitex;

//8.Вычислить значение функции:

public class Task08 {

	public double task08(double x) {

		double res = 0;

		if (x >= 3)
			res = Math.pow(-1 * x, 2) + 3 * x + 9;
		if (x < 3)
			res = 1 / (Math.pow(x, 3) - 6);

		return res;
	}
}
