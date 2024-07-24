package org.maduranga.api.impl;

import org.maduranga.EventManager;
import org.maduranga.api.EventsApi;
import org.maduranga.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class EventsController implements EventsApi {

    EventManager eventManager;

    @Autowired
    public void setEventManager(EventManager eventManager) {
        this.eventManager = eventManager;
    }

    public ResponseEntity<Void> receiveEvent(@Valid Event event) {
        // Implement the receiveEvent method
        eventManager.handleEvent(event);
        return ResponseEntity.accepted().build();
    }
}
