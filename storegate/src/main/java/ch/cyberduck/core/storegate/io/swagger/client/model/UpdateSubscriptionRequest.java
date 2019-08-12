/*
 * Storegate.Web
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.cyberduck.core.storegate.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-04T12:02:08.868+02:00")
public class UpdateSubscriptionRequest {
  @JsonProperty("salepackageId")
  private String salepackageId = null;

  @JsonProperty("campaignId")
  private String campaignId = null;

  @JsonProperty("storageId")
  private String storageId = null;

  @JsonProperty("multiId")
  private String multiId = null;

  @JsonProperty("backupId")
  private String backupId = null;

  @JsonProperty("syncId")
  private String syncId = null;

  @JsonProperty("bankIDId")
  private String bankIDId = null;

  public UpdateSubscriptionRequest salepackageId(String salepackageId) {
    this.salepackageId = salepackageId;
    return this;
  }

   /**
   * 
   * @return salepackageId
  **/
  @ApiModelProperty(value = "")
  public String getSalepackageId() {
    return salepackageId;
  }

  public void setSalepackageId(String salepackageId) {
    this.salepackageId = salepackageId;
  }

  public UpdateSubscriptionRequest campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

   /**
   * 
   * @return campaignId
  **/
  @ApiModelProperty(value = "")
  public String getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

  public UpdateSubscriptionRequest storageId(String storageId) {
    this.storageId = storageId;
    return this;
  }

   /**
   * 
   * @return storageId
  **/
  @ApiModelProperty(value = "")
  public String getStorageId() {
    return storageId;
  }

  public void setStorageId(String storageId) {
    this.storageId = storageId;
  }

  public UpdateSubscriptionRequest multiId(String multiId) {
    this.multiId = multiId;
    return this;
  }

   /**
   * 
   * @return multiId
  **/
  @ApiModelProperty(value = "")
  public String getMultiId() {
    return multiId;
  }

  public void setMultiId(String multiId) {
    this.multiId = multiId;
  }

  public UpdateSubscriptionRequest backupId(String backupId) {
    this.backupId = backupId;
    return this;
  }

   /**
   * 
   * @return backupId
  **/
  @ApiModelProperty(value = "")
  public String getBackupId() {
    return backupId;
  }

  public void setBackupId(String backupId) {
    this.backupId = backupId;
  }

  public UpdateSubscriptionRequest syncId(String syncId) {
    this.syncId = syncId;
    return this;
  }

   /**
   * 
   * @return syncId
  **/
  @ApiModelProperty(value = "")
  public String getSyncId() {
    return syncId;
  }

  public void setSyncId(String syncId) {
    this.syncId = syncId;
  }

  public UpdateSubscriptionRequest bankIDId(String bankIDId) {
    this.bankIDId = bankIDId;
    return this;
  }

   /**
   * 
   * @return bankIDId
  **/
  @ApiModelProperty(value = "")
  public String getBankIDId() {
    return bankIDId;
  }

  public void setBankIDId(String bankIDId) {
    this.bankIDId = bankIDId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSubscriptionRequest updateSubscriptionRequest = (UpdateSubscriptionRequest) o;
    return Objects.equals(this.salepackageId, updateSubscriptionRequest.salepackageId) &&
        Objects.equals(this.campaignId, updateSubscriptionRequest.campaignId) &&
        Objects.equals(this.storageId, updateSubscriptionRequest.storageId) &&
        Objects.equals(this.multiId, updateSubscriptionRequest.multiId) &&
        Objects.equals(this.backupId, updateSubscriptionRequest.backupId) &&
        Objects.equals(this.syncId, updateSubscriptionRequest.syncId) &&
        Objects.equals(this.bankIDId, updateSubscriptionRequest.bankIDId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(salepackageId, campaignId, storageId, multiId, backupId, syncId, bankIDId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSubscriptionRequest {\n");
    
    sb.append("    salepackageId: ").append(toIndentedString(salepackageId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    storageId: ").append(toIndentedString(storageId)).append("\n");
    sb.append("    multiId: ").append(toIndentedString(multiId)).append("\n");
    sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
    sb.append("    syncId: ").append(toIndentedString(syncId)).append("\n");
    sb.append("    bankIDId: ").append(toIndentedString(bankIDId)).append("\n");
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
