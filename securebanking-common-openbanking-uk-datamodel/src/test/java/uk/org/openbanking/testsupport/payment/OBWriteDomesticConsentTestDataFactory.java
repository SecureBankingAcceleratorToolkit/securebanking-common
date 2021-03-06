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

import uk.org.openbanking.datamodel.payment.*;

import java.util.UUID;

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
 * Test data factory for the various "OBWriteDomesticConsent" classes.
 */
public class OBWriteDomesticConsentTestDataFactory {

    private static final String INSTRUCTION_IDENTIFICATION = "ANSM021";
    private static final String END_TO_END_IDENTIFICATION = "FRESCO.21302.GFX.02";
    private static final String LOCAL_INSTRUMENT = "UK.OBIE.CHAPS";

    public static OBWriteDomestic2 aValidOBWriteDomestic2() {
        return (new OBWriteDomestic2())
                .data(aValidOBWriteDataDomestic2())
                .risk(aValidOBRisk1());
    }

    public static OBWriteDomesticConsent2 aValidOBWriteDomesticConsent2() {
        return (new OBWriteDomesticConsent2())
                .data(aValidOBWriteDataDomesticConsent2())
                .risk(aValidOBRisk1());
    }

    public static OBWriteDomesticConsent3 aValidOBWriteDomesticConsent3() {
        return (new OBWriteDomesticConsent3())
                .data(aValidOBWriteDomesticConsent3Data())
                .risk(aValidOBRisk1());
    }

    public static OBWriteDomesticConsent4 aValidOBWriteDomesticConsent4() {
        return (new OBWriteDomesticConsent4())
                .data(aValidOBWriteDomesticConsent4Data())
                .risk(aValidOBRisk1());
    }

    public static OBWriteDataDomestic2 aValidOBWriteDataDomestic2() {
        return (new OBWriteDataDomestic2())
                .consentId(UUID.randomUUID().toString())
                .initiation(aValidOBDomestic2());
    }

    public static OBWriteDataDomesticConsent2 aValidOBWriteDataDomesticConsent2() {
        return (new OBWriteDataDomesticConsent2())
                .initiation(aValidOBDomestic2())
                .authorisation(aValidOBAuthorisation1());
    }

    public static OBWriteDomesticConsent3Data aValidOBWriteDomesticConsent3Data() {
        return (new OBWriteDomesticConsent3Data())
                .initiation(aValidOBWriteDomestic2DataInitiation())
                .authorisation(aValidOBWriteDomesticConsent3DataAuthorisation())
                .scASupportData(aValidOBWriteDomesticConsent3DataSCASupportData());
    }

    public static OBWriteDomesticConsent4Data aValidOBWriteDomesticConsent4Data() {
        return (new OBWriteDomesticConsent4Data())
                .initiation(aValidOBWriteDomestic2DataInitiation())
                .authorisation(aValidOBWriteDomesticConsent4DataAuthorisation())
                .scASupportData(aValidOBWriteDomesticConsent4DataSCASupportData())
                .readRefundAccount(OBWriteDomesticConsent4Data.ReadRefundAccountEnum.NO);
    }

    public static OBDomestic2 aValidOBDomestic2() {
        return (new OBDomestic2())
                .instructionIdentification(INSTRUCTION_IDENTIFICATION)
                .endToEndIdentification(END_TO_END_IDENTIFICATION)
                .localInstrument(LOCAL_INSTRUMENT)
                .instructedAmount(aValidOBActiveOrHistoricCurrencyAndAmount())
                .debtorAccount(aValidOBCashAccount3())
                .creditorAccount(aValidOBCashAccount3())
                .creditorPostalAddress(aValidOBPostalAddress6())
                .remittanceInformation(aValidOBRemittanceInformation1())
                .supplementaryData(new OBSupplementaryData1());
    }

    public static OBWriteDomestic2DataInitiation aValidOBWriteDomestic2DataInitiation() {
        return (new OBWriteDomestic2DataInitiation())
                .instructionIdentification(INSTRUCTION_IDENTIFICATION)
                .endToEndIdentification(END_TO_END_IDENTIFICATION)
                .localInstrument(LOCAL_INSTRUMENT)
                .instructedAmount(aValidOBWriteDomestic2DataInitiationInstructedAmount())
                .debtorAccount(aValidOBWriteDomestic2DataInitiationDebtorAccount())
                .creditorAccount(aValidOBWriteDomestic2DataInitiationCreditorAccount())
                .creditorPostalAddress(aValidOBPostalAddress6())
                .remittanceInformation(aValidOBWriteDomestic2DataInitiationRemittanceInformation())
                .supplementaryData(new OBSupplementaryData1());
    }
}
