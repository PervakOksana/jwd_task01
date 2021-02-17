package by.htp.jwd.junitex;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class Task09Test {

	private Task09 task09;

	@Before
	public void initTask09() {
		this.task09 = new Task09();
	}

	@Test
	public void task09Test() {
		assertArrayEquals(new double[] { 100.53096491487338, 804.247719318987 }, task09.task09(16), 0.01);
	}

}
