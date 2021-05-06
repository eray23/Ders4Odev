package game;

import java.util.Date;

public class User {
	private String firstName;
	private String lastName;
	private long tc;
	private Date dateOfBirth;
	public User(String firstName, String lastName, long tc, Date dateOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.tc = tc;
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getTc() {
		return tc;
	}
	public void setTc(long tc) {
		this.tc = tc;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
}
