package Confused;

/**
 * @JeremiahCreme
 * P.s. This Was Confusing?????
 * I looked at the answers a little (To Understand What
 * Is Happening) but I still was confused...
 */

import java.io.*;
import java.util.*;
import static java.lang.System.out;

class FoolMoons {
	static int DAY_IM = 60 * 60 * 24;

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		c.set(2004,0,7,15,40);
		long day1 = c.getTimeInMillis();
		for (int x = 0; x < 60; x++) {
			day1 += (DAY_IM * 29.52);
			c.setTimeInMillis(day1);
			out.println(String.format("full moon on %tc", c));
		}

	}
}
