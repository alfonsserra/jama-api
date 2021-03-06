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

/**
 * CollectionSummary
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-07T18:50:05.195+01:00")
public class CollectionSummary {
  @SerializedName("totalChildren")
  private Integer totalChildren = null;

  @SerializedName("totalMissing")
  private Integer totalMissing = null;

  @SerializedName("totalOutOfSync")
  private Integer totalOutOfSync = null;

  public CollectionSummary totalChildren(Integer totalChildren) {
    this.totalChildren = totalChildren;
    return this;
  }

   /**
   * Get totalChildren
   * @return totalChildren
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getTotalChildren() {
    return totalChildren;
  }

  public void setTotalChildren(Integer totalChildren) {
    this.totalChildren = totalChildren;
  }

  public CollectionSummary totalMissing(Integer totalMissing) {
    this.totalMissing = totalMissing;
    return this;
  }

   /**
   * Get totalMissing
   * @return totalMissing
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getTotalMissing() {
    return totalMissing;
  }

  public void setTotalMissing(Integer totalMissing) {
    this.totalMissing = totalMissing;
  }

  public CollectionSummary totalOutOfSync(Integer totalOutOfSync) {
    this.totalOutOfSync = totalOutOfSync;
    return this;
  }

   /**
   * Get totalOutOfSync
   * @return totalOutOfSync
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getTotalOutOfSync() {
    return totalOutOfSync;
  }

  public void setTotalOutOfSync(Integer totalOutOfSync) {
    this.totalOutOfSync = totalOutOfSync;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectionSummary collectionSummary = (CollectionSummary) o;
    return Objects.equals(this.totalChildren, collectionSummary.totalChildren) &&
        Objects.equals(this.totalMissing, collectionSummary.totalMissing) &&
        Objects.equals(this.totalOutOfSync, collectionSummary.totalOutOfSync);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalChildren, totalMissing, totalOutOfSync);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectionSummary {\n");
    
    sb.append("    totalChildren: ").append(toIndentedString(totalChildren)).append("\n");
    sb.append("    totalMissing: ").append(toIndentedString(totalMissing)).append("\n");
    sb.append("    totalOutOfSync: ").append(toIndentedString(totalOutOfSync)).append("\n");
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

