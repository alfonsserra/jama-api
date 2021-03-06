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
 * TestRunGenerationConfig
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-07T18:50:05.195+01:00")
public class TestRunGenerationConfig {
  @SerializedName("testGroupsToInclude")
  private List<Integer> testGroupsToInclude = null;

  /**
   * Gets or Sets testRunStatusesToInclude
   */
  @JsonAdapter(TestRunStatusesToIncludeEnum.Adapter.class)
  public enum TestRunStatusesToIncludeEnum {
    PASSED("PASSED"),
    
    NOT_RUN("NOT_RUN"),
    
    INPROGRESS("INPROGRESS"),
    
    FAILED("FAILED"),
    
    BLOCKED("BLOCKED");

    private String value;

    TestRunStatusesToIncludeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TestRunStatusesToIncludeEnum fromValue(String text) {
      for (TestRunStatusesToIncludeEnum b : TestRunStatusesToIncludeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TestRunStatusesToIncludeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TestRunStatusesToIncludeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TestRunStatusesToIncludeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TestRunStatusesToIncludeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("testRunStatusesToInclude")
  private List<TestRunStatusesToIncludeEnum> testRunStatusesToInclude = null;

  public TestRunGenerationConfig testGroupsToInclude(List<Integer> testGroupsToInclude) {
    this.testGroupsToInclude = testGroupsToInclude;
    return this;
  }

  public TestRunGenerationConfig addTestGroupsToIncludeItem(Integer testGroupsToIncludeItem) {
    if (this.testGroupsToInclude == null) {
      this.testGroupsToInclude = new ArrayList<Integer>();
    }
    this.testGroupsToInclude.add(testGroupsToIncludeItem);
    return this;
  }

   /**
   * The Test Group IDs of the Test Groups from which you would like to generate Test Runs. Do not specify anything to include all groups.
   * @return testGroupsToInclude
  **/
  @ApiModelProperty(value = "The Test Group IDs of the Test Groups from which you would like to generate Test Runs. Do not specify anything to include all groups.")
  public List<Integer> getTestGroupsToInclude() {
    return testGroupsToInclude;
  }

  public void setTestGroupsToInclude(List<Integer> testGroupsToInclude) {
    this.testGroupsToInclude = testGroupsToInclude;
  }

  public TestRunGenerationConfig testRunStatusesToInclude(List<TestRunStatusesToIncludeEnum> testRunStatusesToInclude) {
    this.testRunStatusesToInclude = testRunStatusesToInclude;
    return this;
  }

  public TestRunGenerationConfig addTestRunStatusesToIncludeItem(TestRunStatusesToIncludeEnum testRunStatusesToIncludeItem) {
    if (this.testRunStatusesToInclude == null) {
      this.testRunStatusesToInclude = new ArrayList<TestRunStatusesToIncludeEnum>();
    }
    this.testRunStatusesToInclude.add(testRunStatusesToIncludeItem);
    return this;
  }

   /**
   * Only valid after generating the first Test Cycle, you may choose to only generate Test Runs that were a specified status in the previous cycle. Do not specify anything to include all statuses
   * @return testRunStatusesToInclude
  **/
  @ApiModelProperty(value = "Only valid after generating the first Test Cycle, you may choose to only generate Test Runs that were a specified status in the previous cycle. Do not specify anything to include all statuses")
  public List<TestRunStatusesToIncludeEnum> getTestRunStatusesToInclude() {
    return testRunStatusesToInclude;
  }

  public void setTestRunStatusesToInclude(List<TestRunStatusesToIncludeEnum> testRunStatusesToInclude) {
    this.testRunStatusesToInclude = testRunStatusesToInclude;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestRunGenerationConfig testRunGenerationConfig = (TestRunGenerationConfig) o;
    return Objects.equals(this.testGroupsToInclude, testRunGenerationConfig.testGroupsToInclude) &&
        Objects.equals(this.testRunStatusesToInclude, testRunGenerationConfig.testRunStatusesToInclude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(testGroupsToInclude, testRunStatusesToInclude);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestRunGenerationConfig {\n");
    
    sb.append("    testGroupsToInclude: ").append(toIndentedString(testGroupsToInclude)).append("\n");
    sb.append("    testRunStatusesToInclude: ").append(toIndentedString(testRunStatusesToInclude)).append("\n");
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

