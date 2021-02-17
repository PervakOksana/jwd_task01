package by.htp.jwd.junitex;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class Task03Test {

	private Task03 task03;

	@Before
	public void initTask03() {
		this.task03 = new Task03();
	}

	@Test
	public void task03Test() {
		assertArrayEquals(new double[] { 10, 2 }, task03.task03(20), 0.01);
		assertArrayEquals(new double[] { 15.5, 2 }, task03.task03(31), 0.01);
		assertArrayEquals(new double[] { 17, 2 }, task03.task03(34), 0.01);
	}

}
