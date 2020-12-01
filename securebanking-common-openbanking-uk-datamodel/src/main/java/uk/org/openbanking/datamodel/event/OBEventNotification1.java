/**
 * Copyright © 2020 ForgeRock AS (obst@forgerock.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
 * Event Notification API Specification - TPP Endpoints
 * Swagger for Event Notification API Specification - TPP Endpoints
 *
 * OpenAPI spec version: v3.0.0
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.event;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * The resource-update event.
 */
@ApiModel(description = "The resource-update event.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-03T11:34:40.772Z")
public class OBEventNotification1 {
  @JsonProperty("iss")
  private String iss = null;

  @JsonProperty("iat")
  private String iat = null;

  @JsonProperty("jti")
  private String jti = null;

  @JsonProperty("aud")
  private String aud = null;

  @JsonProperty("sub")
  private String sub = null;

  @JsonProperty("txn")
  private String txn = null;

  @JsonProperty("toe")
  private String toe = null;

  @JsonProperty("events")
  private OBEvent1 events = null;

  public OBEventNotification1 iss(String iss) {
    this.iss = iss;
    return this;
  }

   /**
   * Issuer.
   * @return iss
  **/
  @ApiModelProperty(required = true, value = "Issuer.")
  public String getIss() {
    return iss;
  }

  public void setIss(String iss) {
    this.iss = iss;
  }

  public OBEventNotification1 iat(String iat) {
    this.iat = iat;
    return this;
  }

   /**
   * Issued At. 
   * @return iat
  **/
  @ApiModelProperty(required = true, value = "Issued At. ")
  public String getIat() {
    return iat;
  }

  public void setIat(String iat) {
    this.iat = iat;
  }

  public OBEventNotification1 jti(String jti) {
    this.jti = jti;
    return this;
  }

   /**
   * JWT ID.
   * @return jti
  **/
  @ApiModelProperty(required = true, value = "JWT ID.")
  public String getJti() {
    return jti;
  }

  public void setJti(String jti) {
    this.jti = jti;
  }

  public OBEventNotification1 aud(String aud) {
    this.aud = aud;
    return this;
  }

   /**
   * Audience.
   * @return aud
  **/
  @ApiModelProperty(required = true, value = "Audience.")
  public String getAud() {
    return aud;
  }

  public void setAud(String aud) {
    this.aud = aud;
  }

  public OBEventNotification1 sub(String sub) {
    this.sub = sub;
    return this;
  }

   /**
   * Subject
   * @return sub
  **/
  @ApiModelProperty(required = true, value = "Subject")
  public String getSub() {
    return sub;
  }

  public void setSub(String sub) {
    this.sub = sub;
  }

  public OBEventNotification1 txn(String txn) {
    this.txn = txn;
    return this;
  }

   /**
   * Transaction Identifier.
   * @return txn
  **/
  @ApiModelProperty(required = true, value = "Transaction Identifier.")
  public String getTxn() {
    return txn;
  }

  public void setTxn(String txn) {
    this.txn = txn;
  }

  public OBEventNotification1 toe(String toe) {
    this.toe = toe;
    return this;
  }

   /**
   * Time of Event.
   * @return toe
  **/
  @ApiModelProperty(required = true, value = "Time of Event.")
  public String getToe() {
    return toe;
  }

  public void setToe(String toe) {
    this.toe = toe;
  }

  public OBEventNotification1 events(OBEvent1 events) {
    this.events = events;
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @ApiModelProperty(required = true, value = "")
  public OBEvent1 getEvents() {
    return events;
  }

  public void setEvents(OBEvent1 events) {
    this.events = events;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBEventNotification1 obEventNotification1 = (OBEventNotification1) o;
    return Objects.equals(this.iss, obEventNotification1.iss) &&
        Objects.equals(this.iat, obEventNotification1.iat) &&
        Objects.equals(this.jti, obEventNotification1.jti) &&
        Objects.equals(this.aud, obEventNotification1.aud) &&
        Objects.equals(this.sub, obEventNotification1.sub) &&
        Objects.equals(this.txn, obEventNotification1.txn) &&
        Objects.equals(this.toe, obEventNotification1.toe) &&
        Objects.equals(this.events, obEventNotification1.events);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iss, iat, jti, aud, sub, txn, toe, events);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBEventNotification1 {\n");

    sb.append("    iss: ").append(toIndentedString(iss)).append("\n");
    sb.append("    iat: ").append(toIndentedString(iat)).append("\n");
    sb.append("    jti: ").append(toIndentedString(jti)).append("\n");
    sb.append("    aud: ").append(toIndentedString(aud)).append("\n");
    sb.append("    sub: ").append(toIndentedString(sub)).append("\n");
    sb.append("    txn: ").append(toIndentedString(txn)).append("\n");
    sb.append("    toe: ").append(toIndentedString(toe)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

