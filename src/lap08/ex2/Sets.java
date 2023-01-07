package lap08.ex2;

import java.util.*;

public class Sets {
	public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
		Set<Integer> results = new HashSet<Integer>();
		for (Integer i : first) {
			for (Integer j : second) {
				if (i == j) {
					results.add(i);
				}
			}
		}
		return results;
	}

	public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
		Set<Integer> results = new HashSet<Integer>();
		for (Integer i : first) {
			results.add(i);
		}
		for (Integer j : second) {
			results.add(j);
		}
		return results;
	}

	public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
		first.retainAll(second);
		return first;
	}

	public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
		first.addAll(second);
		return first;
	}

	public static List<Integer> toList(Set<Integer> source) {
		return new ArrayList<Integer>(source);
	}

	public static List<Integer> removeDuplicates(List<Integer> source) {
		Set<Integer> set1 = new HashSet<Integer>(source);
		return new ArrayList<Integer>(set1);
	}

	public static List<Integer> removeDuplicatesManual(List<Integer> source) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (Integer i : source) {
			if (!result.contains(i)) {
				result.add(i);
			}
		}
		return result;
	}

	public static String firstReccurringCharter(String s) {
		return Character.toString(s.charAt(0));
	}

	public static Set<Character> allReccurringChars(String s) {
		Set<Character> result = new HashSet<Character>();
		char temp[] = s.toCharArray();
		for (char i : temp) {
			result.add(i);
		}
		return result;

	}

	public static Integer[] toArray(Set<Integer> source) {
		return (Integer[]) source.toArray();

	}

	public static int getFirst(TreeSet<Integer> source) {
		return source.first();

	}

	public static int getLast(TreeSet<Integer> source) {
		return source.last();

	}

	public static int getGreater(TreeSet<Integer> source, int value) {
		return source.ceiling(value);

	}

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		System.out.println(set1);

		Set<Integer> set2 = new HashSet<Integer>();
		set2.add(5);
		set2.add(2);
		set2.add(6);
		set2.add(4);
		System.out.println(set2);

		System.out.println(intersectionManual(set1, set2));
//		System.out.println(intersection(set1, set2));

		System.out.println(unionManual(set1, set2));
//		System.out.println(union(set1, set2));

		System.out.println(toList(set2));

		List<Integer> source = new ArrayList<Integer>();
		source.add(1);
		source.add(3);
		source.add(5);
		source.add(7);
		source.add(0);
		System.out.println(removeDuplicatesManual(source));

		String str = "ReccurringCharter";
		System.out.println(firstReccurringCharter(str));
		System.out.println(allReccurringChars(str));
	}
}
