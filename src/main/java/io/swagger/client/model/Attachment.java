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
import io.swagger.client.model.AllowedResource;
import io.swagger.client.model.Lock;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * Attachment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-07T18:50:05.195+01:00")
public class Attachment {
  @SerializedName("lock")
  private Lock lock = null;

  @SerializedName("fileName")
  private String fileName = null;

  @SerializedName("mimeType")
  private String mimeType = null;

  @SerializedName("fileSize")
  private Integer fileSize = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("documentKey")
  private String documentKey = null;

  @SerializedName("globalId")
  private String globalId = null;

  @SerializedName("project")
  private Integer project = null;

  @SerializedName("itemType")
  private Integer itemType = null;

  @SerializedName("createdDate")
  private OffsetDateTime createdDate = null;

  @SerializedName("modifiedDate")
  private OffsetDateTime modifiedDate = null;

  @SerializedName("lastActivityDate")
  private OffsetDateTime lastActivityDate = null;

  @SerializedName("createdBy")
  private Integer createdBy = null;

  @SerializedName("modifiedBy")
  private Integer modifiedBy = null;

  @SerializedName("resources")
  private Map<String, AllowedResource> resources = new HashMap<String, AllowedResource>();

  @SerializedName("fields")
  private Map<String, Object> fields = new HashMap<String, Object>();

  public Attachment lock(Lock lock) {
    this.lock = lock;
    return this;
  }

   /**
   * Get lock
   * @return lock
  **/
  @ApiModelProperty(required = true, value = "")
  public Lock getLock() {
    return lock;
  }

  public void setLock(Lock lock) {
    this.lock = lock;
  }

  public Attachment fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public Attachment mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

   /**
   * Get mimeType
   * @return mimeType
  **/
  @ApiModelProperty(required = true, value = "")
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public Attachment fileSize(Integer fileSize) {
    this.fileSize = fileSize;
    return this;
  }

   /**
   * Get fileSize
   * @return fileSize
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getFileSize() {
    return fileSize;
  }

  public void setFileSize(Integer fileSize) {
    this.fileSize = fileSize;
  }

  public Attachment id(Integer id) {
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

  public Attachment documentKey(String documentKey) {
    this.documentKey = documentKey;
    return this;
  }

   /**
   * Get documentKey
   * @return documentKey
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDocumentKey() {
    return documentKey;
  }

  public void setDocumentKey(String documentKey) {
    this.documentKey = documentKey;
  }

  public Attachment globalId(String globalId) {
    this.globalId = globalId;
    return this;
  }

   /**
   * Get globalId
   * @return globalId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getGlobalId() {
    return globalId;
  }

  public void setGlobalId(String globalId) {
    this.globalId = globalId;
  }

  public Attachment project(Integer project) {
    this.project = project;
    return this;
  }

   /**
   * ID of a project
   * @return project
  **/
  @ApiModelProperty(required = true, value = "ID of a project")
  public Integer getProject() {
    return project;
  }

  public void setProject(Integer project) {
    this.project = project;
  }

  public Attachment itemType(Integer itemType) {
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

  public Attachment createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public Attachment modifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }

   /**
   * Get modifiedDate
   * @return modifiedDate
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }

  public void setModifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  public Attachment lastActivityDate(OffsetDateTime lastActivityDate) {
    this.lastActivityDate = lastActivityDate;
    return this;
  }

   /**
   * Get lastActivityDate
   * @return lastActivityDate
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getLastActivityDate() {
    return lastActivityDate;
  }

  public void setLastActivityDate(OffsetDateTime lastActivityDate) {
    this.lastActivityDate = lastActivityDate;
  }

  public Attachment createdBy(Integer createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * ID of a user
   * @return createdBy
  **/
  @ApiModelProperty(required = true, value = "ID of a user")
  public Integer getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Integer createdBy) {
    this.createdBy = createdBy;
  }

  public Attachment modifiedBy(Integer modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

   /**
   * ID of a user
   * @return modifiedBy
  **/
  @ApiModelProperty(required = true, value = "ID of a user")
  public Integer getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(Integer modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public Attachment resources(Map<String, AllowedResource> resources) {
    this.resources = resources;
    return this;
  }

  public Attachment putResourcesItem(String key, AllowedResource resourcesItem) {
    this.resources.put(key, resourcesItem);
    return this;
  }

   /**
   * A set of resources and allowed permissions
   * @return resources
  **/
  @ApiModelProperty(required = true, value = "A set of resources and allowed permissions")
  public Map<String, AllowedResource> getResources() {
    return resources;
  }

  public void setResources(Map<String, AllowedResource> resources) {
    this.resources = resources;
  }

  public Attachment fields(Map<String, Object> fields) {
    this.fields = fields;
    return this;
  }

  public Attachment putFieldsItem(String key, Object fieldsItem) {
    this.fields.put(key, fieldsItem);
    return this;
  }

   /**
   * A map of field names to field values e.g. {\&quot;name\&quot;:\&quot;Sample Item\&quot;, \&quot;status\&quot;: 292, \&quot;release\&quot;: 2, \&quot;assigned\&quot;: 23}
   * @return fields
  **/
  @ApiModelProperty(required = true, value = "A map of field names to field values e.g. {\"name\":\"Sample Item\", \"status\": 292, \"release\": 2, \"assigned\": 23}")
  public Map<String, Object> getFields() {
    return fields;
  }

  public void setFields(Map<String, Object> fields) {
    this.fields = fields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attachment attachment = (Attachment) o;
    return Objects.equals(this.lock, attachment.lock) &&
        Objects.equals(this.fileName, attachment.fileName) &&
        Objects.equals(this.mimeType, attachment.mimeType) &&
        Objects.equals(this.fileSize, attachment.fileSize) &&
        Objects.equals(this.id, attachment.id) &&
        Objects.equals(this.documentKey, attachment.documentKey) &&
        Objects.equals(this.globalId, attachment.globalId) &&
        Objects.equals(this.project, attachment.project) &&
        Objects.equals(this.itemType, attachment.itemType) &&
        Objects.equals(this.createdDate, attachment.createdDate) &&
        Objects.equals(this.modifiedDate, attachment.modifiedDate) &&
        Objects.equals(this.lastActivityDate, attachment.lastActivityDate) &&
        Objects.equals(this.createdBy, attachment.createdBy) &&
        Objects.equals(this.modifiedBy, attachment.modifiedBy) &&
        Objects.equals(this.resources, attachment.resources) &&
        Objects.equals(this.fields, attachment.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lock, fileName, mimeType, fileSize, id, documentKey, globalId, project, itemType, createdDate, modifiedDate, lastActivityDate, createdBy, modifiedBy, resources, fields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attachment {\n");
    
    sb.append("    lock: ").append(toIndentedString(lock)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    documentKey: ").append(toIndentedString(documentKey)).append("\n");
    sb.append("    globalId: ").append(toIndentedString(globalId)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    lastActivityDate: ").append(toIndentedString(lastActivityDate)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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

