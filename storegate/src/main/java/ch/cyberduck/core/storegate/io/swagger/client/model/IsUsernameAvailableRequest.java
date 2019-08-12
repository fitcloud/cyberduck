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
public class IsUsernameAvailableRequest {
  @JsonProperty("partnerId")
  private String partnerId = null;

  @JsonProperty("retailerId")
  private String retailerId = null;

  @JsonProperty("username")
  private String username = null;

  public IsUsernameAvailableRequest partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

   /**
   * The partnerId
   * @return partnerId
  **/
  @ApiModelProperty(value = "The partnerId")
  public String getPartnerId() {
    return partnerId;
  }

  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

  public IsUsernameAvailableRequest retailerId(String retailerId) {
    this.retailerId = retailerId;
    return this;
  }

   /**
   * The retailerId
   * @return retailerId
  **/
  @ApiModelProperty(value = "The retailerId")
  public String getRetailerId() {
    return retailerId;
  }

  public void setRetailerId(String retailerId) {
    this.retailerId = retailerId;
  }

  public IsUsernameAvailableRequest username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The username to check
   * @return username
  **/
  @ApiModelProperty(value = "The username to check")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IsUsernameAvailableRequest isUsernameAvailableRequest = (IsUsernameAvailableRequest) o;
    return Objects.equals(this.partnerId, isUsernameAvailableRequest.partnerId) &&
        Objects.equals(this.retailerId, isUsernameAvailableRequest.retailerId) &&
        Objects.equals(this.username, isUsernameAvailableRequest.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partnerId, retailerId, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IsUsernameAvailableRequest {\n");
    
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    retailerId: ").append(toIndentedString(retailerId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
