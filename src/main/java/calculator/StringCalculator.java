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
    		return getsum(numbers);
    	}
    	
    	
    } 
    
    private boolean isEmpty(String input) {
    	return input.isEmpty()
;    }
    private int getsum(String[] num) {
    	int sum=0;
    	for(int i=0;i<num.length;i++) {
    		sum=sum+Integer.parseInt(num[i]);
    	}
    	return sum;
    }
    private int stringToInt(String input) {
		return Integer.parseInt(input);
    	
    }
   

} 