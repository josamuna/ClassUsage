package com.josamuna.projects.interfaces;

public class TestInterfacePerson {

	public TestInterfacePerson() {
	}

	public static void main(String[] args) {
//		IPerson s1 = new IPerson() {
//			@Override
//			public void display() {
//				System.out.println("Je suis content");
//			}
//		};
//		s1.display();
		
		// Using Polymorphism with default Student constructor
		IPerson s1 = new Student();
		s1.display();
		
		// Using Polymorphism with overloaded constructor
		IPerson s2 = new Teacher(4, "Sarah", "Tubafiye", "F", "IGGG445588HH");
		s2.display();
		
		// Using Polymorphism and  set values with Setters / Mutators
		IPerson s3 = new Student();
		((Student)s3).setId(3);
		((Student)s3).setFirstName("Deogratias");
		((Student)s3).setLastName("Kalonda");
		((Student)s3).setSex("M");
		((Student)s3).setRoolNumber("GFGJJSGF655412");
		s3.display();
		
		System.out.println("");
		
		// Using Polymorphism with default Teacher constructor
		IPerson t1 = new Teacher();
		((Teacher)t1).setId(4);
		t1.display();
		
		// Using Polymorphism with overloaded constructor
		IPerson t2 = new Teacher(5, "Naomie", "Zani", "F", "PHD");
		t2.display();
		
		// Using Polymorphism and  set values with Setters / Mutators
		IPerson t3 = new Teacher();
		((Teacher)t3).setId(6);
		((Teacher)t3).setFirstName("Exauce");
		((Teacher)t3).setLastName("Omari");
		((Teacher)t3).setSex("M");
		((Teacher)t3).setLevel("Master");
		t3.display();
	}

}
