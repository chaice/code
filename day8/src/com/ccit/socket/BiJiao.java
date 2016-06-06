package com.ccit.socket;

public class BiJiao {
	public static int bijiao(int a, int b) {
		if (a == b) {
			return 0;
		} else if ((a == 1 && b == 2) || (a == 2 && b == 3)
				|| (a == 3 && b == 1)) {
			return 1;
		}
		return 2;
	}

}
