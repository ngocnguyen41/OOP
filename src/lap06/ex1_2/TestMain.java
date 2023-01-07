package lap06.ex1_2;

public class TestMain {
	public static void main(String[] args) {
		Person person1 = new Person();
		System.out.println("Person: "
				+ "name: " + person1.getName()
				+ ", adderss: " + person1.getAdderss());

		Student student1 = new Student("Ngoc", "Ha Noi", "Toan tin", 2001, 3500000);
		System.out.println("Student: "
				+ "name: " + student1.getName()
				+ ", adderss: " + student1.getAdderss()
				+ ", program: " + student1.getProgram()
				+ ", year: " + student1.getYear()
				+ ", fee: " + student1.getFee());

		Staff staff1 = new Staff("Viet", "Ha Nam", "HUS", 2000000);
		System.out.println("Staff: "
				+ "name: " + staff1.getName()
				+ ", adderss: " + staff1.getAdderss()
				+ ", school: " + staff1.getSchool()
				+ ", pay: " + staff1.getPay());
	}
}
