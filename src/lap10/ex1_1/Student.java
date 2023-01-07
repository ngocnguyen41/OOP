package lap10.ex1_1;

import java.util.Objects;

public class Student implements Comparable<Student> {
	String name;
	String lastname;
	String phone;
	double averge;

	public Student(String name, String lastname, String phone) {
		this.name = name;
		this.lastname = lastname;
		this.phone = phone;
	}

	public Student(String name, String lastname, double averge) {
		this.name = name;
		this.lastname = lastname;
		this.averge = averge;
	}

	public Student(String name, String lastname, String phone, double averge) {
		this.name = name;
		this.lastname = lastname;
		this.phone = phone;
		this.averge = averge;
	}

	@Override
	public int compareTo(Student s) {
		return 1;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Student student = (Student) o;
		return Double.compare(student.averge, averge) == 0
				&& Objects.equals(name, student.name)
				&& Objects.equals(lastname, student.lastname)
				&& Objects.equals(phone, student.phone);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, lastname, phone, averge);
	}

	@Override
	public String toString() {
		return "Student[" + "name='" + name + ", lastname='" + lastname
				+ ", phone='" + phone + ", averge=" + averge + ']';
	}
}
