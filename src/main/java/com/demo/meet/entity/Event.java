package com.demo.meet.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Event {
	
	public Event( String title2, LocalDateTime start_time2, LocalDateTime end_time2) {
		title=title2;
		start_time=start_time2;
		end_time=end_time2;
		//calendar=calendar_id2;
	}

	//title, start_time, end_time, participants(calendar_ids)
	@Id
	@GeneratedValue
	private int event_id;
	private String title;
	private LocalDateTime start_time;
	private LocalDateTime end_time;

}
