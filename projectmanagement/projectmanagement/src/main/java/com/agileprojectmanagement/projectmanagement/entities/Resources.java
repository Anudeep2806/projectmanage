package com.agileprojectmanagement.projectmanagement.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Resources {
	
	  @Id
	  @Column(name="userId",length=6)
	  @Size(min=6,max=6,message="UserId must be always 6 characters long")
      private String userId;
	  
	  @Column(name="firstName",length=15)
	  @Size(min=3,message="Should be minimum 3 characters long")
      private String firstName;
	  @Column(name="lastName",length=15)
	  @Size(min=3,message="Should be minimum 3 characters long")
      private String lastName;
	  @Column(name="email",length=50)
      private String email;
	  @Column(name="phno",length=10)
      private String phno;
	  
	  @Column(name="role",length=20)
	  @Pattern(regexp = "^(Developer|Tester)$")
      private String role;
	  @ManyToOne(cascade = CascadeType.ALL)
      @JoinColumn(name="projectCode",referencedColumnName = "projectCode")
      private Projects projects;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Projects getProjects() {
		return projects;
	}
	public void setProjects(Projects projects) {
		this.projects = projects;
	}
	public Resources(String userId, String firstName, String lastName, String email, String phno, String role,
			Projects projects) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phno = phno;
		this.role = role;
		this.projects = projects;
	}
	public Resources() {
		super();
		// TODO Auto-generated constructor stub
	}
	  
}
