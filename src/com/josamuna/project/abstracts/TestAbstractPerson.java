package com.josamuna.project.abstracts;

/**
 * Test class
 * @author josue
 *
 */
public class TestAbstractPerson {

	/**
	 * Default constructor
	 */
	public TestAbstractPerson() {
	}

	/**
	 * Class entry point
	 * @param args
	 */
	public static void main(String[] args) {
		// Using Polymorphism with default Student constructor
		Person s1 = new Student();
		s1.display();
		
		// Using Polymorphism with overloaded constructor
		Person s2 = new Student(2, "Euphrasie", "Buhendwa", "F", "ICGRV5541KJ");
		s2.display();
		
		// Using Polymorphism and  set values with Setters / Mutators
		Person s3 = new Student();
		s3.setId(3);
		s3.setFirstName("Henoc");
		s3.setLastName("Musafiri");
		s3.setSex("M");
		((Student)s3).setRoolNumber("IGGJ54556jkfl");
		
		// Call abstract method from inherited object
		s3.display();
		
		System.out.println("");
		
		Person t1 = new Teacher();
		t1.setId(4);
		t1.display();
		
		Person t2 = new Teacher(5, "Willermine", "Zabalega", "F", "Master");
		t2.display();
		
		Person t3 = new Teacher();
		t3.setId(6);
		t3.setFirstName("Marcott");
		t3.setLastName("Kasangadjo");
		t3.setSex("M");
		((Teacher)t3).setLevel("PHD");
		t3.display();
	}

}
