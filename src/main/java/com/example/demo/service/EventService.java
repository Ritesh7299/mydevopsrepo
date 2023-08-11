package com.example.demo.service;

import com.example.demo.model.Event;
import com.example.demo.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    // add event

    public Event addEvent(Event event) {
        return this.eventRepository.save(event);
    }

    //get all events

    public List<Event> getAllEvent() {
        return List.of();//this.eventRepository.finAll();
    }

}
