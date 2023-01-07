package lap07.ex1_6;

abstract public class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;
	}

	abstract public void greets();
}
