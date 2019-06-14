package org.ss.jpa.intro.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contact implements Serializable {

	@Id
	private Long id;
	private String email;
	@Column(name = "first_name")
	private String firstName;

	public Contact() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contact [id=");
		builder.append(id);
		builder.append(", email=");
		builder.append(email);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append("]");
		return builder.toString();
	}

}
