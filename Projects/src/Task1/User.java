package Task1;

public class User {
	private String name;
	private VaccineEligibility eligibility;
	private DoseBooking doseBooking;
	
	public User(String name,int age,boolean hasHealthCondition) {
		this.name=name;
		eligibility=new VaccineEligibility(age,hasHealthCondition);
		doseBooking=new DoseBooking();
	}
	public boolean isEligible() {
		return eligibility.isEligible();
		}
	public void bookDose() {
		if(isEligible()) {
			try {
				doseBooking.bookDose();
				System.out.println(name+" your Dose is Booked Succesfully!");
				doseBooking.setBooked(true);
				
			}catch(RuntimeException e) {
				System.out.println(e.getMessage());
			}
		}
		else throw new RuntimeException(name+" You are not eligible for vaccine"+"");
	}
	public boolean isDoseBooked() {
		return doseBooking.isDoseBooked();
	}

}
