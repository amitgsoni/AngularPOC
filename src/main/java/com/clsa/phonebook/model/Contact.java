/**
 *
 */
package com.clsa.phonebook.model;

/**
 * @author Amit Soni
 *
 */
public class Contact {

	private Integer contactId;
	private String phoneNo;

	/**
	 * @return the contactId
	 */
	public Integer getContactId() {
		return this.contactId;
	}

	/**
	 * @param contactId
	 *            the contactId to set
	 */
	public void setContactId(final Integer contactId) {
		this.contactId = contactId;
	}

	/**
	 * @return the phoneNo
	 */
	public String getPhoneNo() {
		return this.phoneNo;
	}

	/**
	 * @param phoneNo
	 *            the phoneNo to set
	 */
	public void setPhoneNo(final String phoneNo) {
		this.phoneNo = phoneNo;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object object) {
		return (object instanceof Contact) && (this.phoneNo != null) ? this.phoneNo.equals(((Contact) object).phoneNo) : (object == this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return (this.contactId != null) ? (Contact.class.hashCode() + this.contactId.hashCode()) : super.hashCode();
	}
}
