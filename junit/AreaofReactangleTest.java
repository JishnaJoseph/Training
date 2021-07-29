package July21;

import static org.junit.Assert.*;

import org.junit.Test;

public class AreaofReactangleTest {

	@Test
	public void testarea1() {
		assertEquals(12,AreaofReactangle.area(4, 3));
	}

	@Test
	public void testarea2() {
		assertEquals(15,AreaofReactangle.area(4, 3));
	}
	
}
