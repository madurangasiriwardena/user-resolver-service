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
 * PutEventsEnvelope
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-24T20:50:36.192503+05:30[Asia/Colombo]")
public class PutEventsEnvelope implements EventEvents {

  private CreateEvent urnColonIetfColonParamsColonSCIMColonEventColonProvColonPutColonFull;

  public PutEventsEnvelope urnColonIetfColonParamsColonSCIMColonEventColonProvColonPutColonFull(CreateEvent urnColonIetfColonParamsColonSCIMColonEventColonProvColonPutColonFull) {
    this.urnColonIetfColonParamsColonSCIMColonEventColonProvColonPutColonFull = urnColonIetfColonParamsColonSCIMColonEventColonProvColonPutColonFull;
    return this;
  }

  /**
   * Get urnColonIetfColonParamsColonSCIMColonEventColonProvColonPutColonFull
   * @return urnColonIetfColonParamsColonSCIMColonEventColonProvColonPutColonFull
  */
  @Valid 
  @Schema(name = "urn:ietf:params:SCIM:event:prov:put:full", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("urn:ietf:params:SCIM:event:prov:put:full")
  public CreateEvent getUrnColonIetfColonParamsColonSCIMColonEventColonProvColonPutColonFull() {
    return urnColonIetfColonParamsColonSCIMColonEventColonProvColonPutColonFull;
  }

  public void setUrnColonIetfColonParamsColonSCIMColonEventColonProvColonPutColonFull(CreateEvent urnColonIetfColonParamsColonSCIMColonEventColonProvColonPutColonFull) {
    this.urnColonIetfColonParamsColonSCIMColonEventColonProvColonPutColonFull = urnColonIetfColonParamsColonSCIMColonEventColonProvColonPutColonFull;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutEventsEnvelope putEventsEnvelope = (PutEventsEnvelope) o;
    return Objects.equals(this.urnColonIetfColonParamsColonSCIMColonEventColonProvColonPutColonFull, putEventsEnvelope.urnColonIetfColonParamsColonSCIMColonEventColonProvColonPutColonFull);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urnColonIetfColonParamsColonSCIMColonEventColonProvColonPutColonFull);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutEventsEnvelope {\n");
    sb.append("    urnColonIetfColonParamsColonSCIMColonEventColonProvColonPutColonFull: ").append(toIndentedString(urnColonIetfColonParamsColonSCIMColonEventColonProvColonPutColonFull)).append("\n");
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

