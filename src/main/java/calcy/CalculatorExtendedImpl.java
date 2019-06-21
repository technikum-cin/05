package calcy;

public class CalculatorExtendedImpl implements calculator_interface {

	public int sum(int... numbers) {
		if (numbers.length < 2) {
			throw new IllegalArgumentException("Not enough parameters!");
		}
		int x = 0;
		for (int i = 0;i<numbers.length;i++) {
			x = x + numbers[i];
		}
		return x;
	}
}