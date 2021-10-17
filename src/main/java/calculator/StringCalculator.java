package calculator;

class StringCalculator {

    public int add(String input) {
    	if(input.isEmpty()) {
    		return 0;
    	}
    	else {
    		return stringToInt(input);
    	}
    	
    	
    } private int stringToInt(String input) {
		return Integer.parseInt(input);
    	
    }
   

} 