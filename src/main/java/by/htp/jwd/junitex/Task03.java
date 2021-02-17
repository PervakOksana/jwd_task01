package by.htp.jwd.junitex;

//3.Окружность вписана в квадрат заданной площади. Найти площадь квадрата,
// вписанного в эту окружность. Во сколько раз площадь вписанного квадрата
// меньше площади заданного?

public class Task03 {

	public double[] task03(double area) {
		double[] result = new double[2];
		result[0] = area / 2;
		result[1] = area / (area / 2);
		return result;
	}

}
