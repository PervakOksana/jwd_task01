package by.htp.jwd.junitex;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class Task04Test {

	private Task04 task04;

	@Before
	public void initTask04() {
		this.task04 = new Task04();
	}

	@Test
	public void task04Task() {

		assertTrue("true", task04.task04(26, 28, 15, 19));
		assertTrue("true", task04.task04(24, 28, 20, 19));
		assertFalse("false", task04.task04(23, 5, 20, 19));
		assertFalse("false", task04.task04(5, 3, 7, 6));
	}

}
