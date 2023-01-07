package lap08.ex4_2;

import java.io.*;
import java.util.*;

public class Movie implements Comparable<Movie>{
	private String name;
	private double rating;
	private int year;

	public int compareTo(Movie m) {
		if (m.getYear() < year) {
			return 1;
		}
		if (m.getYear() == year) {
			return 0;
		} else {
			return -1;
		}
	}

	public Movie(String name, double rating, int year) {
		this.name = name;
		this.rating = rating;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public double getRating() {
		return rating;
	}

	public int getYear() {
		return year;
	}
}
