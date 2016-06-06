package com.kaishengit.person;

public class Person {
	public Vehicle driver(String str) {
		Vehicle v = null;
		switch (str) {
		case "car":
			v = new Car();
			break;
		case "bus":
			v = new Bus();
			break;
		case "truck":
			v = new Truck();
			break;
		}

		return v;
	}

}
