package by.htp.jwd.junitex;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class Task07Test {

	private Task07 task07;

	@Before
	public void initTask07() {
		this.task07 = new Task07();
	}

	@Test
	public void task07Test() {
		assertArrayEquals(new double[] { 49, 7 }, task07.task07(new double[] { 52, 6 }, new double[] { 49, 7 }), 0.01);
		assertArrayEquals(new double[] { 52, 6 }, task07.task07(new double[] { 52, 6 }, new double[] { 52, 6 }), 0.01);
		assertArrayEquals(new double[] { 12, 6 }, task07.task07(new double[] { 12, 6 }, new double[] { 49, 7 }), 0.01);
	}

}
