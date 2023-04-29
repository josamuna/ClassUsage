package com.josamuna.projects.abstracts;

/**
 * Abstract class Person
 * @author josue
 *
 */
public abstract class Person {
	
	// Protected properties.
	protected int id;
	protected String firstName;
	protected String lastName;
	protected String sex;
	
	/**
	 * Default constructor.
	 */
	public Person() {
		this.id = 1;
		this.firstName = "Josue";
		this.lastName = "Isamuna";
		this.sex = "M";
	}

	/**
	 * Overloaded constructor.
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param sex
	 */
	public Person(int id, String firstName, String lastName, String sex) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.sex = sex;
	}

	/**
	 * id Getter.
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * id Setter.
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * firstName Getter.
	 * @return
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * fistName Setter.
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * lastName Getter.
	 * @return
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * lastName Setter.
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * sex Getter.
	 * @return
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * sex Setter.
	 * @param sex
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	/**
	 * Abstract method.
	 */
	public abstract void display();
	
	/**
	 * Concrete method.
	 */
	public void eat() {
		System.out.println("Je mange par la bouche.");
	}
}
