package calculator;

class StringCalculator {

    public int add(String input) {
    	String[] numbers=input.split(",");
    	if(isEmpty(input)) {
    		return 0;
    	}
    	if(input.length()==1) {
    		return stringToInt(input);
    	}
    	else {
    		return getsum(numbers[0], numbers[1]);
    	}
    	
    	
    } 
    
    private boolean isEmpty(String input) {
    	return input.isEmpty()
;    }
    private int getsum(String num1,String num2) {
    	return stringToInt(num1)+stringToInt(num2);
    }
    private int stringToInt(String input) {
		return Integer.parseInt(input);
    	
    }
   

} 