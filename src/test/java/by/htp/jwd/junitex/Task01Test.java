package by.htp.jwd.junitex;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//1.Написать программу, позволяющую по последней цифре числа определить
//последнюю цифру его квадрата.

@RunWith(value = Parameterized.class)
public class Task01Test {

	private Task01 task01;
	private int x;
	private long expected;

	@Before
	public void initTask01() {

		this.task01 = new Task01();

	}

	@Parameters
	public static Collection<Object[]> powTableValues() {
		return Arrays.asList(new Object[][] { { 25, 5 }, { 99, 1 }, { 82, 4 }, { 80, 0 } });
	}

	public Task01Test(int x, int expected) {
		this.x = x;
		this.expected = expected;
	}

	@Test
	public void task01Test() {
		int actual;
		actual = task01.task01(x);
		Assert.assertEquals(expected, actual);
	}
}
