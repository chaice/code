package com.kaishengit.cc;

public class Factory {
	public Pet feed(String str) {
		//pet.eat();
		Pet pet = null;
		switch (str) {
		case "è":
			return pet = new Cat();
			
		case "��":
			return pet = new Dog();
       
		}
		return pet;
	}
}
