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

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Provides the details to identify an account.
 */
@ApiModel(description = "Provides the details to identify an account.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-19T14:14:13.501+01:00")
public class OBWriteDomesticResponse4DataRefundAccount {
    @JsonProperty("SchemeName")
    private String schemeName = null;

    @JsonProperty("Identification")
    private String identification = null;

    @JsonProperty("Name")
    private String name = null;

    @JsonProperty("SecondaryIdentification")
    private String secondaryIdentification = null;

    public OBWriteDomesticResponse4DataRefundAccount schemeName(String schemeName) {
        this.schemeName = schemeName;
        return this;
    }

    /**
     * Get schemeName
     *
     * @return schemeName
     **/
    @NotNull
    @ApiModelProperty(required = true, value = "")
    public String getSchemeName() {
        return schemeName;
    }

    public void setSchemeName(String schemeName) {
        this.schemeName = schemeName;
    }

    public OBWriteDomesticResponse4DataRefundAccount identification(String identification) {
        this.identification = identification;
        return this;
    }

    /**
     * Get identification
     *
     * @return identification
     **/
    @NotNull
    @Size(min = 1, max = 256)
    @ApiModelProperty(required = true, value = "")
    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public OBWriteDomesticResponse4DataRefundAccount name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the account, as assigned by the account servicing institution. Usage: The account name is the name or names of the account owner(s) represented at an account level. The account name is not the product name or the nickname of the account. OB: ASPSPs may carry out name validation for Confirmation of Payee, but it is not mandatory.
     *
     * @return name
     **/
    @NotNull
    @Size(min = 1, max = 70)
    @ApiModelProperty(required = true, value = "Name of the account, as assigned by the account servicing institution. Usage: The account name is the name or names of the account owner(s) represented at an account level. The account name is not the product name or the nickname of the account. OB: ASPSPs may carry out name validation for Confirmation of Payee, but it is not mandatory.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OBWriteDomesticResponse4DataRefundAccount secondaryIdentification(String secondaryIdentification) {
        this.secondaryIdentification = secondaryIdentification;
        return this;
    }

    /**
     * Get secondaryIdentification
     *
     * @return secondaryIdentification
     **/
    @Size(min = 1, max = 34)
    @ApiModelProperty(value = "")
    public String getSecondaryIdentification() {
        return secondaryIdentification;
    }

    public void setSecondaryIdentification(String secondaryIdentification) {
        this.secondaryIdentification = secondaryIdentification;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBWriteDomesticResponse4DataRefundAccount obWriteDomesticResponse4DataRefundAccount = (OBWriteDomesticResponse4DataRefundAccount) o;
        return Objects.equals(this.schemeName, obWriteDomesticResponse4DataRefundAccount.schemeName) &&
                Objects.equals(this.identification, obWriteDomesticResponse4DataRefundAccount.identification) &&
                Objects.equals(this.name, obWriteDomesticResponse4DataRefundAccount.name) &&
                Objects.equals(this.secondaryIdentification, obWriteDomesticResponse4DataRefundAccount.secondaryIdentification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemeName, identification, name, secondaryIdentification);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBWriteDomesticResponse4DataRefundAccount {\n");

        sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
        sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    secondaryIdentification: ").append(toIndentedString(secondaryIdentification)).append("\n");
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

