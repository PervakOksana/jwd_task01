package by.htp.jwd.junitex;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class Task05Test {

	private Task05 task05;

	@Before
	public void initTask05() {
		this.task05 = new Task05();
	}

	@Test
	public void task05Test() {

		assertTrue("true", task05.task05(8128));
		assertTrue("true", task05.task05(33550336));
		assertFalse("false", task05.task05(259));
		assertFalse("false", task05.task05(111695));
	}

}
