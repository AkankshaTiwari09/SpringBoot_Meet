package com.demo.meet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.meet.entity.Calendar;

@Repository
public interface CalendarRepo extends JpaRepository<Calendar, Integer> {

}
