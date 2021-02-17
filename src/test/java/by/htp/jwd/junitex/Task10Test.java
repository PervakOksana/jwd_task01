package by.htp.jwd.junitex;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task10Test {

	private Task10 task10;

	private Map<Double, Double> resultTest = new HashMap<Double, Double>();
	private Map<Double, Double> result = new HashMap<Double, Double>();

	@Before
	public void initTask10() {
		resultTest.put(0.0, 0.0);
		resultTest.put(15.0, 0.2679491924311227);
		resultTest.put(30.0, 0.5773502691896257);
		this.task10 = new Task10();

	}

	@After
	public void closeTask10() {
		resultTest.clear();
	}

	@Test
	public void task10Test() {
		result = task10.task10(0, 30, 15);
		Assert.assertEquals(result, resultTest);

	}

}
