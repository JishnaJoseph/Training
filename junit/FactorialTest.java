package July21;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {

	@Test
	public void testfact() {
		assertEquals(120, Factorial.fact(5));
	}

	@Test
	public void testfact1() {
		assertEquals(100, Factorial.fact(5));
	}
}
