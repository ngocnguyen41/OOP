package lap03;

public class DateUtil {
	// Month's name – for printing
	public static String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

	// Number of days in each month (for non-leap years)
	public static int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	/*
	 * Returns true if the given year is a leap year
	 */
	public static boolean isLeapYear(int year) {
		return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
	}


	// Return true if the given year, month, day is a valid date
	// year: 1-9999
	// month: 1(Jan)-12(Dec)
	// day: 1-28|29|30|31. The last day depends on year and month
	public static boolean isValidDate(int year, int month, int day) {
		if (day <= 0 || day > 31 || month < 1 || month > 12) {
			return false;
		}
		if ((month == 2) && (isLeapYear(year))) {
			if (day <= (daysInMonths[1] + 1)) {
				return true;
			} else {
				return false;
			}
		}
		if (daysInMonths[month - 1] < day) {
			return false;
		}
		return true;
	}

	// Return the day of the week, 0:Sun, 1:Mon, ..., 6:Sat
	public static int getDayOfWeek(int year, int month, int day) {
		if (isValidDate(year, month, day)) {
			int sum = 0;
			switch (((year / 100) - 17) % 4) {
				case 0:
					sum += 4;
					break;
				case 1:
					sum += 2;
					break;
				case 2:
					break;
				default:
					sum += 6;
			}
			sum += year % 100 + (year % 100) / 4;
			if (month == 1) {
				if (isLeapYear(year)) {
					sum += 6;
				} else {
					sum += 0;
				}
			} else if (month == 2) {
				if (isLeapYear(year)) {
					sum += 2;
				} else {
					sum += 3;
				}
			} else {
				int[] temp = {3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
				if (month != 1 || month != 2) {
					sum += temp[month - 3];
				}
			}
			sum += day;
			return sum % 7;
		}
		return -1;
	}

	// Days in week
	public static String[] dayOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

	public static String dayOfWeeks(int number) {
		switch (number) {
			case 0:
				return "Sun";
			case 1:
				return "Mon";
			case 2:
				return "Tue";
			case 3:
				return "Wed";
			case 4:
				return "Thu";
			case 5:
				return "Fri";
			case 6:
				return "Sat";
		}
		return "Error";
	}

	/*
	 * Return String "xxxday d mmm yyyy" (e.g., Wednesday 29 Feb 2012)
	 */
	public static String printDate(int year, int month, int day) {
		if (isValidDate(year, month, day)) {
			return dayOfWeek[getDayOfWeek(year, month, day)] + " " + day + " " + strMonths[month - 1] + " " + year;
		}
		return null;
	}

	// Test Driver
	public static void main(String[] args) {
		System.out.println(isLeapYear(1900)); // false
		System.out.println(isLeapYear(2000)); // true
		System.out.println(isLeapYear(2011)); // false
		System.out.println(isLeapYear(2012)); // true

		System.out.println(isValidDate(2012, 2, 29)); // true
		System.out.println(isValidDate(2011, 2, 29)); // false
		System.out.println(isValidDate(2099, 12, 31)); // true
		System.out.println(isValidDate(2099, 12, 32)); // false

		System.out.println(getDayOfWeek(1982, 4, 24) + ":"
				+ dayOfWeeks(getDayOfWeek(1982, 4, 24))); // 6:Sat
		System.out.println(getDayOfWeek(2000, 1, 1) + ":"
				+ dayOfWeeks(getDayOfWeek(2000, 1, 1))); // 6:Sat
		System.out.println(getDayOfWeek(2054, 6, 19) + ":"
				+ dayOfWeeks(getDayOfWeek(2054, 6, 19))); // 5:Fri
		System.out.println(getDayOfWeek(2012, 2, 17) + ":"
				+ dayOfWeeks(getDayOfWeek(2012, 2, 17))); // 5:Fri

		System.out.println(printDate(2012, 2, 14)); // Tuesday 14 Feb 2012
	}
}