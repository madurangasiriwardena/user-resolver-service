package org.maduranga.spring;

import com.fasterxml.jackson.databind.module.SimpleModule;
import org.maduranga.model.EventEvents;

public class CustomModule extends SimpleModule {
    public CustomModule() {
        addDeserializer(EventEvents.class, new CustomDeserializer());
    }
}

