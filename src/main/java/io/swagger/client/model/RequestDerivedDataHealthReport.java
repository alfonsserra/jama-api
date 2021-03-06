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
 * RequestDerivedDataHealthReport
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-07T18:50:05.195+01:00")
public class RequestDerivedDataHealthReport {
  /**
   * Gets or Sets reportType
   */
  @JsonAdapter(ReportTypeEnum.Adapter.class)
  public enum ReportTypeEnum {
    TEST_CASE_STATUS("TEST_CASE_STATUS"),
    
    CALCULATED("CALCULATED"),
    
    ROLLUP("ROLLUP"),
    
    RELATIONSHIP_STATS("RELATIONSHIP_STATS");

    private String value;

    ReportTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReportTypeEnum fromValue(String text) {
      for (ReportTypeEnum b : ReportTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ReportTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReportTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReportTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ReportTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("reportType")
  private ReportTypeEnum reportType = null;

  @SerializedName("repair")
  private Boolean repair = null;

  public RequestDerivedDataHealthReport reportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
    return this;
  }

   /**
   * Get reportType
   * @return reportType
  **/
  @ApiModelProperty(value = "")
  public ReportTypeEnum getReportType() {
    return reportType;
  }

  public void setReportType(ReportTypeEnum reportType) {
    this.reportType = reportType;
  }

  public RequestDerivedDataHealthReport repair(Boolean repair) {
    this.repair = repair;
    return this;
  }

   /**
   * Get repair
   * @return repair
  **/
  @ApiModelProperty(value = "")
  public Boolean isRepair() {
    return repair;
  }

  public void setRepair(Boolean repair) {
    this.repair = repair;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestDerivedDataHealthReport requestDerivedDataHealthReport = (RequestDerivedDataHealthReport) o;
    return Objects.equals(this.reportType, requestDerivedDataHealthReport.reportType) &&
        Objects.equals(this.repair, requestDerivedDataHealthReport.repair);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportType, repair);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestDerivedDataHealthReport {\n");
    
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    repair: ").append(toIndentedString(repair)).append("\n");
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

