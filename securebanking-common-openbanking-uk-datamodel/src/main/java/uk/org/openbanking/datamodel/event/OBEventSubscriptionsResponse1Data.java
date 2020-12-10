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
 * Event Subscription API Specification - ASPSP Endpoints
 * Swagger for Event Subscription API Specification - ASPSP Endpoints
 *
 * OpenAPI spec version: v3.1.2-RC1
 * Contact: ServiceDesk@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package uk.org.openbanking.datamodel.event;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBEventSubscriptionsResponse1Data
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-25T13:49:38.894+01:00")
public class OBEventSubscriptionsResponse1Data {
    @JsonProperty("EventSubscription")
    private List<OBEventSubscriptionsResponse1DataEventSubscription> eventSubscription = null;

    public OBEventSubscriptionsResponse1Data eventSubscription(List<OBEventSubscriptionsResponse1DataEventSubscription> eventSubscription) {
        this.eventSubscription = eventSubscription;
        return this;
    }

    public OBEventSubscriptionsResponse1Data addEventSubscriptionItem(OBEventSubscriptionsResponse1DataEventSubscription eventSubscriptionItem) {
        if (this.eventSubscription == null) {
            this.eventSubscription = new ArrayList<OBEventSubscriptionsResponse1DataEventSubscription>();
        }
        this.eventSubscription.add(eventSubscriptionItem);
        return this;
    }

    /**
     * Get eventSubscription
     *
     * @return eventSubscription
     **/
    @Valid
    @ApiModelProperty(value = "")
    public List<OBEventSubscriptionsResponse1DataEventSubscription> getEventSubscription() {
        return eventSubscription;
    }

    public void setEventSubscription(List<OBEventSubscriptionsResponse1DataEventSubscription> eventSubscription) {
        this.eventSubscription = eventSubscription;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBEventSubscriptionsResponse1Data obEventSubscriptionsResponse1Data = (OBEventSubscriptionsResponse1Data) o;
        return Objects.equals(this.eventSubscription, obEventSubscriptionsResponse1Data.eventSubscription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventSubscription);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBEventSubscriptionsResponse1Data {\n");

        sb.append("    eventSubscription: ").append(toIndentedString(eventSubscription)).append("\n");
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

