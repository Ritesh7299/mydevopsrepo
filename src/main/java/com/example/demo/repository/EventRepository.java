package com.example.demo.repository;

import com.example.demo.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {

   // @Autowired
   // private EventRepository userRepository;

   // public List<Event>;

}
