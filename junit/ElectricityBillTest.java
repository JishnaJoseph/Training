package July21;

import static org.junit.Assert.*;

import org.junit.Test;

public class ElectricityBillTest {

	@Test
	public void testbill1() {
		assertEquals(460,ElectricityBill.bill(230));
	}

	@Test
	public void testbill2() {
		assertEquals(460,ElectricityBill.bill(300));
	}
}
