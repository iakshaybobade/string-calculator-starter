package calculator;

import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;

class StringCalculatorShould {

    @Test
    void empty_string_should_return_0() throws Exception {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() throws Exception {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }
    @Test
    void string_with_two_number_should_return_addition_as_int() throws Exception {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3, stringCalculator.add("1,2"));
    }
    @Test
    void string_with_multiple_number_should_return_addition_as_int() throws Exception {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(6, stringCalculator.add("1,2,3"));
    }
    @Test
    void string_with_newline_insted_of_comma() throws Exception {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(6, stringCalculator.add("1\n2,3"));
    }
    @Test
    void string_with_different_delimiters() throws Exception { 
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3, stringCalculator.add("//;\n1;2"));
    }
    @Rule
    public ExpectedException expectedexception= ExpectedException.none();
    @Test
    void string_with_negative_values() throws Exception  { 
    	expectedexception.expect(Exception.class);
    	expectedexception.expectMessage("negatives not allowed-1");
    	StringCalculator stringCalculator = new StringCalculator();
    	stringCalculator.add("-1,4,-4");
    }
    
   
}
