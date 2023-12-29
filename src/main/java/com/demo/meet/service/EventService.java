package com.demo.meet.service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;


import com.demo.meet.entity.Event;


public interface EventService {
	
	//create a new event: title, start_time, end_time, list(calendar_ids)
	//fetch events: calendar_id, start_time, end_time
	
	Event createEvent(String title, LocalDateTime start_time, LocalDateTime end_time, List<Integer> calendar_ids );
	List<Event> fetchEvent(int calendar_id, LocalDateTime start_time, LocalDateTime end_time); 

}
