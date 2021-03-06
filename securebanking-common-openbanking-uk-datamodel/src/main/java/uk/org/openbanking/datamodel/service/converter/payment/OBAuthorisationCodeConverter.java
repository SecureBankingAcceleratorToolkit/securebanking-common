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
package uk.org.openbanking.datamodel.service.converter.payment;

import uk.org.openbanking.datamodel.payment.OBExternalAuthorisation1Code;
import uk.org.openbanking.datamodel.payment.OBWriteDomesticConsent3DataAuthorisation.AuthorisationTypeEnum;

public class OBAuthorisationCodeConverter {

    public static OBExternalAuthorisation1Code toOBExternalAuthorisation1Code(AuthorisationTypeEnum authorisationType) {
        return authorisationType == null ? null : OBExternalAuthorisation1Code.valueOf(authorisationType.name());
    }

    public static AuthorisationTypeEnum toAuthorisationTypeEnum(OBExternalAuthorisation1Code authorisation1Code) {
        return authorisation1Code == null ? null : AuthorisationTypeEnum.valueOf(authorisation1Code.name());
    }
}
