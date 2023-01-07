package hw6.ex1_2;

public class TestMyTime {
	public static void main(String[] args) {
		MyTime time = new MyTime(23, 59, 60);
		System.out.println("My time: " + time);

		time.setHour(23);
		time.setMinute(50);
		time.setSecond(45);
		System.out.println("My time: " + time.toString());
		System.out.println("Hour: " + time.getHour());
		System.out.println("Minute: " + time.getMinute());
		System.out.println("Second: " + time.getSecond());

		time.setTime(23, 59, 59);
		System.out.println(time);
		System.out.println(time.nextSecond());
		System.out.println(time.nextMinute());
		System.out.println(time.nextHour());
		System.out.println(time.previousSecond());
		System.out.println(time.previousMinute());
		System.out.println(time.previousHour());
	}
}
