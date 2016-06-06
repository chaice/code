package com.kaishengit.cc;

public class Factory {
	public Pet feed(String str) {
		//pet.eat();
		Pet pet = null;
		switch (str) {
		case "Ã¨":
			return pet = new Cat();
			
		case "¹·":
			return pet = new Dog();
       
		}
		return pet;
	}
}
