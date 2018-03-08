/*
 * Jama REST API
 * This is the documentation for the Jama REST API.
 *
 * OpenAPI spec version: latest
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AllowedResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-07T18:50:05.195+01:00")
public class AllowedResource {
  @SerializedName("allowed")
  private List<String> allowed = null;

  public AllowedResource allowed(List<String> allowed) {
    this.allowed = allowed;
    return this;
  }

  public AllowedResource addAllowedItem(String allowedItem) {
    if (this.allowed == null) {
      this.allowed = new ArrayList<String>();
    }
    this.allowed.add(allowedItem);
    return this;
  }

   /**
   * Get allowed
   * @return allowed
  **/
  @ApiModelProperty(value = "")
  public List<String> getAllowed() {
    return allowed;
  }

  public void setAllowed(List<String> allowed) {
    this.allowed = allowed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllowedResource allowedResource = (AllowedResource) o;
    return Objects.equals(this.allowed, allowedResource.allowed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllowedResource {\n");
    
    sb.append("    allowed: ").append(toIndentedString(allowed)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
