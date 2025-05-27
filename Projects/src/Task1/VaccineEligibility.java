package Task1;

import java.util.Scanner;

public class VaccineEligibility {
	
	private int age;
	private boolean hasHealthCondition;
	
	public VaccineEligibility(int age, boolean hasHealthCondition) {
		super();
		this.age = age;
		this.hasHealthCondition = hasHealthCondition;
	}
	
	public VaccineEligibility() {
		
	}

	boolean isEligible() {
		
		return age>=18 && age<=60 && hasHealthCondition;
	}
	
	
}
