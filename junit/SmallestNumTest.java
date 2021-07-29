package July21;

import static org.junit.Assert.*;

import org.junit.Test;

public class SmallestNumTest {

	@Test
	public void testSmallest() {
		assertEquals(20,SmallestNum.smallest(30, 20, 40));
	}

	@Test
	public void testSmallest2() {
		assertEquals(50,SmallestNum.smallest(30, 20, 40));
	}

}
