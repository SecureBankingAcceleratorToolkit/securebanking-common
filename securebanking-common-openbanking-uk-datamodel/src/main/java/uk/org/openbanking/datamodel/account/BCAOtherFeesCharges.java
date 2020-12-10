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
 * OpenAPI spec version: v3.1.2-RC1
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.account;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Contains details of fees and charges which are not associated with either Overdraft or features/benefits
 */
@ApiModel(description = "Contains details of fees and charges which are not associated with either Overdraft or features/benefits")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-13T15:59:01.633+01:00")
public class BCAOtherFeesCharges {
    @JsonProperty("TariffType")
    private TariffTypeEnum tariffType = null;
    @JsonProperty("TariffName")
    private String tariffName = null;
    @JsonProperty("OtherTariffType")
    private OtherTariffType otherTariffType = null;
    @JsonProperty("FeeChargeDetail")
    private List<BCAFeeChargeDetail> feeChargeDetail = new ArrayList<BCAFeeChargeDetail>();
    @JsonProperty("FeeChargeCap")
    private List<BCAFeeChargeCap> feeChargeCap = null;

    public BCAOtherFeesCharges tariffType(TariffTypeEnum tariffType) {
        this.tariffType = tariffType;
        return this;
    }

    /**
     * TariffType which defines the fee and charges.
     *
     * @return tariffType
     **/
    @ApiModelProperty(value = "TariffType which defines the fee and charges.")
    public TariffTypeEnum getTariffType() {
        return tariffType;
    }

    public void setTariffType(TariffTypeEnum tariffType) {
        this.tariffType = tariffType;
    }

    public BCAOtherFeesCharges tariffName(String tariffName) {
        this.tariffName = tariffName;
        return this;
    }

    /**
     * Name of the tariff
     *
     * @return tariffName
     **/
    @Size(min = 1, max = 350)
    @ApiModelProperty(value = "Name of the tariff")
    public String getTariffName() {
        return tariffName;
    }

    public void setTariffName(String tariffName) {
        this.tariffName = tariffName;
    }

    public BCAOtherFeesCharges otherTariffType(OtherTariffType otherTariffType) {
        this.otherTariffType = otherTariffType;
        return this;
    }

    /**
     * Get otherTariffType
     *
     * @return otherTariffType
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OtherTariffType getOtherTariffType() {
        return otherTariffType;
    }

    public void setOtherTariffType(OtherTariffType otherTariffType) {
        this.otherTariffType = otherTariffType;
    }

    public BCAOtherFeesCharges feeChargeDetail(List<BCAFeeChargeDetail> feeChargeDetail) {
        this.feeChargeDetail = feeChargeDetail;
        return this;
    }

    public BCAOtherFeesCharges addFeeChargeDetailItem(BCAFeeChargeDetail feeChargeDetailItem) {
        this.feeChargeDetail.add(feeChargeDetailItem);
        return this;
    }

    /**
     * Other fees/charges details
     *
     * @return feeChargeDetail
     **/
    @NotNull
    @Valid
    @Size(min = 1)
    @ApiModelProperty(required = true, value = "Other fees/charges details")
    public List<BCAFeeChargeDetail> getFeeChargeDetail() {
        return feeChargeDetail;
    }

    public void setFeeChargeDetail(List<BCAFeeChargeDetail> feeChargeDetail) {
        this.feeChargeDetail = feeChargeDetail;
    }

    public BCAOtherFeesCharges feeChargeCap(List<BCAFeeChargeCap> feeChargeCap) {
        this.feeChargeCap = feeChargeCap;
        return this;
    }

    public BCAOtherFeesCharges addFeeChargeCapItem(BCAFeeChargeCap feeChargeCapItem) {
        if (this.feeChargeCap == null) {
            this.feeChargeCap = new ArrayList<BCAFeeChargeCap>();
        }
        this.feeChargeCap.add(feeChargeCapItem);
        return this;
    }

    /**
     * Details about any caps (maximum charges) that apply to a particular or group of fee/charge
     *
     * @return feeChargeCap
     **/
    @Valid
    @ApiModelProperty(value = "Details about any caps (maximum charges) that apply to a particular or group of fee/charge")
    public List<BCAFeeChargeCap> getFeeChargeCap() {
        return feeChargeCap;
    }

    public void setFeeChargeCap(List<BCAFeeChargeCap> feeChargeCap) {
        this.feeChargeCap = feeChargeCap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BCAOtherFeesCharges bcAOtherFeesCharges = (BCAOtherFeesCharges) o;
        return Objects.equals(this.tariffType, bcAOtherFeesCharges.tariffType) &&
                Objects.equals(this.tariffName, bcAOtherFeesCharges.tariffName) &&
                Objects.equals(this.otherTariffType, bcAOtherFeesCharges.otherTariffType) &&
                Objects.equals(this.feeChargeDetail, bcAOtherFeesCharges.feeChargeDetail) &&
                Objects.equals(this.feeChargeCap, bcAOtherFeesCharges.feeChargeCap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tariffType, tariffName, otherTariffType, feeChargeDetail, feeChargeCap);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BCAOtherFeesCharges {\n");

        sb.append("    tariffType: ").append(toIndentedString(tariffType)).append("\n");
        sb.append("    tariffName: ").append(toIndentedString(tariffName)).append("\n");
        sb.append("    otherTariffType: ").append(toIndentedString(otherTariffType)).append("\n");
        sb.append("    feeChargeDetail: ").append(toIndentedString(feeChargeDetail)).append("\n");
        sb.append("    feeChargeCap: ").append(toIndentedString(feeChargeCap)).append("\n");
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

    /**
     * TariffType which defines the fee and charges.
     */
    public enum TariffTypeEnum {
        ELECTRONIC("Electronic"),

        MIXED("Mixed"),

        OTHER("Other");

        private String value;

        TariffTypeEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static TariffTypeEnum fromValue(String text) {
            for (TariffTypeEnum b : TariffTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

}

