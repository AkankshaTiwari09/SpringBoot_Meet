package com.demo.meet.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Calendar {
	
	//user_id, description, created, updated
	
	public int getCalendar_id() {
		return calendar_id;
	}

	public void setCalendar_id(int calendar_id) {
		this.calendar_id = calendar_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getCreated() {
		return created;
	}

	public void setCreated(LocalDate created) {
		this.created = created;
	}

	public LocalDate getUpdated() {
		return updated;
	}

	public void setUpdated(LocalDate updated) {
		this.updated = updated;
	}

	public UserTable getUser() {
		return user;
	}

	public void setUser(UserTable user) {
		this.user = user;
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	@Id
	private int calendar_id;
	private String description;
	private LocalDate created;
	private LocalDate updated;
	
	@OneToOne
	@JoinColumn(
			name="user_id",
			referencedColumnName="user_id"
			)
	private UserTable user;
	
	@ManyToMany
	@JoinTable(
			 name="calendar_event_map",
			 joinColumns = @JoinColumn(
					 name ="calendar_id",
					 referencedColumnName="calendar_id"
					 
					 ),
			 inverseJoinColumns = @JoinColumn(
					 name ="event_id",
					 referencedColumnName="event_id"
					 
					 )
			)
	private List<Event> events;
	
	

}
