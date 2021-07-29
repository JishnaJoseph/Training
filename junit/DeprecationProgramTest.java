package July21;


import static org.junit.Assert.*;

import org.junit.Test;

public class DeprecationProgramTest {

	@Test
	public void test() {
		assertEquals(1620, DeprecationProgram.dep(2000, 2, 10));
	}

	@Test
	public void test1() {
		assertEquals(160, DeprecationProgram.dep(2000, 2, 10));
	}
}
