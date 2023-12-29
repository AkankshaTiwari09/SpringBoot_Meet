package com.demo.meet.repository;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.meet.entity.Event;

@Repository
public interface EventRepo extends JpaRepository<Event , Integer>{
	
	/*
	@Query(value="Select max(event_id) from event" , nativeQuery=true)
	int findMaxId();
	*/
	
	
	@Query(value="Select * from event  where calendar_id=?1 and start_time>?2 and end_time<?3", nativeQuery=true)
	List<Event> findEvents(int calendar_id,LocalDateTime start_time,LocalDateTime end_time);
	
	
	

}
