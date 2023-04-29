package com.josamuna.projects.abstracts;

/**
 * Student class
 * @author josue
 *
 */
public class Student extends Person {
	
	private String roolNumber;
	
	/**
	 * Default constructor
	 */
	public Student() {
		super(1, "Christelle", "Kasisivahwa", "F");
		this.roolNumber = "JJS5441254";
	}

	/**
	 * Overloaded constructor.
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param sex
	 * @param roolNumber
	 */
	public Student(int id, String firstName, String lastName, String sex, String roolNumber) {
		super(id, firstName, lastName, sex);
		this.roolNumber = roolNumber;
	}

	/**
	 * roolNumber Getter.
	 * @return
	 */
	public String getRoolNumber() {
		return roolNumber;
	}

	/**
	 * roolNumber Setter.
	 * @param roolNumber
	 */
	public void setRoolNumber(String roolNumber) {
		this.roolNumber = roolNumber;
	}

	@Override
	public void display() {
		System.out.println(String.format("[Student \nId = %d, FistName = %s, LastName = %s, Sex = %s, RoolNumber = %s]",
				this.id, this.firstName, this.lastName, this.sex, this.roolNumber));
		
	}

//	public void afficher() {
//		System.out.println(String.format("[Student \nId = %d, FistName = %s, LastName = %s, Sex = %s, RoolNumber = %s]",
//				this.id, this.firstName, this.lastName, this.sex, this.roolNumber));
//	}
}
