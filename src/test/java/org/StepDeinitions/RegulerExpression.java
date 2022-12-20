package org.StepDeinitions;

import io.cucumber.java.en.Given;

public class RegulerExpression {
	
	@Given("i have {int} apple")
	public void i_have_apple(Integer count) {
		System.out.println("laptop count " +count);
	}

	@Given("i have a {double} copa")
	public void i_have_a_copa(double num) {
		System.out.println("ggps " + num );
	  
	}

	@Given("user fill {string} and {string}")
	public void user_fill_and(String string, String string2) {
		System.out.println("username " + string +"password " + string2);
	    
	}



}
