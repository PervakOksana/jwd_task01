package by.htp.jwd.junitex;

//5. Составить программу, печатающую значение true, если указанное высказывание
// является истинным, и
// false — в противном случае: является ли целое число совершенным (сумма
// делителей равна самому числу)

public class Task05 {

	public boolean task05(double number) {
		int count = 0;
		boolean result = false;

		for (int i = 1; i < number; i++) {

			if (number % i == 0)
				count = count + i;
		}
		if (count == number)
			result = true;

		return result;

	}

}
