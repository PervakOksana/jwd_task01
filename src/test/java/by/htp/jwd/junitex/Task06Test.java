package by.htp.jwd.junitex;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Before;
import org.junit.Test;

public class Task06Test {

	private Task06 task06;

	@Before
	public void initTask06() {
		this.task06 = new Task06();
	}

	@Test
	public void task06Test() {
		assertArrayEquals(new int[] { 55, 33, 20 }, task06.task06(200000));
		assertArrayEquals(new int[] { 22, 5, 23 }, task06.task06(79523));
		assertArrayEquals(new int[] { 0, 0, 1 }, task06.task06(1));
	}
}
