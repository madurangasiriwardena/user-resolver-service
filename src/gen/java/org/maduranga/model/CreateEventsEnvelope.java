package org.maduranga.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.maduranga.model.CreateEvent;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateEventsEnvelope
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-24T20:50:36.192503+05:30[Asia/Colombo]")
public class CreateEventsEnvelope implements EventEvents {

  private CreateEvent urnColonIetfColonParamsColonSCIMColonEventColonProvColonCreateColonFull;

  public CreateEventsEnvelope urnColonIetfColonParamsColonSCIMColonEventColonProvColonCreateColonFull(CreateEvent urnColonIetfColonParamsColonSCIMColonEventColonProvColonCreateColonFull) {
    this.urnColonIetfColonParamsColonSCIMColonEventColonProvColonCreateColonFull = urnColonIetfColonParamsColonSCIMColonEventColonProvColonCreateColonFull;
    return this;
  }

  /**
   * Get urnColonIetfColonParamsColonSCIMColonEventColonProvColonCreateColonFull
   * @return urnColonIetfColonParamsColonSCIMColonEventColonProvColonCreateColonFull
  */
  @Valid 
  @Schema(name = "urn:ietf:params:SCIM:event:prov:create:full", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("urn:ietf:params:SCIM:event:prov:create:full")
  public CreateEvent getUrnColonIetfColonParamsColonSCIMColonEventColonProvColonCreateColonFull() {
    return urnColonIetfColonParamsColonSCIMColonEventColonProvColonCreateColonFull;
  }

  public void setUrnColonIetfColonParamsColonSCIMColonEventColonProvColonCreateColonFull(CreateEvent urnColonIetfColonParamsColonSCIMColonEventColonProvColonCreateColonFull) {
    this.urnColonIetfColonParamsColonSCIMColonEventColonProvColonCreateColonFull = urnColonIetfColonParamsColonSCIMColonEventColonProvColonCreateColonFull;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEventsEnvelope createEventsEnvelope = (CreateEventsEnvelope) o;
    return Objects.equals(this.urnColonIetfColonParamsColonSCIMColonEventColonProvColonCreateColonFull, createEventsEnvelope.urnColonIetfColonParamsColonSCIMColonEventColonProvColonCreateColonFull);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urnColonIetfColonParamsColonSCIMColonEventColonProvColonCreateColonFull);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEventsEnvelope {\n");
    sb.append("    urnColonIetfColonParamsColonSCIMColonEventColonProvColonCreateColonFull: ").append(toIndentedString(urnColonIetfColonParamsColonSCIMColonEventColonProvColonCreateColonFull)).append("\n");
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

