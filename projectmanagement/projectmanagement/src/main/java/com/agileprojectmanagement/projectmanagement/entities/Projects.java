package com.agileprojectmanagement.projectmanagement.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.Future;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;




@Entity 
public class Projects {
	
	    @Id
	    @Column(name="projectCode",length=10)
        private long projectCode;
	    @Column(name="title",length=50)
	    @Size(min=3,message="Should be minimum 3 characters long")
        private String title;
	    @Column(name="budget",length=10)
        private long budget;
	    
        private LocalDate startDate;
        private LocalDate expectedEndDate;
        
        private LocalDate createdOn;
        @Column(name="status",length=20)
        @Pattern(regexp = "^(New|InProgress|Completed|Delayed|Cancelled)$")
        private String status;
        
        private LocalDate lastUpdatedOn;
    
        
        @ManyToOne(cascade = CascadeType.ALL)
        @JoinColumn(name="ClientId",referencedColumnName = "id")
        private Clients clients;
        
        @OneToMany(mappedBy = "projects",cascade = CascadeType.ALL)
        private List<Resources> resources;
        
        @PrePersist
        @PreUpdate
        private void validateDates() {
        	if(expectedEndDate.isBefore(startDate)) {
        		throw new IllegalStateException("Expected End date must be greater than start date");
        	}
        }

		public long getProjectCode() {
			return projectCode;
		}

		public void setProjectCode(long projectCode) {
			this.projectCode = projectCode;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public long getBudget() {
			return budget;
		}

		public void setBudget(long budget) {
			this.budget = budget;
		}

		public LocalDate getStartDate() {
			return startDate;
		}

		public void setStartDate(LocalDate startDate) {
			this.startDate = startDate;
		}

		public LocalDate getExpectedEndDate() {
			return expectedEndDate;
		}

		public void setExpectedEndDate(LocalDate expectedEndDate) {
			this.expectedEndDate = expectedEndDate;
		}

		public LocalDate getCreatedOn() {
			return createdOn;
		}

		public void setCreatedOn(LocalDate createdOn) {
			this.createdOn = createdOn;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public LocalDate getLastUpdatedOn() {
			return lastUpdatedOn;
		}

		public void setLastUpdatedOn(LocalDate lastUpdatedOn) {
			this.lastUpdatedOn = lastUpdatedOn;
		}

		public Clients getClients() {
			return clients;
		}

		public void setClients(Clients clients) {
			this.clients = clients;
		}

		public Projects() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Projects(long projectCode, String title, long budget, LocalDate startDate, LocalDate expectedEndDate,
				LocalDate createdOn, String status, LocalDate lastUpdatedOn, Clients clients) {
			super();
			this.projectCode = projectCode;
			this.title = title;
			this.budget = budget;
			this.startDate = startDate;
			this.expectedEndDate = expectedEndDate;
			this.createdOn = createdOn;
			this.status = status;
			this.lastUpdatedOn = lastUpdatedOn;
			this.clients = clients;
		}
		
		
        
        
}
