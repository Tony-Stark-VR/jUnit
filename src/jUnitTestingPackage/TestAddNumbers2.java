package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddNumbers2 {

	@Test
	public void test() {
		jUnitFunction junit = new jUnitFunction();
		int result = junit.addNumber(800, 200);
		assertEquals(1000, result);
	}

}
