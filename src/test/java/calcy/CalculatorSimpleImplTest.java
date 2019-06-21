package calcy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculatorSimpleImplTest {

	
	@Test
	public void testCorrectAddition1() {
		CalculatorSimpleImpl test = new CalculatorSimpleImpl();
		assertEquals(12,test.sum(6,6));
	}
	
	@Test
	public void testCorrectAddition2() {
		CalculatorSimpleImpl test = new CalculatorSimpleImpl();
		assertEquals(5,test.sum(2,3));
	}
	
	/*@Test
	public void testException() {
		CalculatorSimpleImpl test = new CalculatorSimpleImpl();
		assertThrows(IllegalArgumentException.class,() -> test.sum(1,1,1));
	}*/
}
