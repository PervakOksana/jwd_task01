package by.htp.jwd.junitex;

public class Task09 {

// 9.Вычислить длину окружности и площадь круга одного и того же заданного
// радиуса R.

	public double[] task09(double r) {

		double[] result;

		double line = 2 * Math.PI * r;
		double area = Math.PI * r * r;
		result = new double[] { line, area };
		return result;
	}

}
