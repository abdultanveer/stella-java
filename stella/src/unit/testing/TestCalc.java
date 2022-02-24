package unit.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

//all the edge cases and exceptional where your code can break;
public class TestCalc {
	
	@Test
	public void test_Add(){
		int expected = 30;
		int actual = Calculator.add(10, 20);
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_Multiply() {
		int expected = 6;
		int actual = Calculator.multiply(2, 3);
		assertEquals(expected, actual);
	}

}
