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
 * Payment Initiation API
 * Swagger for Payment Initiation API Specification
 *
 * OpenAPI spec version: v3.1.4
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.payment;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * OBWriteInternationalStandingOrderConsent6Data
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-19T14:14:13.501+01:00")
public class OBWriteInternationalStandingOrderConsent6Data {
    /**
     * Specifies the Open Banking service request types.
     */
    public enum PermissionEnum {
        CREATE("Create");

        private String value;

        PermissionEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PermissionEnum fromValue(String text) {
            for (PermissionEnum b : PermissionEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("Permission")
    private PermissionEnum permission = null;

    /**
     * Specifies to share the refund account details with PISP
     */
    public enum ReadRefundAccountEnum {
        NO("No"),

        YES("Yes");

        private String value;

        ReadRefundAccountEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ReadRefundAccountEnum fromValue(String text) {
            for (ReadRefundAccountEnum b : ReadRefundAccountEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("ReadRefundAccount")
    private ReadRefundAccountEnum readRefundAccount = null;

    @JsonProperty("Initiation")
    private OBWriteInternationalStandingOrder4DataInitiation initiation = null;

    @JsonProperty("Authorisation")
    private OBWriteDomesticConsent4DataAuthorisation authorisation = null;

    @JsonProperty("SCASupportData")
    private OBWriteDomesticConsent4DataSCASupportData scASupportData = null;

    public OBWriteInternationalStandingOrderConsent6Data permission(PermissionEnum permission) {
        this.permission = permission;
        return this;
    }

    /**
     * Specifies the Open Banking service request types.
     *
     * @return permission
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "Specifies the Open Banking service request types.")
    public PermissionEnum getPermission() {
        return permission;
    }

    public void setPermission(PermissionEnum permission) {
        this.permission = permission;
    }

    public OBWriteInternationalStandingOrderConsent6Data readRefundAccount(ReadRefundAccountEnum readRefundAccount) {
        this.readRefundAccount = readRefundAccount;
        return this;
    }

    /**
     * Specifies to share the refund account details with PISP
     *
     * @return readRefundAccount
     **/
    @ApiModelProperty(value = "Specifies to share the refund account details with PISP")
    public ReadRefundAccountEnum getReadRefundAccount() {
        return readRefundAccount;
    }

    public void setReadRefundAccount(ReadRefundAccountEnum readRefundAccount) {
        this.readRefundAccount = readRefundAccount;
    }

    public OBWriteInternationalStandingOrderConsent6Data initiation(OBWriteInternationalStandingOrder4DataInitiation initiation) {
        this.initiation = initiation;
        return this;
    }

    /**
     * Get initiation
     *
     * @return initiation
     **/
    @NotNull
    @Valid
    @ApiModelProperty(required = true, value = "")
    public OBWriteInternationalStandingOrder4DataInitiation getInitiation() {
        return initiation;
    }

    public void setInitiation(OBWriteInternationalStandingOrder4DataInitiation initiation) {
        this.initiation = initiation;
    }

    public OBWriteInternationalStandingOrderConsent6Data authorisation(OBWriteDomesticConsent4DataAuthorisation authorisation) {
        this.authorisation = authorisation;
        return this;
    }

    /**
     * Get authorisation
     *
     * @return authorisation
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBWriteDomesticConsent4DataAuthorisation getAuthorisation() {
        return authorisation;
    }

    public void setAuthorisation(OBWriteDomesticConsent4DataAuthorisation authorisation) {
        this.authorisation = authorisation;
    }

    public OBWriteInternationalStandingOrderConsent6Data scASupportData(OBWriteDomesticConsent4DataSCASupportData scASupportData) {
        this.scASupportData = scASupportData;
        return this;
    }

    /**
     * Get scASupportData
     *
     * @return scASupportData
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBWriteDomesticConsent4DataSCASupportData getScASupportData() {
        return scASupportData;
    }

    public void setScASupportData(OBWriteDomesticConsent4DataSCASupportData scASupportData) {
        this.scASupportData = scASupportData;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteInternationalStandingOrderConsent6Data obWriteInternationalStandingOrderConsent6Data = (OBWriteInternationalStandingOrderConsent6Data) o;
        return Objects.equals(this.permission, obWriteInternationalStandingOrderConsent6Data.permission) &&
                Objects.equals(this.readRefundAccount, obWriteInternationalStandingOrderConsent6Data.readRefundAccount) &&
                Objects.equals(this.initiation, obWriteInternationalStandingOrderConsent6Data.initiation) &&
                Objects.equals(this.authorisation, obWriteInternationalStandingOrderConsent6Data.authorisation) &&
                Objects.equals(this.scASupportData, obWriteInternationalStandingOrderConsent6Data.scASupportData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permission, readRefundAccount, initiation, authorisation, scASupportData);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteInternationalStandingOrderConsent6Data {\n");

        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    readRefundAccount: ").append(toIndentedString(readRefundAccount)).append("\n");
        sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
        sb.append("    authorisation: ").append(toIndentedString(authorisation)).append("\n");
        sb.append("    scASupportData: ").append(toIndentedString(scASupportData)).append("\n");
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

