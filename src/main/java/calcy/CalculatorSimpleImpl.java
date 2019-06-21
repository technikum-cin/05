package calcy;

public class CalculatorSimpleImpl implements calculator_interface {

	public int sum(int... numbers) {
		if (numbers.length < 2) {
			throw new IllegalArgumentException("Not enough parameters!");
		}
		if (numbers.length > 2) {
			throw new IllegalArgumentException("Too many parameters!");
		}
		
		return (numbers[0]+numbers[1]);
	}	
}