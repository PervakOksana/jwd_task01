package by.htp.jwd.main;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Main task = new Main();

		// System.out.println(task.task01(25));
		// System.out.println(task.task02(2020,2).toString());
		// System.out.println(task.task03(20)[0] + " "+task.task03(20)[1] );
		// System.out.println(task.task04(27,28,18,19));
		// System.out.println(task.task05(6));
		// System.out.println(task.task06(150)[0] + " "+task.task06(150)[1]+ " "+task.task06(150)[2]);
		// System.out.println(task.task07(new double []{15.2,14.0},new double []{13.2,14.0})[0] + " "+task.task07(new double []{15.2,14.0},new double []{13.2,14.0})[1]);
		// System.out.println(task.task08(15));
		// System.out.println(task.task09(16)[0]+ " "+task.task09(16)[1]);
		// System.out.println(task.task10(0,30,15).toString());
	}

	// 1.Написать программу, позволяющую по последней цифре числа определить
	// последнюю цифру его квадрата.
	public int task01(int number) {

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

	// 2.Составить программу, которая по заданным году и номеру месяца определяет
	// количество дней
	// в этом месяце и корректно определялись все високосные года.
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

	// 3.Окружность вписана в квадрат заданной площади. Найти площадь квадрата,
	// вписанного в эту окружность. Во сколько раз площадь вписанного квадрата
	// меньше площади заданного?
	public double[] task03(double area) {
		double[] result = new double[2];
		result[0] = area / 2;
		result[1] = area / (area / 2);
		return result;
	}

	// 4.Составить программу, печатающую значение true, если указанное высказывание
	// является истинным,
	// и false — в противном случае: среди заданных целых чисел А, В, С, D есть хотя
	// бы два четных.
	public boolean task04(int x, int y, int z, int n) {
		int[] numbers= {x,y,z,n};
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

	

	// 5. Составить программу, печатающую значение true, если указанное высказывание
	// является истинным, и
	// false — в противном случае: является ли целое число совершенным (сумма
	// делителей равна самому числу)
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



	// 6.Идет n-я секунда суток, определить, сколько полных часов, полных минут и
	// секунд прошло к этому моменту.
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

	// 7.Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий,
	// которая
	// из точек находится ближе к началу координат. x y.
	public double[] task07(double a[], double b[]) {

		double[] result = new double[] {};
		result = b;

		double ar = Math.pow((Math.pow(a[0], 2) + Math.pow(a[1], 2)), 0.5);
		double br = Math.pow((Math.pow(b[0], 2) + Math.pow(b[1], 2)), 0.5);
		
		if (ar < br) {
			result = a;
		}
		
		return result;
	}

	// 8.Вычислить значение функции:
	public double task08(double x) {

		double res = 0;

		if (x >= 3)
			res = Math.pow(-1 * x, 2) + 3 * x + 9;
		if (x < 3)
			res = 1 / (Math.pow(x, 3) - 6);

		return res;
	}

	// 9.Вычислить длину окружности и площадь круга одного и того же заданного
	// радиуса R.
	public double [] task09(double r) {

		double [] result;

		double line = 2 * Math.PI * r;
		double area = Math.PI * r * r;
		result = new double [] { line, area };
		return result;
	}


	// 10.Составить программу для вычисления значений функции F(x) на отрезке [а, b]
	// с
	// шагом h. Результат представить в виде таблицы, первый столбец которой –
	// значения
	// аргумента, второй - соответствующие значения функции.
	public Map<Double, Double> task10(double a,double b,double h ) {

		double temp;
		
		Map<Double, Double> result = new HashMap<Double, Double>();
		for (double i = a; i <= b; i = i + h) {
			if (i % 90 != 0 || (i % 90 == 0 & ((i / 90) % 2 == 0))) {	
			temp = Math.tan(Math.toRadians(i));
			
			result.put(i, temp);}
		}
		
		return result;
	}
	
}
