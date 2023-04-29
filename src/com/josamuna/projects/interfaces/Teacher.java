package com.josamuna.projects.interfaces;

public class Teacher implements IPerson {
	
	// Private properties.
	private int id;
	private String firstName;
	private String lastName;
	private String sex;
	private String level;
	
	/**
	 * Default constructor
	 */
	public Teacher() {
		this.id = 1;
		this.firstName = "Caleb";
		this.lastName = "Lufulwabu";
		this.sex = "M";
		this.level = "Bachelor";
	}

	/**
	 * Overloaded constructor
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param sex
	 */
	public Teacher(int id, String firstName, String lastName, String sex, String level) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.sex = sex;
		this.level = level;
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
	 * level Getter.
	 * @return
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * level Setter.
	 * @param level
	 */
	public void setLevel(String level) {
		this.level = level;
	}

	@Override
	public void display() {
		System.out.println(String.format("[Teacher \nId = %d, FistName = %s, LastName = %s, Sex = %s, Level = %s]",
				this.id, this.firstName, this.lastName, this.sex, this.level));
	}

}
