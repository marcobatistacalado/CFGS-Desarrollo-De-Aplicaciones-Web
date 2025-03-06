package ej3_v1;

import java.time.LocalDate;

class Student implements Comparable<Student> { //debe llevar si o si la interfaz comparable
	private int number;
	private String name;
	private int age;
	  private LocalDate fIncor; // Nueva variable para la fecha de incorporación

	Student(int nu, String name, int age) {
		this.number = nu;
		this.name = name;
		this.age = age;
		int ranNumber = (int) (Math.random()*100)+1;
		this.fIncor = LocalDate.now().minusDays(ranNumber);
	}

	// Getter y setter para la fecha de incorporación
    public LocalDate getFIncor() {
        return fIncor;
    }

    public void setFIncor(LocalDate fIncor) {
        this.fIncor = fIncor;
    }

    @Override //codificar si o si compareTo
    public int compareTo(Student st) {
        // Comparar por fecha de incorporación (de más reciente a más antigua)
        return st.getFIncor().compareTo(this.fIncor);
    }

	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + ", age=" + age + ", fIncor=" + fIncor + "]";
	}



}
