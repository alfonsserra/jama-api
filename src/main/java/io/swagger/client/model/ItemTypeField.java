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
 * ItemTypeField
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-07T18:50:05.195+01:00")
public class ItemTypeField {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("label")
  private String label = null;

  /**
   * Gets or Sets fieldType
   */
  @JsonAdapter(FieldTypeEnum.Adapter.class)
  public enum FieldTypeEnum {
    INTEGER("INTEGER"),
    
    STRING("STRING"),
    
    TEXT("TEXT"),
    
    LOOKUP("LOOKUP"),
    
    DATE("DATE"),
    
    USER("USER"),
    
    RELEASE("RELEASE"),
    
    BOOLEAN("BOOLEAN"),
    
    GROUP("GROUP"),
    
    MULTI_LOOKUP("MULTI_LOOKUP"),
    
    DOCUMENT_TYPE_ITEM_LOOKUP("DOCUMENT_TYPE_ITEM_LOOKUP"),
    
    URL_STRING("URL_STRING"),
    
    DOCUMENT_TYPE("DOCUMENT_TYPE"),
    
    PROJECT("PROJECT"),
    
    STEPS("STEPS"),
    
    TIME("TIME"),
    
    TEST_RUN_STATUS("TEST_RUN_STATUS"),
    
    DOCUMENT_TYPE_CATEGORY_ITEM_LOOKUP("DOCUMENT_TYPE_CATEGORY_ITEM_LOOKUP"),
    
    TEST_CASE_STATUS("TEST_CASE_STATUS"),
    
    ACTIONS("ACTIONS"),
    
    ROLLUP("ROLLUP"),
    
    RELATIVE_DATE_RANGE("RELATIVE_DATE_RANGE"),
    
    CALCULATED("CALCULATED"),
    
    RELATIONSHIP_STATUS("RELATIONSHIP_STATUS");

    private String value;

    FieldTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FieldTypeEnum fromValue(String text) {
      for (FieldTypeEnum b : FieldTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FieldTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FieldTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FieldTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return FieldTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("fieldType")
  private FieldTypeEnum fieldType = null;

  @SerializedName("readOnly")
  private Boolean readOnly = null;

  @SerializedName("readOnlyAllowApiOverwrite")
  private Boolean readOnlyAllowApiOverwrite = null;

  @SerializedName("required")
  private Boolean required = null;

  @SerializedName("triggerSuspect")
  private Boolean triggerSuspect = null;

  @SerializedName("synchronize")
  private Boolean synchronize = null;

  @SerializedName("pickList")
  private Integer pickList = null;

  /**
   * Gets or Sets textType
   */
  @JsonAdapter(TextTypeEnum.Adapter.class)
  public enum TextTypeEnum {
    TEXTAREA("TEXTAREA"),
    
    RICHTEXT("RICHTEXT"),
    
    KEY("KEY"),
    
    ATTACHMENT("ATTACHMENT");

    private String value;

    TextTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TextTypeEnum fromValue(String text) {
      for (TextTypeEnum b : TextTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TextTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TextTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TextTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TextTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("textType")
  private TextTypeEnum textType = null;

  @SerializedName("itemType")
  private Integer itemType = null;

  public ItemTypeField id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ItemTypeField name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ItemTypeField label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(required = true, value = "")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public ItemTypeField fieldType(FieldTypeEnum fieldType) {
    this.fieldType = fieldType;
    return this;
  }

   /**
   * Get fieldType
   * @return fieldType
  **/
  @ApiModelProperty(required = true, value = "")
  public FieldTypeEnum getFieldType() {
    return fieldType;
  }

  public void setFieldType(FieldTypeEnum fieldType) {
    this.fieldType = fieldType;
  }

  public ItemTypeField readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Get readOnly
   * @return readOnly
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public ItemTypeField readOnlyAllowApiOverwrite(Boolean readOnlyAllowApiOverwrite) {
    this.readOnlyAllowApiOverwrite = readOnlyAllowApiOverwrite;
    return this;
  }

   /**
   * Get readOnlyAllowApiOverwrite
   * @return readOnlyAllowApiOverwrite
  **/
  @ApiModelProperty(value = "")
  public Boolean isReadOnlyAllowApiOverwrite() {
    return readOnlyAllowApiOverwrite;
  }

  public void setReadOnlyAllowApiOverwrite(Boolean readOnlyAllowApiOverwrite) {
    this.readOnlyAllowApiOverwrite = readOnlyAllowApiOverwrite;
  }

  public ItemTypeField required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Get required
   * @return required
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public ItemTypeField triggerSuspect(Boolean triggerSuspect) {
    this.triggerSuspect = triggerSuspect;
    return this;
  }

   /**
   * Get triggerSuspect
   * @return triggerSuspect
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isTriggerSuspect() {
    return triggerSuspect;
  }

  public void setTriggerSuspect(Boolean triggerSuspect) {
    this.triggerSuspect = triggerSuspect;
  }

  public ItemTypeField synchronize(Boolean synchronize) {
    this.synchronize = synchronize;
    return this;
  }

   /**
   * Get synchronize
   * @return synchronize
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isSynchronize() {
    return synchronize;
  }

  public void setSynchronize(Boolean synchronize) {
    this.synchronize = synchronize;
  }

  public ItemTypeField pickList(Integer pickList) {
    this.pickList = pickList;
    return this;
  }

   /**
   * ID of a pick list
   * @return pickList
  **/
  @ApiModelProperty(required = true, value = "ID of a pick list")
  public Integer getPickList() {
    return pickList;
  }

  public void setPickList(Integer pickList) {
    this.pickList = pickList;
  }

  public ItemTypeField textType(TextTypeEnum textType) {
    this.textType = textType;
    return this;
  }

   /**
   * Get textType
   * @return textType
  **/
  @ApiModelProperty(required = true, value = "")
  public TextTypeEnum getTextType() {
    return textType;
  }

  public void setTextType(TextTypeEnum textType) {
    this.textType = textType;
  }

  public ItemTypeField itemType(Integer itemType) {
    this.itemType = itemType;
    return this;
  }

   /**
   * ID of an item type
   * @return itemType
  **/
  @ApiModelProperty(required = true, value = "ID of an item type")
  public Integer getItemType() {
    return itemType;
  }

  public void setItemType(Integer itemType) {
    this.itemType = itemType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemTypeField itemTypeField = (ItemTypeField) o;
    return Objects.equals(this.id, itemTypeField.id) &&
        Objects.equals(this.name, itemTypeField.name) &&
        Objects.equals(this.label, itemTypeField.label) &&
        Objects.equals(this.fieldType, itemTypeField.fieldType) &&
        Objects.equals(this.readOnly, itemTypeField.readOnly) &&
        Objects.equals(this.readOnlyAllowApiOverwrite, itemTypeField.readOnlyAllowApiOverwrite) &&
        Objects.equals(this.required, itemTypeField.required) &&
        Objects.equals(this.triggerSuspect, itemTypeField.triggerSuspect) &&
        Objects.equals(this.synchronize, itemTypeField.synchronize) &&
        Objects.equals(this.pickList, itemTypeField.pickList) &&
        Objects.equals(this.textType, itemTypeField.textType) &&
        Objects.equals(this.itemType, itemTypeField.itemType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, label, fieldType, readOnly, readOnlyAllowApiOverwrite, required, triggerSuspect, synchronize, pickList, textType, itemType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemTypeField {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    readOnlyAllowApiOverwrite: ").append(toIndentedString(readOnlyAllowApiOverwrite)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    triggerSuspect: ").append(toIndentedString(triggerSuspect)).append("\n");
    sb.append("    synchronize: ").append(toIndentedString(synchronize)).append("\n");
    sb.append("    pickList: ").append(toIndentedString(pickList)).append("\n");
    sb.append("    textType: ").append(toIndentedString(textType)).append("\n");
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
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
