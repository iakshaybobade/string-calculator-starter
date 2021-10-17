package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class StringCalculator {

	
	public int add(String input) {
		
		String[] numbers = Convert(input);
		if (isEmpty(input)) {
			return 0;
		}
		if (input.length() == 1) {
			return stringToInt(input);
		} else {
			return getsum(numbers);
		}

	}
	private static String[] Convert(String numbers) {
		if(numbers.startsWith("//")) {
			return compareWithCustomDelimiter(numbers);
		}
		else {
			return compareWithnewlineAndComma(numbers);
		}
	}
	private static String[] compareWithCustomDelimiter(String numbers) {
		Matcher m= Pattern.compile("//(.)\n(.*)").matcher(numbers);
		m.matches();
		String customDelimiter=m.group(1);
		String nums=m.group(2);
		System.out.println(nums);
		return nums.split(customDelimiter);
	}
	private static String[] compareWithnewlineAndComma(String numbers) {
		String[] nums=numbers.split (",|\n");
		return nums;
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