package com.demo.meet.service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.meet.entity.Calendar;
import com.demo.meet.entity.Event;
import com.demo.meet.repository.CalendarRepo;
import com.demo.meet.repository.EventRepo;

import jakarta.persistence.EntityNotFoundException;

@Service
public class EventService_Impl implements EventService {
	
	@Autowired
	EventRepo e_repo;
	
	@Autowired
	CalendarRepo c_repo;
	
	
	@Override
	public Event createEvent(String title, LocalDateTime start_time, LocalDateTime end_time, List<Integer> calendar_ids) {
		// TODO Auto-generated method stub
		Iterator<Integer> it = calendar_ids.iterator();
		Event event = new Event(title,start_time,end_time);
		while(it.hasNext())
		{
			Calendar calendar = c_repo.findById(it.next()).orElseThrow(EntityNotFoundException::new);;
			calendar.getEvents().add(event);
			
		}
		return e_repo.save(event);
		
	}

	@Override
	public List<Event> fetchEvent(int calendar_id, LocalDateTime start_time, LocalDateTime end_time) {
		// TODO Auto-generated method stub
		
		return e_repo.findEvents(calendar_id,start_time,end_time);
	}
	

}
