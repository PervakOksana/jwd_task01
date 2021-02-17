package by.htp.jwd.junitex;

//7.Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий,
// которая
// из точек находится ближе к началу координат. x y.

public class Task07 {

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
}
