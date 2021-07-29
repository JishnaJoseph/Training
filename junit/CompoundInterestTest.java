package July21;

import static org.junit.Assert.*;

import org.junit.Test;

public class CompoundInterestTest {

	@Test
	public void test() {
		assertEquals(1210,CompoundInterest.interest(1000, 10, 2));
	}

	@Test
	public void test1() {
		assertEquals(1222,CompoundInterest.interest(1000, 10, 2));
	}
}
