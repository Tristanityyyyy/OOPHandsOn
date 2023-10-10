package package1;

class BloodData {
	private String bloodType;
	
	private String rhFactor;
	
	public BloodData() {
		this.bloodType = "O";
		this.rhFactor = "+";
	}
	public BloodData(String bt , String rh) {
		this.bloodType = bt;
		this.rhFactor = rh;
	}
	
	
	public void display() {
		System.out.println( bloodType + rhFactor + " is added to the bank");
		
	}
}
