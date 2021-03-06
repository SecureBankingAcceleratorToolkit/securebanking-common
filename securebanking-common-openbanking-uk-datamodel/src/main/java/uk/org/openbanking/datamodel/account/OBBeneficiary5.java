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
 * OpenAPI spec version: v3.1.5
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * OBBeneficiary5
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-19T14:46:29.699+01:00")
public class OBBeneficiary5 {
    @JsonProperty("AccountId")
    private String accountId = null;

    @JsonProperty("BeneficiaryId")
    private String beneficiaryId = null;

    @JsonProperty("BeneficiaryType")
    private OBBeneficiaryType1Code beneficiaryType = null;

    @JsonProperty("Reference")
    private String reference = null;

    @JsonProperty("SupplementaryData")
    private OBSupplementaryData1 supplementaryData = null;

    @JsonProperty("CreditorAgent")
    private OBBranchAndFinancialInstitutionIdentification60 creditorAgent = null;

    @JsonProperty("CreditorAccount")
    private OBCashAccount50 creditorAccount = null;

    public OBBeneficiary5 accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * Get accountId
     *
     * @return accountId
     **/
    @Size(min = 1, max = 40)
    @ApiModelProperty(value = "")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public OBBeneficiary5 beneficiaryId(String beneficiaryId) {
        this.beneficiaryId = beneficiaryId;
        return this;
    }

    /**
     * Get beneficiaryId
     *
     * @return beneficiaryId
     **/
    @Size(min = 1, max = 40)
    @ApiModelProperty(value = "")
    public String getBeneficiaryId() {
        return beneficiaryId;
    }

    public void setBeneficiaryId(String beneficiaryId) {
        this.beneficiaryId = beneficiaryId;
    }

    public OBBeneficiary5 beneficiaryType(OBBeneficiaryType1Code beneficiaryType) {
        this.beneficiaryType = beneficiaryType;
        return this;
    }

    /**
     * Get beneficiaryType
     *
     * @return beneficiaryType
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBBeneficiaryType1Code getBeneficiaryType() {
        return beneficiaryType;
    }

    public void setBeneficiaryType(OBBeneficiaryType1Code beneficiaryType) {
        this.beneficiaryType = beneficiaryType;
    }

    public OBBeneficiary5 reference(String reference) {
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

    public OBBeneficiary5 supplementaryData(OBSupplementaryData1 supplementaryData) {
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

    public OBBeneficiary5 creditorAgent(OBBranchAndFinancialInstitutionIdentification60 creditorAgent) {
        this.creditorAgent = creditorAgent;
        return this;
    }

    /**
     * Get creditorAgent
     *
     * @return creditorAgent
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBBranchAndFinancialInstitutionIdentification60 getCreditorAgent() {
        return creditorAgent;
    }

    public void setCreditorAgent(OBBranchAndFinancialInstitutionIdentification60 creditorAgent) {
        this.creditorAgent = creditorAgent;
    }

    public OBBeneficiary5 creditorAccount(OBCashAccount50 creditorAccount) {
        this.creditorAccount = creditorAccount;
        return this;
    }

    /**
     * Get creditorAccount
     *
     * @return creditorAccount
     **/
    @Valid
    @ApiModelProperty(value = "")
    public OBCashAccount50 getCreditorAccount() {
        return creditorAccount;
    }

    public void setCreditorAccount(OBCashAccount50 creditorAccount) {
        this.creditorAccount = creditorAccount;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBBeneficiary5 obBeneficiary5 = (OBBeneficiary5) o;
        return Objects.equals(this.accountId, obBeneficiary5.accountId) &&
                Objects.equals(this.beneficiaryId, obBeneficiary5.beneficiaryId) &&
                Objects.equals(this.beneficiaryType, obBeneficiary5.beneficiaryType) &&
                Objects.equals(this.reference, obBeneficiary5.reference) &&
                Objects.equals(this.supplementaryData, obBeneficiary5.supplementaryData) &&
                Objects.equals(this.creditorAgent, obBeneficiary5.creditorAgent) &&
                Objects.equals(this.creditorAccount, obBeneficiary5.creditorAccount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, beneficiaryId, beneficiaryType, reference, supplementaryData, creditorAgent, creditorAccount);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBBeneficiary5 {\n");

        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    beneficiaryId: ").append(toIndentedString(beneficiaryId)).append("\n");
        sb.append("    beneficiaryType: ").append(toIndentedString(beneficiaryType)).append("\n");
        sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
        sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
        sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
        sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
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

