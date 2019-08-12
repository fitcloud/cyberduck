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
import ch.cyberduck.core.storegate.io.swagger.client.model.CampaignPrice;
import ch.cyberduck.core.storegate.io.swagger.client.model.SalepackageProduct;
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
public class UpgradeSalepackage {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("saleText")
  private String saleText = null;

  @JsonProperty("startFee")
  private Double startFee = null;

  @JsonProperty("campaignPrice")
  private CampaignPrice campaignPrice = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("monthlyFee")
  private Double monthlyFee = null;

  @JsonProperty("storage")
  private SalepackageProduct storage = null;

  @JsonProperty("multi")
  private SalepackageProduct multi = null;

  @JsonProperty("backup")
  private SalepackageProduct backup = null;

  @JsonProperty("sync")
  private SalepackageProduct sync = null;

  @JsonProperty("bankID")
  private SalepackageProduct bankID = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("isInclVAT")
  private Boolean isInclVAT = null;

  public UpgradeSalepackage description(String description) {
    this.description = description;
    return this;
  }

   /**
   * 
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UpgradeSalepackage saleText(String saleText) {
    this.saleText = saleText;
    return this;
  }

   /**
   * 
   * @return saleText
  **/
  @ApiModelProperty(value = "")
  public String getSaleText() {
    return saleText;
  }

  public void setSaleText(String saleText) {
    this.saleText = saleText;
  }

  public UpgradeSalepackage startFee(Double startFee) {
    this.startFee = startFee;
    return this;
  }

   /**
   * 
   * @return startFee
  **/
  @ApiModelProperty(value = "")
  public Double getStartFee() {
    return startFee;
  }

  public void setStartFee(Double startFee) {
    this.startFee = startFee;
  }

  public UpgradeSalepackage campaignPrice(CampaignPrice campaignPrice) {
    this.campaignPrice = campaignPrice;
    return this;
  }

   /**
   * 
   * @return campaignPrice
  **/
  @ApiModelProperty(value = "")
  public CampaignPrice getCampaignPrice() {
    return campaignPrice;
  }

  public void setCampaignPrice(CampaignPrice campaignPrice) {
    this.campaignPrice = campaignPrice;
  }

  public UpgradeSalepackage id(String id) {
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UpgradeSalepackage name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpgradeSalepackage monthlyFee(Double monthlyFee) {
    this.monthlyFee = monthlyFee;
    return this;
  }

   /**
   * 
   * @return monthlyFee
  **/
  @ApiModelProperty(value = "")
  public Double getMonthlyFee() {
    return monthlyFee;
  }

  public void setMonthlyFee(Double monthlyFee) {
    this.monthlyFee = monthlyFee;
  }

  public UpgradeSalepackage storage(SalepackageProduct storage) {
    this.storage = storage;
    return this;
  }

   /**
   * 
   * @return storage
  **/
  @ApiModelProperty(value = "")
  public SalepackageProduct getStorage() {
    return storage;
  }

  public void setStorage(SalepackageProduct storage) {
    this.storage = storage;
  }

  public UpgradeSalepackage multi(SalepackageProduct multi) {
    this.multi = multi;
    return this;
  }

   /**
   * 
   * @return multi
  **/
  @ApiModelProperty(value = "")
  public SalepackageProduct getMulti() {
    return multi;
  }

  public void setMulti(SalepackageProduct multi) {
    this.multi = multi;
  }

  public UpgradeSalepackage backup(SalepackageProduct backup) {
    this.backup = backup;
    return this;
  }

   /**
   * 
   * @return backup
  **/
  @ApiModelProperty(value = "")
  public SalepackageProduct getBackup() {
    return backup;
  }

  public void setBackup(SalepackageProduct backup) {
    this.backup = backup;
  }

  public UpgradeSalepackage sync(SalepackageProduct sync) {
    this.sync = sync;
    return this;
  }

   /**
   * 
   * @return sync
  **/
  @ApiModelProperty(value = "")
  public SalepackageProduct getSync() {
    return sync;
  }

  public void setSync(SalepackageProduct sync) {
    this.sync = sync;
  }

  public UpgradeSalepackage bankID(SalepackageProduct bankID) {
    this.bankID = bankID;
    return this;
  }

   /**
   * 
   * @return bankID
  **/
  @ApiModelProperty(value = "")
  public SalepackageProduct getBankID() {
    return bankID;
  }

  public void setBankID(SalepackageProduct bankID) {
    this.bankID = bankID;
  }

  public UpgradeSalepackage currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * 
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public UpgradeSalepackage isInclVAT(Boolean isInclVAT) {
    this.isInclVAT = isInclVAT;
    return this;
  }

   /**
   * 
   * @return isInclVAT
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsInclVAT() {
    return isInclVAT;
  }

  public void setIsInclVAT(Boolean isInclVAT) {
    this.isInclVAT = isInclVAT;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpgradeSalepackage upgradeSalepackage = (UpgradeSalepackage) o;
    return Objects.equals(this.description, upgradeSalepackage.description) &&
        Objects.equals(this.saleText, upgradeSalepackage.saleText) &&
        Objects.equals(this.startFee, upgradeSalepackage.startFee) &&
        Objects.equals(this.campaignPrice, upgradeSalepackage.campaignPrice) &&
        Objects.equals(this.id, upgradeSalepackage.id) &&
        Objects.equals(this.name, upgradeSalepackage.name) &&
        Objects.equals(this.monthlyFee, upgradeSalepackage.monthlyFee) &&
        Objects.equals(this.storage, upgradeSalepackage.storage) &&
        Objects.equals(this.multi, upgradeSalepackage.multi) &&
        Objects.equals(this.backup, upgradeSalepackage.backup) &&
        Objects.equals(this.sync, upgradeSalepackage.sync) &&
        Objects.equals(this.bankID, upgradeSalepackage.bankID) &&
        Objects.equals(this.currency, upgradeSalepackage.currency) &&
        Objects.equals(this.isInclVAT, upgradeSalepackage.isInclVAT);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, saleText, startFee, campaignPrice, id, name, monthlyFee, storage, multi, backup, sync, bankID, currency, isInclVAT);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpgradeSalepackage {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    saleText: ").append(toIndentedString(saleText)).append("\n");
    sb.append("    startFee: ").append(toIndentedString(startFee)).append("\n");
    sb.append("    campaignPrice: ").append(toIndentedString(campaignPrice)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    monthlyFee: ").append(toIndentedString(monthlyFee)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    multi: ").append(toIndentedString(multi)).append("\n");
    sb.append("    backup: ").append(toIndentedString(backup)).append("\n");
    sb.append("    sync: ").append(toIndentedString(sync)).append("\n");
    sb.append("    bankID: ").append(toIndentedString(bankID)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    isInclVAT: ").append(toIndentedString(isInclVAT)).append("\n");
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
