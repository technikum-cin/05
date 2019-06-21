package calcy;

public class CalculatorFactory {
	public calculator_interface createInstance(boolean extended) {
		if(extended) {
			return new CalculatorExtendedImpl();
		}
		return new CalculatorSimpleImpl();
	}
}