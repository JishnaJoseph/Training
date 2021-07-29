package July21;

import static org.junit.Assert.*;

import org.junit.Test;

public class DistanceBetweenTwoPointsTest {

	@Test
	public void testDistance() {
		assertEquals(1620, DistanceBetweenTwoPoints.distance(2, 4, 3, 2));
	}
	@Test
	public void testDistance1() {
		assertEquals(2, DistanceBetweenTwoPoints.distance(1, 3, 2, 4));
	}
}
