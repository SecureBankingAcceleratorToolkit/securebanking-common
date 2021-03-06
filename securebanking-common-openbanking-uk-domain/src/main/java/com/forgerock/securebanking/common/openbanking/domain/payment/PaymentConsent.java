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

import com.forgerock.securebanking.common.openbanking.domain.payment.data.FRPaymentRisk;
import org.joda.time.DateTime;

/**
 * Representation of a payment consent.
 */
public interface PaymentConsent {

    void setPisp(String pispId, String pispName);

    String getPispName();

    String getId();

    ConsentStatusCode getStatus();

    void setStatus(ConsentStatusCode status);

    Object getInitiation();

    FRPaymentRisk getRisk();

    String getAccountId();

    void setAccountId(String accountId);

    String getUserId();

    void setUserId(String userId);

    String getPispId();

    DateTime getCreated();

    default DateTime getStatusUpdate() {
        return null; // Implemented in V3.0 onwards
    }

    default boolean isNew() {
        return getCreated() == null;
    }
}
