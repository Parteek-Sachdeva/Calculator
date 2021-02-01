package com.calculator;
 interface Calculate {
	   abstract int calculate(int operand1, int oerand2, Operator operator);
	}
  enum Operator {
	   ADD, SUBTRACT, DIVIDE, MULTIPLY;
	} 
   class CalculateImpl implements Calculate {
	  
	    public int calculate(int operand1, int operand2, Operator operator) {
	 
	        switch (operator) {
	        case ADD:
	            return operand1 + operand2;
	        case SUBTRACT:
	            return operand1 - operand2;
	        case MULTIPLY:
	            return operand1 * operand2;
	        case DIVIDE:
	            return operand1 / operand2;
	        }
	 
	        throw new RuntimeException(operator + "is unsupported");
	    }
	 
	}
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Calculate calc = new CalculateImpl();
	       int result = calc.calculate(10,6,Operator.ADD);
//	       result = calc.calculate(result,6,Operator.MULTIPLY);
//	       result = calc.calculate(result,1,Operator.SUBTRACT);
//	       result = calc.calculate(result,5,Operator.DIVIDE);
	       
	       System.out.println("result=" + result);

	}

}
