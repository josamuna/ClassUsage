package com.josamuna.projects.interfaces;

public class Student implements IPerson {
	// Private properties.
	private int id;
	private String firstName;
	private String lastName;
	private String sex;
	private String roolNumber;
	
	/**
	 * Default constructor.
	 */
	public Student() {
		this.id = 1;
		this.firstName = "Christelle";
		this.lastName = "Kasisivahwa";
		this.sex = "F";
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
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.sex = sex;
		this.roolNumber = roolNumber;
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

}
