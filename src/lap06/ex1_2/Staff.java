package lap06.ex1_2;

public class Staff extends Person {
	private String school;
	private double pay;

	public Staff(String name, String adders, String school, double pay) {
		super(name, adders);
		this.school = school;
		this.pay = pay;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	@Override
	public String toString() {
		return "Staff[" + super.toString() + "school = " + school + ", pay = " + pay + ']';
	}
}
