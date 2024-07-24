package org.maduranga.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.maduranga.model.EventEvents;
import org.maduranga.model.SubId;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Event
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-24T20:50:36.192503+05:30[Asia/Colombo]")
public class Event {

  private String jti;

  private BigDecimal iat;

  private String iss;

  @Valid
  private List<String> aud;

  private SubId subId;

  private EventEvents events;

  public Event() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Event(String jti, BigDecimal iat, String iss, SubId subId, EventEvents events) {
    this.jti = jti;
    this.iat = iat;
    this.iss = iss;
    this.subId = subId;
    this.events = events;
  }

  public Event jti(String jti) {
    this.jti = jti;
    return this;
  }

  /**
   * Get jti
   * @return jti
  */
  @NotNull 
  @Schema(name = "jti", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("jti")
  public String getJti() {
    return jti;
  }

  public void setJti(String jti) {
    this.jti = jti;
  }

  public Event iat(BigDecimal iat) {
    this.iat = iat;
    return this;
  }

  /**
   * Get iat
   * @return iat
  */
  @NotNull @Valid 
  @Schema(name = "iat", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("iat")
  public BigDecimal getIat() {
    return iat;
  }

  public void setIat(BigDecimal iat) {
    this.iat = iat;
  }

  public Event iss(String iss) {
    this.iss = iss;
    return this;
  }

  /**
   * Get iss
   * @return iss
  */
  @NotNull 
  @Schema(name = "iss", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("iss")
  public String getIss() {
    return iss;
  }

  public void setIss(String iss) {
    this.iss = iss;
  }

  public Event aud(List<String> aud) {
    this.aud = aud;
    return this;
  }

  public Event addAudItem(String audItem) {
    if (this.aud == null) {
      this.aud = new ArrayList<>();
    }
    this.aud.add(audItem);
    return this;
  }

  /**
   * Get aud
   * @return aud
  */
  
  @Schema(name = "aud", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aud")
  public List<String> getAud() {
    return aud;
  }

  public void setAud(List<String> aud) {
    this.aud = aud;
  }

  public Event subId(SubId subId) {
    this.subId = subId;
    return this;
  }

  /**
   * Get subId
   * @return subId
  */
  @NotNull @Valid 
  @Schema(name = "sub_id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sub_id")
  public SubId getSubId() {
    return subId;
  }

  public void setSubId(SubId subId) {
    this.subId = subId;
  }

  public Event events(EventEvents events) {
    this.events = events;
    return this;
  }

  /**
   * Get events
   * @return events
  */
  @NotNull @Valid 
  @Schema(name = "events", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("events")
  public EventEvents getEvents() {
    return events;
  }

  public void setEvents(EventEvents events) {
    this.events = events;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.jti, event.jti) &&
        Objects.equals(this.iat, event.iat) &&
        Objects.equals(this.iss, event.iss) &&
        Objects.equals(this.aud, event.aud) &&
        Objects.equals(this.subId, event.subId) &&
        Objects.equals(this.events, event.events);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jti, iat, iss, aud, subId, events);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    sb.append("    jti: ").append(toIndentedString(jti)).append("\n");
    sb.append("    iat: ").append(toIndentedString(iat)).append("\n");
    sb.append("    iss: ").append(toIndentedString(iss)).append("\n");
    sb.append("    aud: ").append(toIndentedString(aud)).append("\n");
    sb.append("    subId: ").append(toIndentedString(subId)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

