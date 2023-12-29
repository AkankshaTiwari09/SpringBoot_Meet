package com.demo.meet.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserTable {
	
	//user_id, name, created, updated
	
	@Id
	private int user_id;
	private String name;
	private LocalDate created;
	private LocalDate updated;
	
	@OneToOne(
			mappedBy = "user"
			)
	private Calendar calendar;
	
	

}
