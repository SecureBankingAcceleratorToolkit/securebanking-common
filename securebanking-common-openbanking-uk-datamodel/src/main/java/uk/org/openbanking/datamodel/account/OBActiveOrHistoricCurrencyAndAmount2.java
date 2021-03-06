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
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Objects;

/**
 * The amount of the final Standing Order
 */
@ApiModel(description = "The amount of the final Standing Order")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-13T15:59:01.633+01:00")
public class OBActiveOrHistoricCurrencyAndAmount2 {
    @JsonProperty("Amount")
    private String amount = null;

    @JsonProperty("Currency")
    private String currency = null;

    public OBActiveOrHistoricCurrencyAndAmount2 amount(String amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
     * @return amount
     **/
    @NotNull
    @Pattern(regexp = "^\\d{1,13}\\.\\d{1,5}$")
    @ApiModelProperty(required = true, value = "")
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public OBActiveOrHistoricCurrencyAndAmount2 currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Get currency
     *
     * @return currency
     **/
    @NotNull
    @Pattern(regexp = "^[A-Z]{3,3}$")
    @ApiModelProperty(required = true, value = "")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBActiveOrHistoricCurrencyAndAmount2 obActiveOrHistoricCurrencyAndAmount2 = (OBActiveOrHistoricCurrencyAndAmount2) o;
        return Objects.equals(this.amount, obActiveOrHistoricCurrencyAndAmount2.amount) &&
                Objects.equals(this.currency, obActiveOrHistoricCurrencyAndAmount2.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBActiveOrHistoricCurrencyAndAmount2 {\n");

        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

