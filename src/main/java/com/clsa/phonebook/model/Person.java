/**
 *
 */
package com.clsa.phonebook.model;

import java.util.List;

/**
 * @author Amit Soni
 *
 */
public class Person {

	private Integer personId;
	private String firstName;
	private String lastName;
	private List<Contact> contacts;

	/**
	 * @return the personId
	 */
	public Integer getPersonId() {
		return this.personId;
	}

	/**
	 * @param personId
	 *            the personId to set
	 */
	public void setPersonId(final Integer personId) {
		this.personId = personId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return this.firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return this.lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the contacts
	 */
	public List<Contact> getContacts() {
		return this.contacts;
	}

	/**
	 * @param contacts
	 *            the contacts to set
	 */
	public void setContacts(final List<Contact> contacts) {
		this.contacts = contacts;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object object) {
		return (object instanceof Person) && (this.personId != null) ? this.personId.equals(((Person) object).personId) : (object == this);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return (this.personId != null) ? (Person.class.hashCode() + this.personId.hashCode()) : super.hashCode();
	}
}
