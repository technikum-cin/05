package calcy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorFactoryTest {

	@Test
	public void correctExtended() {
		CalculatorFactory test = new CalculatorFactory();
		assertEquals(new CalculatorExtendedImpl(),test.createInstance(true));
	}	
}