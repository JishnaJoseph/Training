package July21;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivisionTTest {
	
	@Test
	public void testdivision() {
		DivisionT obj1 = new DivisionT();
		assertEquals(2, obj1.division(20, 10));
	}

	@Test
	public void testdivision1(){
		DivisionT obj1 = new DivisionT();
		assertEquals(2, obj1.division(20, 0));

	}
}
