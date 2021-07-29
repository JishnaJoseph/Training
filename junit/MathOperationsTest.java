package July21;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathOperationsTest {

	@Test
	public void testaddition() {
		assertEquals(30, MathOperations.addition(10, 20));
		
	}
	@Test
	public void testaddition1() {
		assertNotEquals(20, MathOperations.addition(10, 20));
		
	}
	
	
	@Test
	public void testsubtraction() {
		assertEquals(0, MathOperations.subtraction(20, 20));
		
	}
	@Test
	public void testsubtraction1() {
		assertNotEquals(20, MathOperations.subtraction(20, 20));
	}
	
	@Test
	public void testmultiplication() {
		assertEquals(400, MathOperations.multiplication(20, 20));
	}
	
	@Test
	public void testmultiplication1() {
		assertNotEquals(40, MathOperations.multiplication(20, 20));
	}
	@Test
	public void testdivision() {
		assertEquals(1, MathOperations.division(20, 20));
	}
	@Test
	public void testdivision1() {
		assertNotEquals(20, MathOperations.division(20, 20));
	}
	@Test
	public void testremainder() {
		assertEquals(0, MathOperations.remainder(20, 20));
	}
	@Test
	public void testremainder1() {
		assertNotEquals(1, MathOperations.remainder(20, 20));
	}
}
