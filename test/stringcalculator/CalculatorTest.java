package stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest{
	/*public static void main(String args[]){
		org.junit.runner.JUnitCore.main();
	}*/

	@Test
    public void testEmptyString(){
    	assertEquals(0, Calculator.add(""));
    }

    /*@Test
    public void testOneNumber(){
    	assertEquals(1, Calculator.add("1"));
    }

    @Test
    public void testTwoNumber(){
    	assertEquals(3, Calculator.add("1,2"));
    }

    @Test
    public void testMultipleNumber(){
    	assertEquals(6, Calculator.add("1,2,3"));
    }*/
}