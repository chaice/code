package com.kaishengit.calc;

public class CalcFactory {
	public Calc calc(String str) {
		Calc c = null;
		switch (str) {
		case "+":
			c = new AddCalc();
			break;
		case "-":
			c = new CutCalc();
			break;
		case "*":
			c = new MulCalc();
			break;
		case "/":
			c = new DivCalc();
			break;

		}
		return c;
	}

}
