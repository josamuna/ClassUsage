package com.josamuna.projects.concretes;

/**
 * Test class
 * @author josue
 *
 */
public class TestConcretePerson {

	/**
	 * Default constructor
	 */
	public TestConcretePerson() {
	}

	/**
	 * Class entry point
	 * @param args
	 */
	public static void main(String[] args) {
		// Object Person with default constructor.
		Person p1 = new Person();
		p1.display();
		
		// Object Person with overloaded constructor.
		Person p2 = new Person(2, "Noella", "Kahindo", "F");
		p2.display();
		
		// Object Person with Setters (Mutators).
		Person p3 = new Person();
		p3.setId(3);
		p3.setFirstName("Dieudonne");
		p3.setLastName("Ngashani");
		p3.setSex("M");
		
		p3.display();
		
		System.out.println("");
		
		// Object Student with default constructor.
		Student s1 = new Student();
		s1.setId(4);
		s1.display();
		
		// Object Student with overloaded constructor.
		Student s2 = new Student(5, "Euphrasie", "Buhendwa", "F", "ICGRV5541KJ");
		s2.display();
		
		// Object Student with Setters (Mutators).
		Student s3 = new Student();
		s3.setId(6);
		s3.setFirstName("Henoc");
		s3.setLastName("Musafiri");
		s3.setSex("M");
		s3.setRoolNumber("IGGJ54556jkfl");
		
		s3.display();
		
		System.out.println("");
		
		Teacher t1 = new Teacher();
		t1.setId(7);
		t1.display();
		
		Teacher t2 = new Teacher(8, "Junior", "Kaniki", "M", "Master");
		t2.display();
		
		Teacher t3 = new Teacher();
		t3.setId(9);
		t3.setFirstName("Adji");
		t3.setLastName("Adjeri");
		t3.setSex("F");
		t3.setLevel("Bachelor");
		t3.display();
	}

}
