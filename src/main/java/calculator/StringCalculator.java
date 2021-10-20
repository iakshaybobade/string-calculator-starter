package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class StringCalculator {

	
	public int add(String input) throws Exception {
		
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
		if(numbers.startsWith("M")) {
			return compareWithCustomDelimiterNewCase(numbers);
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
	private static String[] compareWithCustomDelimiterNewCase(String numbers) {
		
		String[] nums=numbers.split ("\\*");
		//System.out.println(nums);
		String[] nums2=compareWithnewlineAndComma(nums[1]);
		for(int i=0;i<nums2.length;i++) {
			int temp=Integer.parseInt(nums2[i]);
			temp=temp*3;
			
			nums2[i]=String.valueOf(temp);
		}
		
		return nums2;
	}
	private static String[] compareWithnewlineAndComma(String numbers) {
		String[] nums=numbers.split (",|\n");
		return nums;
	}
	private boolean isEmpty(String input) {
		return input.isEmpty();
	}

	private int getsum(String[] num) throws Exception {
		findInvalidInput(num);
		int sum = 0;
		for (String i:num) {
			sum = sum + stringToInt(i);
		}
		return sum;
	}
	
	private void findInvalidInput(String[] numbers)throws Exception{
		StringBuilder S1=new StringBuilder();
		for(String i:numbers) {
			if(stringToInt(i)<0) {
				S1.append(i);
				throw new Exception("negatives not allowed"+S1.toString());
			}
		}
	}
	private int stringToInt(String input) {
		return Integer.parseInt(input);

	}

}