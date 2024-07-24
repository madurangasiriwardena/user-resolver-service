package org.maduranga.spring;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import org.maduranga.model.CreateEventsEnvelope;
import org.maduranga.model.EventEvents;
import org.maduranga.model.PutEventsEnvelope;

import java.io.IOException;

public class CustomDeserializer extends JsonDeserializer<EventEvents> {
    @Override
    public EventEvents deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
        JsonNode node = jp.getCodec().readTree(jp);
        // Logic to determine which schema the node conforms to
        if (node.has("urn:ietf:params:SCIM:event:prov:create:full")) {
            // Deserialize as CreateEvent
            return jp.getCodec().treeToValue(node, CreateEventsEnvelope.class);
        } else if (node.has("urn:ietf:params:SCIM:event:prov:put:full")) {
            // Deserialize as PutEvent
            return jp.getCodec().treeToValue(node, PutEventsEnvelope.class);
        }
        throw new IOException("Unknown event type");
    }
}
