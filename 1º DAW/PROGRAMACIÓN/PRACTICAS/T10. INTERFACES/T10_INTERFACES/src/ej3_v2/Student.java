package ej3_v2;

import java.time.LocalDate;

class Student {
	private int number;
	private String name;
	private int age;
	private LocalDate fIncor;
	
	Student(int nu, String name, int age) {
		this.number = nu;
		this.name = name;
		this.age = age;
		int ranNumber = (int) (Math.random()*100)+1;
		this.fIncor = LocalDate.now().minusDays(ranNumber);
	}

	public String getName() {
		return name;
	}
	
	public LocalDate getfIncor() {
		return fIncor;
	}

	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + ", age=" + age + ", fIncor=" + fIncor + "]";
	}

	

}
