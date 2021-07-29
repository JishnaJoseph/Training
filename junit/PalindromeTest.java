package July21;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {

	@Test
	public void testPalindrome() {
		assertTrue(Palindrome.palin("dad"));
	}

	@Test
	public void testPalindrome1() {
		assertTrue(Palindrome.palin("jishna"));
	}
	
	@Test
	public void testPalindrome3() {
		assertFalse(Palindrome.palin("jishna"));
	}
}
