package lap10.ex2_1;

public class TestApp {
	public static void main(String[] args) {
		MyList al = new MyArrayList();
		al.add("a", 0);
		al.add("b");
		al.add("c", 0);
		al.add("c", 3);

		al.remove(3);
		System.out.println(al.size());
		System.out.println(al);
		System.out.println(al.get(2));
	}
}
