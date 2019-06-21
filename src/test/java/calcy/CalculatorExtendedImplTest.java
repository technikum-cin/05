package calcy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculatorExtendedImplTest {

	
	@Test
	public void testCorrectAddition() {
		CalculatorSimpleImpl test = new CalculatorSimpleImpl();
		assertEquals(12,test.sum(6,6));
	}
	
	@Test
	public void testCorrectAdditionMoreNumbers() {
		CalculatorSimpleImpl test = new CalculatorSimpleImpl();
		assertEquals(20,test.sum(2,2,2,2,2,2,2,2,2,2));
	}
	
	/*@Test
	public void testException() {
		CalculatorSimpleImpl test = new CalculatorSimpleImpl();
		assertThrows(IllegalArgumentException.class,() -> test.sum(1,1,1));
	}*/
}
