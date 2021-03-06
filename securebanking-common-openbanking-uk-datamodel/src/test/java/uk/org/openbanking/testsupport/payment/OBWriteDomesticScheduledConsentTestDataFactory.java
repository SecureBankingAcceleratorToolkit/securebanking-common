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
package uk.org.openbanking.testsupport.payment;

import org.joda.time.DateTime;
import uk.org.openbanking.datamodel.payment.*;

import static uk.org.openbanking.testsupport.payment.OBAccountTestDataFactory.*;
import static uk.org.openbanking.testsupport.payment.OBAmountTestDataFactory.aValidOBActiveOrHistoricCurrencyAndAmount;
import static uk.org.openbanking.testsupport.payment.OBAmountTestDataFactory.aValidOBWriteDomestic2DataInitiationInstructedAmount;
import static uk.org.openbanking.testsupport.payment.OBConsentAuthorisationTestDataFactory.*;
import static uk.org.openbanking.testsupport.payment.OBPostalAddress6TestDataFactory.aValidOBPostalAddress6;
import static uk.org.openbanking.testsupport.payment.OBRemittanceInformationTestDataFactory.aValidOBRemittanceInformation1;
import static uk.org.openbanking.testsupport.payment.OBRemittanceInformationTestDataFactory.aValidOBWriteDomestic2DataInitiationRemittanceInformation;
import static uk.org.openbanking.testsupport.payment.OBRisk1TestDataFactory.aValidOBRisk1;
import static uk.org.openbanking.testsupport.payment.OBWriteDomesticScaSupportDataTestDataFactory.aValidOBWriteDomesticConsent3DataSCASupportData;
import static uk.org.openbanking.testsupport.payment.OBWriteDomesticScaSupportDataTestDataFactory.aValidOBWriteDomesticConsent4DataSCASupportData;

/**
 * Test data factory for the various "OBWriteDomesticScheduledConsent" classes.
 */
public class OBWriteDomesticScheduledConsentTestDataFactory {

    private static final String INSTRUCTION_IDENTIFICATION = "ANSM021";
    private static final String END_TO_END_IDENTIFICATION = "FRESCO.21302.GFX.02";
    private static final String LOCAL_INSTRUMENT = "UK.OBIE.CHAPS";

    public static OBWriteDomesticScheduledConsent2 aValidOBWriteDomesticScheduledConsent2() {
        return (new OBWriteDomesticScheduledConsent2())
                .data(aValidOBWriteDataDomesticScheduledConsent2())
                .risk(aValidOBRisk1());
    }

    public static OBWriteDomesticScheduledConsent3 aValidOBWriteDomesticScheduledConsent3() {
        return (new OBWriteDomesticScheduledConsent3())
                .data(aValidOBWriteDomesticScheduledConsent3Data())
                .risk(aValidOBRisk1());
    }

    public static OBWriteDomesticScheduledConsent4 aValidOBWriteDomesticScheduledConsent4() {
        return (new OBWriteDomesticScheduledConsent4())
                .data(aValidOBWriteDomesticScheduledConsent4Data())
                .risk(aValidOBRisk1());
    }

    public static OBWriteDataDomesticScheduledConsent2 aValidOBWriteDataDomesticScheduledConsent2() {
        return (new OBWriteDataDomesticScheduledConsent2())
                .permission(OBExternalPermissions2Code.CREATE)
                .initiation(aValidOBDomesticScheduled2())
                .authorisation(aValidOBAuthorisation1());
    }

    public static OBWriteDomesticScheduledConsent3Data aValidOBWriteDomesticScheduledConsent3Data() {
        return (new OBWriteDomesticScheduledConsent3Data())
                .permission(OBWriteDomesticScheduledConsent3Data.PermissionEnum.CREATE)
                .initiation(aValidOBWriteDomesticScheduled2DataInitiation())
                .authorisation(aValidOBWriteDomesticConsent3DataAuthorisation())
                .scASupportData(aValidOBWriteDomesticConsent3DataSCASupportData());
    }

    public static OBWriteDomesticScheduledConsent4Data aValidOBWriteDomesticScheduledConsent4Data() {
        return (new OBWriteDomesticScheduledConsent4Data())
                .permission(OBWriteDomesticScheduledConsent4Data.PermissionEnum.CREATE)
                .initiation(aValidOBWriteDomesticScheduled2DataInitiation())
                .authorisation(aValidOBWriteDomesticConsent4DataAuthorisation())
                .scASupportData(aValidOBWriteDomesticConsent4DataSCASupportData())
                .readRefundAccount(OBWriteDomesticScheduledConsent4Data.ReadRefundAccountEnum.NO);
    }

    public static OBDomesticScheduled2 aValidOBDomesticScheduled2() {
        return (new OBDomesticScheduled2())
                .instructionIdentification(INSTRUCTION_IDENTIFICATION)
                .endToEndIdentification(END_TO_END_IDENTIFICATION)
                .localInstrument(LOCAL_INSTRUMENT)
                .requestedExecutionDateTime(DateTime.now())
                .instructedAmount(aValidOBActiveOrHistoricCurrencyAndAmount())
                .debtorAccount(aValidOBCashAccount3())
                .creditorAccount(aValidOBCashAccount3())
                .creditorPostalAddress(aValidOBPostalAddress6())
                .remittanceInformation(aValidOBRemittanceInformation1())
                .supplementaryData(new OBSupplementaryData1());
    }

    public static OBWriteDomesticScheduled2DataInitiation aValidOBWriteDomesticScheduled2DataInitiation() {
        return (new OBWriteDomesticScheduled2DataInitiation())
                .instructionIdentification(INSTRUCTION_IDENTIFICATION)
                .endToEndIdentification(END_TO_END_IDENTIFICATION)
                .localInstrument(LOCAL_INSTRUMENT)
                .requestedExecutionDateTime(DateTime.now())
                .instructedAmount(aValidOBWriteDomestic2DataInitiationInstructedAmount())
                .debtorAccount(aValidOBWriteDomestic2DataInitiationDebtorAccount())
                .creditorAccount(aValidOBWriteDomestic2DataInitiationCreditorAccount())
                .creditorPostalAddress(aValidOBPostalAddress6())
                .remittanceInformation(aValidOBWriteDomestic2DataInitiationRemittanceInformation())
                .supplementaryData(new OBSupplementaryData1());
    }

}
