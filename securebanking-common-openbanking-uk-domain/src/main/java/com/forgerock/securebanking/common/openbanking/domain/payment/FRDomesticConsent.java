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
package com.forgerock.securebanking.common.openbanking.domain.payment;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.forgerock.securebanking.common.openbanking.domain.payment.data.FRPaymentRisk;
import com.forgerock.securebanking.common.openbanking.domain.payment.data.FRWriteDomesticConsent;
import com.forgerock.securebanking.common.openbanking.domain.payment.data.FRWriteDomesticDataInitiation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.DateTime;

import java.util.Date;

/**
 * Represents a Domestic Payment Consent, which will be provided by the IDM.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FRDomesticConsent implements PaymentConsent {

    private String id;
    private ConsentStatusCode status;
    private FRWriteDomesticConsent domesticConsent;
    public String accountId;
    public String userId;
    public String pispId;
    public String pispName;
    public String idempotencyKey;
    public DateTime created;
    public DateTime statusUpdate;
    public Date updated;

    @Override
    public void setPisp(String pispId, String pispName) {
        this.pispId = pispId;
        this.pispName = pispName;
    }

    @Override
    @JsonIgnore
    public FRWriteDomesticDataInitiation getInitiation() {
        return domesticConsent.getData().getInitiation();
    }

    @Override
    @JsonIgnore
    public FRPaymentRisk getRisk() {
        return domesticConsent.getRisk();
    }

    @Override
    @JsonIgnore
    public boolean isNew() {
        return created == null;
    }
}
