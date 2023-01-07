package lap10.ex1_1;

import java.util.Date;

public class Library {
	Rent[] rents;

	public Library(Rent[] rents) {
		this.rents = rents;
	}

	public Rent getLongestRent() {
		long times;
		long max = 0;
		Rent[] result = new Rent[1];
		for (int index = 0; index < rents.length; index++) {
			if (rents[index].getEnd().getTime() - rents[index].getBegin().getTime() > 0) {
				times = rents[index].getEnd().getTime() - rents[index].getBegin().getTime();
				if (times > max) {
					max = times;
				}
				if (rents[index].getEnd().getTime() - rents[index].getBegin().getTime() == max) {
					result[0] = rents[index];
				}
			}
		}
		return result[0];
	}
}
