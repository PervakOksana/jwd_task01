package by.htp.jwd.junitex;

//4.Составить программу, печатающую значение true, если указанное высказывание
// является истинным,
// и false — в противном случае: среди заданных целых чисел А, В, С, D есть хотя
// бы два четных.

public class Task04 {

	public boolean task04(int x, int y, int z, int n) {
		int[] numbers = { x, y, z, n };
		int count = 0;
		boolean result = false;

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] % 2 == 0)
				count++;
		}
		if (count > 1)
			result = true;

		return result;

	}
}
