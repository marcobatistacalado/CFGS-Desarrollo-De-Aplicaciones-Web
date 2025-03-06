package ejemplo2;

import java.time.LocalDate;

class Student implements Comparable<Student> {
	private int number;
	private String name;
	private int age;

	Student(int nu, String name, int age) {
		this.number = nu;
		this.name = name;
		this.age = age;
	}

	public int compareTo(Student st) {
		/*int r = name.compareToIgnoreCase(st.name);
		if ( r== 0)
			return 0;
		else if (r > 0)
			return 1;
		else
			return -1;
		*/
		//Es redundante por tanto...:
		return name.compareToIgnoreCase(st.name);
	}

	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + ", age=" + age + "]";
	}

}
