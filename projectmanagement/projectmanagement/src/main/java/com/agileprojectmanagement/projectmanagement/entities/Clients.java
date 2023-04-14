package com.agileprojectmanagement.projectmanagement.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Clients {
    @Id    
    @Column(name="id",length=10)
	private long id;
    @Column(name="name",length=50)
	private String name;
    @Column(name="pocFullName",length=16)
	private String pocFullName;
    @Column(name="pocPhoneNumber",length=10)
	private long pocPhoneNumber;
    @Column(name="pocEmailid",length=100)
	private String pocEmailId;
    
    @OneToMany(mappedBy = "clients",cascade = CascadeType.ALL)
    private List<Projects> projects;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPocFullName() {
		return pocFullName;
	}

	public void setPocFullName(String pocFullName) {
		this.pocFullName = pocFullName;
	}

	public long getPocPhoneNumber() {
		return pocPhoneNumber;
	}

	public void setPocPhoneNumber(long pocPhoneNumber) {
		this.pocPhoneNumber = pocPhoneNumber;
	}

	public String getPocEmailId() {
		return pocEmailId;
	}

	public void setPocEmailId(String pocEmailId) {
		this.pocEmailId = pocEmailId;
	}

	public List<Projects> getProjects() {
		return projects;
	}

	public void setProjects(List<Projects> projects) {
		this.projects = projects;
	}

	public Clients(long id, String name, String pocFullName, long pocPhoneNumber, String pocEmailId,
			List<Projects> projects) {
		super();
		this.id = id;
		this.name = name;
		this.pocFullName = pocFullName;
		this.pocPhoneNumber = pocPhoneNumber;
		this.pocEmailId = pocEmailId;
		this.projects = projects;
	}

	public Clients() {
		super();
	}
	
	
	
}
