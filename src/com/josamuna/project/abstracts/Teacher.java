package com.josamuna.project.abstracts;

public class Teacher extends Person {
	
	// Private property
	private String level;
	
	/**
	 * Default constructor
	 */
	public Teacher() {
		super();
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
		super(id, firstName, lastName, sex);
		this.level = level;
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
