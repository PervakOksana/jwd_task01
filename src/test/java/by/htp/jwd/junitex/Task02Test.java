package by.htp.jwd.junitex;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

//2.Составить программу, которая по заданным году и номеру месяца определяет
//количество дней
//в этом месяце и корректно определялись все високосные года.

public class Task02Test {

	private Task02 task02;

	private Map<Integer, Boolean> resultTest = new HashMap<Integer, Boolean>();
	private Map<Integer, Boolean> result = new HashMap<Integer, Boolean>();

	@Before
	public void initTask02() {
		resultTest.put(29, true);
		this.task02 = new Task02();

	}

	@After
	public void closeTask02() {
		resultTest.clear();
	}

	@Test
	public void task02Test() {
		result = task02.task02(2020, 2);
		Assert.assertEquals(result, resultTest);

	}

}
