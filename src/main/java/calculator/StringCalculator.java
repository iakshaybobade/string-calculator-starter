package calculator;

class StringCalculator {

	public int add(String input) {
		String[] numbers = input.split(",|\n");
		if (isEmpty(input)) {
			return 0;
		}
		if (input.length() == 1) {
			return stringToInt(input);
		} else {
			return getsum(numbers);
		}

	}

	private boolean isEmpty(String input) {
		return input.isEmpty();
	}

	private int getsum(String[] num) {
		int sum = 0;
		for (String i:num) {
			sum = sum + stringToInt(i);
		}
		return sum;
	}

	private int stringToInt(String input) {
		return Integer.parseInt(input);

	}

}