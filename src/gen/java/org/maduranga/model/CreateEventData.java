package org.maduranga.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
/**
 * CreateEventData
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-24T20:50:36.192503+05:30[Asia/Colombo]")
public class CreateEventData {

  private JsonNullable<Object> schemas = JsonNullable.<Object>undefined();

  public CreateEventData() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateEventData(Object schemas) {
    this.schemas = JsonNullable.of(schemas);
  }

  public CreateEventData schemas(Object schemas) {
    this.schemas = JsonNullable.of(schemas);
    return this;
  }

  /**
   * Get schemas
   * @return schemas
  */
  @NotNull 
  @Schema(name = "schemas", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("schemas")
  public JsonNullable<Object> getSchemas() {
    return schemas;
  }

  public void setSchemas(JsonNullable<Object> schemas) {
    this.schemas = schemas;
  }
    /**
    * A container for additional, undeclared properties.
    * This is a holder for any undeclared properties as specified with
    * the 'additionalProperties' keyword in the OAS document.
    */
    private Map<String, String> additionalProperties;

    /**
    * Set the additional (undeclared) property with the specified name and value.
    * If the property does not already exist, create it otherwise replace it.
    */
    @JsonAnySetter
    public CreateEventData putAdditionalProperty(String key, String value) {
        if (this.additionalProperties == null) {
            this.additionalProperties = new HashMap<String, String>();
        }
        this.additionalProperties.put(key, value);
        return this;
    }

    /**
    * Return the additional (undeclared) property.
    */
    @JsonAnyGetter
    public Map<String, String> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
    * Return the additional (undeclared) property with the specified name.
    */
    public String getAdditionalProperty(String key) {
        if (this.additionalProperties == null) {
            return null;
        }
        return this.additionalProperties.get(key);
    }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEventData createEventData = (CreateEventData) o;
    return Objects.equals(this.schemas, createEventData.schemas) &&
    Objects.equals(this.additionalProperties, createEventData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemas, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEventData {\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

