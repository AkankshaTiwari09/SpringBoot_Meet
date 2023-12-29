package controller;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.meet.entity.Event;
import com.demo.meet.service.EventService_Impl;

@RestController
public class MeetController {
	
	@Autowired
	EventService_Impl eventService;
	
	
	
	@GetMapping("/get/{id}/{start_time}/{end_time}")
	public List<Event> fetchEvent(@PathVariable("id")int id, @PathVariable("start_time")LocalDateTime start_time, @PathVariable("end_time")LocalDateTime end_time){

		return eventService.fetchEvent(id,start_time,end_time);
		
	}
	
	
	
	@PostMapping("/event/{title}/{start_time}/{end_time}/{calendar_ids}")
	public Event createEvent(@PathVariable("title")String title, 
			@PathVariable("start_time")  LocalDateTime start_time, 
			@PathVariable("end_time")  LocalDateTime end_time, @PathVariable("calendar_ids")List<Integer> calendar_ids){
		System.out.println("inside create event");
		return eventService.createEvent(title,start_time,end_time,calendar_ids);
		
	}
	
	
	
	
	
	
	
	

}
