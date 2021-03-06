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

import uk.org.openbanking.datamodel.payment.OBPriority2Code;
import uk.org.openbanking.datamodel.payment.OBWriteInternational3DataInitiation;
import uk.org.openbanking.datamodel.payment.OBWriteInternationalScheduled3DataInitiation;

public class OBPriorityCodeConverter {

    public static OBPriority2Code toOBPriority2Code(OBWriteInternational3DataInitiation.InstructionPriorityEnum instructionPriority) {
        return instructionPriority == null ? null : OBPriority2Code.valueOf(instructionPriority.name());
    }

    public static OBPriority2Code toOBPriority2Code(OBWriteInternationalScheduled3DataInitiation.InstructionPriorityEnum instructionPriority) {
        return instructionPriority == null ? null : OBPriority2Code.valueOf(instructionPriority.name());
    }

    public static OBWriteInternational3DataInitiation.InstructionPriorityEnum toOBWriteInternational3DataInitiationInstructionPriorityEnum(OBPriority2Code instructionPriority) {
        return instructionPriority == null ? null : OBWriteInternational3DataInitiation.InstructionPriorityEnum.valueOf(instructionPriority.name());
    }

    public static OBWriteInternationalScheduled3DataInitiation.InstructionPriorityEnum toOBWriteInternationalScheduled3DataInitiationInstructionPriorityEnum(OBPriority2Code instructionPriority) {
        return instructionPriority == null ? null : OBWriteInternationalScheduled3DataInitiation.InstructionPriorityEnum.valueOf(instructionPriority.name());
    }

}
