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
import io.swagger.client.model.DerivedDataFailure;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DerivedDataHealthDetailsReport
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-07T18:50:05.195+01:00")
public class DerivedDataHealthDetailsReport {
  @SerializedName("numberItemsChecked")
  private Integer numberItemsChecked = null;

  @SerializedName("numberChecksFailed")
  private Integer numberChecksFailed = null;

  @SerializedName("failures")
  private List<DerivedDataFailure> failures = null;

  public DerivedDataHealthDetailsReport numberItemsChecked(Integer numberItemsChecked) {
    this.numberItemsChecked = numberItemsChecked;
    return this;
  }

   /**
   * Get numberItemsChecked
   * @return numberItemsChecked
  **/
  @ApiModelProperty(value = "")
  public Integer getNumberItemsChecked() {
    return numberItemsChecked;
  }

  public void setNumberItemsChecked(Integer numberItemsChecked) {
    this.numberItemsChecked = numberItemsChecked;
  }

  public DerivedDataHealthDetailsReport numberChecksFailed(Integer numberChecksFailed) {
    this.numberChecksFailed = numberChecksFailed;
    return this;
  }

   /**
   * Get numberChecksFailed
   * @return numberChecksFailed
  **/
  @ApiModelProperty(value = "")
  public Integer getNumberChecksFailed() {
    return numberChecksFailed;
  }

  public void setNumberChecksFailed(Integer numberChecksFailed) {
    this.numberChecksFailed = numberChecksFailed;
  }

  public DerivedDataHealthDetailsReport failures(List<DerivedDataFailure> failures) {
    this.failures = failures;
    return this;
  }

  public DerivedDataHealthDetailsReport addFailuresItem(DerivedDataFailure failuresItem) {
    if (this.failures == null) {
      this.failures = new ArrayList<DerivedDataFailure>();
    }
    this.failures.add(failuresItem);
    return this;
  }

   /**
   * Get failures
   * @return failures
  **/
  @ApiModelProperty(value = "")
  public List<DerivedDataFailure> getFailures() {
    return failures;
  }

  public void setFailures(List<DerivedDataFailure> failures) {
    this.failures = failures;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DerivedDataHealthDetailsReport derivedDataHealthDetailsReport = (DerivedDataHealthDetailsReport) o;
    return Objects.equals(this.numberItemsChecked, derivedDataHealthDetailsReport.numberItemsChecked) &&
        Objects.equals(this.numberChecksFailed, derivedDataHealthDetailsReport.numberChecksFailed) &&
        Objects.equals(this.failures, derivedDataHealthDetailsReport.failures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberItemsChecked, numberChecksFailed, failures);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DerivedDataHealthDetailsReport {\n");
    
    sb.append("    numberItemsChecked: ").append(toIndentedString(numberItemsChecked)).append("\n");
    sb.append("    numberChecksFailed: ").append(toIndentedString(numberChecksFailed)).append("\n");
    sb.append("    failures: ").append(toIndentedString(failures)).append("\n");
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

