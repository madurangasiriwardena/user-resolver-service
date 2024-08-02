package org.maduranga.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DeleteEventsEnvelope
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-08-02T20:02:19.302454+05:30[Asia/Colombo]")
public class DeleteEventsEnvelope implements EventEvents {

  private Object urnColonIetfColonParamsColonSCIMColonEventColonProvColonDelete;

  public DeleteEventsEnvelope urnColonIetfColonParamsColonSCIMColonEventColonProvColonDelete(Object urnColonIetfColonParamsColonSCIMColonEventColonProvColonDelete) {
    this.urnColonIetfColonParamsColonSCIMColonEventColonProvColonDelete = urnColonIetfColonParamsColonSCIMColonEventColonProvColonDelete;
    return this;
  }

  /**
   * Get urnColonIetfColonParamsColonSCIMColonEventColonProvColonDelete
   * @return urnColonIetfColonParamsColonSCIMColonEventColonProvColonDelete
  */
  
  @Schema(name = "urn:ietf:params:SCIM:event:prov:delete", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("urn:ietf:params:SCIM:event:prov:delete")
  public Object getUrnColonIetfColonParamsColonSCIMColonEventColonProvColonDelete() {
    return urnColonIetfColonParamsColonSCIMColonEventColonProvColonDelete;
  }

  public void setUrnColonIetfColonParamsColonSCIMColonEventColonProvColonDelete(Object urnColonIetfColonParamsColonSCIMColonEventColonProvColonDelete) {
    this.urnColonIetfColonParamsColonSCIMColonEventColonProvColonDelete = urnColonIetfColonParamsColonSCIMColonEventColonProvColonDelete;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteEventsEnvelope deleteEventsEnvelope = (DeleteEventsEnvelope) o;
    return Objects.equals(this.urnColonIetfColonParamsColonSCIMColonEventColonProvColonDelete, deleteEventsEnvelope.urnColonIetfColonParamsColonSCIMColonEventColonProvColonDelete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urnColonIetfColonParamsColonSCIMColonEventColonProvColonDelete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteEventsEnvelope {\n");
    sb.append("    urnColonIetfColonParamsColonSCIMColonEventColonProvColonDelete: ").append(toIndentedString(urnColonIetfColonParamsColonSCIMColonEventColonProvColonDelete)).append("\n");
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

