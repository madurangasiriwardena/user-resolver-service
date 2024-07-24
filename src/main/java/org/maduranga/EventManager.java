package org.maduranga;

import org.maduranga.dao.UserManagerDAO;
import org.maduranga.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class EventManager {

    private UserManagerDAO userManagerDAO;

    @Autowired
    public void setUserManagerDAO(UserManagerDAO userManagerDAO) {
        this.userManagerDAO = userManagerDAO;
    }

    public void handleEvent(Event event) {

        User user;

        EventEvents events = event.getEvents();
        if (events instanceof CreateEventsEnvelope) {
            CreateEventsEnvelope createEventsEnvelope = (CreateEventsEnvelope) events;
            Map<String, String> attributes = new HashMap<>();
            CreateEventData eventData = createEventsEnvelope.getUrnColonIetfColonParamsColonSCIMColonEventColonProvColonCreateColonFull().getData();
            eventData.getAdditionalProperties().forEach((key, value) -> {
                attributes.put(key, value);
            });
            user = new User(event.getSubId().getId(), event.getIss(), attributes);

        } else if (events instanceof PutEventsEnvelope) {
            CreateEventsEnvelope createEventsEnvelope = (CreateEventsEnvelope) events;
            Map<String, String> attributes = new HashMap<>();
            createEventsEnvelope.getUrnColonIetfColonParamsColonSCIMColonEventColonProvColonCreateColonFull().getData().getAdditionalProperties().forEach((key, value) -> {
                attributes.put(key, value);
            });
            user = new User(event.getSubId().getId(), event.getIss(), attributes);
        } else {
            System.out.println("Unknown event type");
            user = null;
        }
        if (user != null) {
            userManagerDAO.addUser(user);
        }
    }
}
