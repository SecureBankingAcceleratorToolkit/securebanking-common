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
 * Account and Transaction API Specification
 * Swagger for Account and Transaction API Specification
 *
 * OpenAPI spec version: v3.1.4
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * OBStandingOrder6Basic
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-19T14:30:07.421+01:00")
public class OBStandingOrder6Basic {
    @JsonProperty("AccountId")
    private String accountId = null;

    @JsonProperty("StandingOrderId")
    private String standingOrderId = null;

    @JsonProperty("Frequency")
    private String frequency = null;

    @JsonProperty("Reference")
    private String reference = null;

    @JsonProperty("FirstPaymentDateTime")
    private DateTime firstPaymentDateTime = null;

    @JsonProperty("NextPaymentDateTime")
    private DateTime nextPaymentDateTime = null;

    @JsonProperty("LastPaymentDateTime")
    private DateTime lastPaymentDateTime = null;

    @JsonProperty("FinalPaymentDateTime")
    private DateTime finalPaymentDateTime = null;

    @JsonProperty("NumberOfPayments")
    private String numberOfPayments = null;

    @JsonProperty("StandingOrderStatusCode")
    private OBExternalStandingOrderStatus1Code standingOrderStatusCode = null;

    @JsonProperty("FirstPaymentAmount")
    private OBActiveOrHistoricCurrencyAndAmount2 firstPaymentAmount = null;

    @JsonProperty("NextPaymentAmount")
    private OBActiveOrHistoricCurrencyAndAmount3 nextPaymentAmount = null;

    @JsonProperty("LastPaymentAmount")
    private OBActiveOrHistoricCurrencyAndAmount11 lastPaymentAmount = null;

    @JsonProperty("FinalPaymentAmount")
    private OBActiveOrHistoricCurrencyAndAmount4 finalPaymentAmount = null;

    @JsonProperty("SupplementaryData")
    private OBSupplementaryData1 supplementaryData = null;

    public OBStandingOrder6Basic accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * Get accountId
     *
     * @return accountId
     **/
    @NotNull
    @Size(min = 1, max = 40)
    @ApiModelProperty(required = true, value = "")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public OBStandingOrder6Basic standingOrderId(String standingOrderId) {
        this.standingOrderId = standingOrderId;
        return this;
    }

    /**
     * Get standingOrderId
     *
     * @return standingOrderId
     **/
    @Size(min = 1, max = 40)
    @ApiModelProperty(value = "")
    public String getStandingOrderId() {
        return standingOrderId;
    }

    public void setStandingOrderId(String standingOrderId) {
        this.standingOrderId = standingOrderId;
    }

    public OBStandingOrder6Basic frequency(String frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * Get frequency
     *
     * @return frequency
     **/
    @NotNull
    @Pattern(regexp = "^(NotKnown)$|^(EvryDay)$|^(EvryWorkgDay)$|^(IntrvlDay:((0[2-9])|([1-2][0-9])|3[0-1]))$|^(IntrvlWkDay:0[1-9]:0[1-7])$|^(WkInMnthDay:0[1-5]:0[1-7])$|^(IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]))$|^(QtrDay:(ENGLISH|SCOTTISH|RECEIVED))$")
    @ApiModelProperty(required = true, value = "")
    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public OBStandingOrder6Basic reference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * Get reference
     *
     * @return reference
     **/
    @Size(min = 1, max = 35)
    @ApiModelProperty(value = "")
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public OBStandingOrder6Basic firstPaymentDateTime(DateTime firstPaymentDateTime) {
        this.firstPaymentDateTime = firstPaymentDateTime;
        return this;
    }

    /**
     * Get firstPaymentDateTime
     *
     * @return firstPaymentDateTime
     **/
    @ApiModelProperty(value = "")
    public DateTime getFirstPaymentDateTime() {
        return firstPaymentDateTime;
    }

    public void setFirstPaymentDateTime(DateTime firstPaymentDateTime) {
        this.firstPaymentDateTime = firstPaymentDateTime;
    }

    public OBStandingOrder6Basic nextPaymentDateTime(DateTime nextPaymentDateTime) {
        this.nextPaymentDateTime = nextPaymentDateTime;
        return this;
    }

    /**
     * Get nextPaymentDateTime
     *
     * @return nextPaymentDateTime
     **/
    @ApiModelProperty(value = "")
    public DateTime getNextPaymentDateTime() {
        return nextPaymentDateTime;
    }

    public void setNextPaymentDateTime(DateTime nextPaymentDateTime) {
        this.nextPaymentDateTime = nextPaymentDateTime;
    }

    public OBStandingOrder6Basic lastPaymentDateTime(DateTime lastPaymentDateTime) {
        this.lastPaymentDateTime = lastPaymentDateTime;
        return this;
    }

    /**
     * Get lastPaymentDateTime
     *
     * @return lastPaymentDateTime
     **/
    @ApiModelProperty(value = "")
    public DateTime getLastPaymentDateTime() {
        return lastPaymentDateTime;
    }

    public void setLastPaymentDateTime(DateTime lastPaymentDateTime) {
        this.lastPaymentDateTime = lastPaymentDateTime;
    }

    public OBStandingOrder6Basic finalPaymentDateTime(DateTime finalPaymentDateTime) {
        this.finalPaymentDateTime = finalPaymentDateTime;
        return this;
    }

    /**
     * Get finalPaymentDateTime
     *
     * @return finalPaymentDateTime
     **/
    @ApiModelProperty(value = "")
    public DateTime getFinalPaymentDateTime() {
        return finalPaymentDateTime;
    }

    public void setFinalPaymentDateTime(DateTime finalPaymentDateTime) {
        this.finalPaymentDateTime = finalPaymentDateTime;
    }

    public OBStandingOrder6Basic numberOfPayments(String numberOfPayments) {
        this.numberOfPayments = numberOfPayments;
        return this;
    }

    /**
     * Get numberOfPayments
     *
     * @return numberOfPayments
     **/
    @Size(min = 1, max = 35)
    @ApiModelProperty(value = "")
    public String getNumberOfPayments() {
        return numberOfPayments;
    }

    public void setNumberOfPayments(String numberOfPayments) {
        this.numberOfPayments = numberOfPayments;
    }

    public OBStandingOrder6Basic standingOrderStatusCode(OBExternalStandingOrderStatus1Code standingOrderStatusCode) {
        this.standingOrderStatusCode = standingOrderStatusCode;
        return this;
    }

    /**
     * Get standingOrderStatusCode
     *
     * @return standingOrderStatusCode
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBExternalStandingOrderStatus1Code getStandingOrderStatusCode() {
        return standingOrderStatusCode;
    }

    public void setStandingOrderStatusCode(OBExternalStandingOrderStatus1Code standingOrderStatusCode) {
        this.standingOrderStatusCode = standingOrderStatusCode;
    }

    public OBStandingOrder6Basic firstPaymentAmount(OBActiveOrHistoricCurrencyAndAmount2 firstPaymentAmount) {
        this.firstPaymentAmount = firstPaymentAmount;
        return this;
    }

    /**
     * Get firstPaymentAmount
     *
     * @return firstPaymentAmount
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBActiveOrHistoricCurrencyAndAmount2 getFirstPaymentAmount() {
        return firstPaymentAmount;
    }

    public void setFirstPaymentAmount(OBActiveOrHistoricCurrencyAndAmount2 firstPaymentAmount) {
        this.firstPaymentAmount = firstPaymentAmount;
    }

    public OBStandingOrder6Basic nextPaymentAmount(OBActiveOrHistoricCurrencyAndAmount3 nextPaymentAmount) {
        this.nextPaymentAmount = nextPaymentAmount;
        return this;
    }

    /**
     * Get nextPaymentAmount
     *
     * @return nextPaymentAmount
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBActiveOrHistoricCurrencyAndAmount3 getNextPaymentAmount() {
        return nextPaymentAmount;
    }

    public void setNextPaymentAmount(OBActiveOrHistoricCurrencyAndAmount3 nextPaymentAmount) {
        this.nextPaymentAmount = nextPaymentAmount;
    }

    public OBStandingOrder6Basic lastPaymentAmount(OBActiveOrHistoricCurrencyAndAmount11 lastPaymentAmount) {
        this.lastPaymentAmount = lastPaymentAmount;
        return this;
    }

    /**
     * Get lastPaymentAmount
     *
     * @return lastPaymentAmount
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBActiveOrHistoricCurrencyAndAmount11 getLastPaymentAmount() {
        return lastPaymentAmount;
    }

    public void setLastPaymentAmount(OBActiveOrHistoricCurrencyAndAmount11 lastPaymentAmount) {
        this.lastPaymentAmount = lastPaymentAmount;
    }

    public OBStandingOrder6Basic finalPaymentAmount(OBActiveOrHistoricCurrencyAndAmount4 finalPaymentAmount) {
        this.finalPaymentAmount = finalPaymentAmount;
        return this;
    }

    /**
     * Get finalPaymentAmount
     *
     * @return finalPaymentAmount
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBActiveOrHistoricCurrencyAndAmount4 getFinalPaymentAmount() {
        return finalPaymentAmount;
    }

    public void setFinalPaymentAmount(OBActiveOrHistoricCurrencyAndAmount4 finalPaymentAmount) {
        this.finalPaymentAmount = finalPaymentAmount;
    }

    public OBStandingOrder6Basic supplementaryData(OBSupplementaryData1 supplementaryData) {
        this.supplementaryData = supplementaryData;
        return this;
    }

    /**
     * Get supplementaryData
     *
     * @return supplementaryData
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBSupplementaryData1 getSupplementaryData() {
        return supplementaryData;
    }

    public void setSupplementaryData(OBSupplementaryData1 supplementaryData) {
        this.supplementaryData = supplementaryData;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBStandingOrder6Basic obStandingOrder6Basic = (OBStandingOrder6Basic) o;
        return Objects.equals(this.accountId, obStandingOrder6Basic.accountId) &&
                Objects.equals(this.standingOrderId, obStandingOrder6Basic.standingOrderId) &&
                Objects.equals(this.frequency, obStandingOrder6Basic.frequency) &&
                Objects.equals(this.reference, obStandingOrder6Basic.reference) &&
                Objects.equals(this.firstPaymentDateTime, obStandingOrder6Basic.firstPaymentDateTime) &&
                Objects.equals(this.nextPaymentDateTime, obStandingOrder6Basic.nextPaymentDateTime) &&
                Objects.equals(this.lastPaymentDateTime, obStandingOrder6Basic.lastPaymentDateTime) &&
                Objects.equals(this.finalPaymentDateTime, obStandingOrder6Basic.finalPaymentDateTime) &&
                Objects.equals(this.numberOfPayments, obStandingOrder6Basic.numberOfPayments) &&
                Objects.equals(this.standingOrderStatusCode, obStandingOrder6Basic.standingOrderStatusCode) &&
                Objects.equals(this.firstPaymentAmount, obStandingOrder6Basic.firstPaymentAmount) &&
                Objects.equals(this.nextPaymentAmount, obStandingOrder6Basic.nextPaymentAmount) &&
                Objects.equals(this.lastPaymentAmount, obStandingOrder6Basic.lastPaymentAmount) &&
                Objects.equals(this.finalPaymentAmount, obStandingOrder6Basic.finalPaymentAmount) &&
                Objects.equals(this.supplementaryData, obStandingOrder6Basic.supplementaryData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, standingOrderId, frequency, reference, firstPaymentDateTime, nextPaymentDateTime, lastPaymentDateTime, finalPaymentDateTime, numberOfPayments, standingOrderStatusCode, firstPaymentAmount, nextPaymentAmount, lastPaymentAmount, finalPaymentAmount, supplementaryData);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBStandingOrder6Basic {\n");

        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    standingOrderId: ").append(toIndentedString(standingOrderId)).append("\n");
        sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
        sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
        sb.append("    firstPaymentDateTime: ").append(toIndentedString(firstPaymentDateTime)).append("\n");
        sb.append("    nextPaymentDateTime: ").append(toIndentedString(nextPaymentDateTime)).append("\n");
        sb.append("    lastPaymentDateTime: ").append(toIndentedString(lastPaymentDateTime)).append("\n");
        sb.append("    finalPaymentDateTime: ").append(toIndentedString(finalPaymentDateTime)).append("\n");
        sb.append("    numberOfPayments: ").append(toIndentedString(numberOfPayments)).append("\n");
        sb.append("    standingOrderStatusCode: ").append(toIndentedString(standingOrderStatusCode)).append("\n");
        sb.append("    firstPaymentAmount: ").append(toIndentedString(firstPaymentAmount)).append("\n");
        sb.append("    nextPaymentAmount: ").append(toIndentedString(nextPaymentAmount)).append("\n");
        sb.append("    lastPaymentAmount: ").append(toIndentedString(lastPaymentAmount)).append("\n");
        sb.append("    finalPaymentAmount: ").append(toIndentedString(finalPaymentAmount)).append("\n");
        sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
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

