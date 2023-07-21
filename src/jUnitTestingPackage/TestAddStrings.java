package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddStrings {

	@Test
	public void test() {
		jUnitFunction junit = new jUnitFunction();
		String result = junit.addString("Tony", "Stark");
		assertEquals("TonyStark", result);
	}

}
