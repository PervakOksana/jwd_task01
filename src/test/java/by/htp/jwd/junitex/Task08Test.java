package by.htp.jwd.junitex;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Task08Test {
	private Task08 task08;

	@Before
	public void initTask08() {
		this.task08 = new Task08();
	}

	@Test
	public void task08Test() {
		assertEquals("3", 27, task08.task08(3), 0.01);
		assertEquals("6", 27, task08.task08(3), 0.01);
		assertEquals("15", 63, task08.task08(6), 0.01);

	}

}
