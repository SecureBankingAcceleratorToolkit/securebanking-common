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
 * Aggregated Event Polling API Specification
 * Swagger for Aggregated Event Polling API Specification
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
import java.util.*;

/**
 * OBEventPolling1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-13T15:58:23.513+01:00")
public class OBEventPolling1 {
    @JsonProperty("maxEvents")
    private Integer maxEvents = null;

    @JsonProperty("returnImmediately")
    private Boolean returnImmediately = null;

    @JsonProperty("ack")
    private List<String> ack = null;

    @JsonProperty("setErrs")
    private Map<String, OBEventPolling1SetErrs> setErrs = null;

    public OBEventPolling1 maxEvents(Integer maxEvents) {
        this.maxEvents = maxEvents;
        return this;
    }

    /**
     * Maximum number of events to be returned. A value of zero indicates the ASPSP should not return events even if available
     *
     * @return maxEvents
     **/
    @ApiModelProperty(value = "Maximum number of events to be returned. A value of zero indicates the ASPSP should not return events even if available")
    public Integer getMaxEvents() {
        return maxEvents;
    }

    public void setMaxEvents(Integer maxEvents) {
        this.maxEvents = maxEvents;
    }

    public OBEventPolling1 returnImmediately(Boolean returnImmediately) {
        this.returnImmediately = returnImmediately;
        return this;
    }

    /**
     * Indicates whether an ASPSP should return a response immediately or provide a long poll
     *
     * @return returnImmediately
     **/
    @ApiModelProperty(value = "Indicates whether an ASPSP should return a response immediately or provide a long poll")
    public Boolean isReturnImmediately() {
        return returnImmediately;
    }

    public void setReturnImmediately(Boolean returnImmediately) {
        this.returnImmediately = returnImmediately;
    }

    public OBEventPolling1 ack(List<String> ack) {
        this.ack = ack;
        return this;
    }

    public OBEventPolling1 addAckItem(String ackItem) {
        if (this.ack == null) {
            this.ack = new ArrayList<String>();
        }
        this.ack.add(ackItem);
        return this;
    }

    /**
     * Get ack
     *
     * @return ack
     **/
    @ApiModelProperty(value = "")
    public List<String> getAck() {
        return ack;
    }

    public void setAck(List<String> ack) {
        this.ack = ack;
    }

    public OBEventPolling1 setErrs(Map<String, OBEventPolling1SetErrs> setErrs) {
        this.setErrs = setErrs;
        return this;
    }

    public OBEventPolling1 putSetErrsItem(String key, OBEventPolling1SetErrs setErrsItem) {
        if (this.setErrs == null) {
            this.setErrs = new HashMap<String, OBEventPolling1SetErrs>();
        }
        this.setErrs.put(key, setErrsItem);
        return this;
    }

    /**
     * An object that encapsulates all negative acknowledgements transmitted by the TPP
     *
     * @return setErrs
     **/
    @Valid
    @ApiModelProperty(value = "An object that encapsulates all negative acknowledgements transmitted by the TPP")
    public Map<String, OBEventPolling1SetErrs> getSetErrs() {
        return setErrs;
    }

    public void setSetErrs(Map<String, OBEventPolling1SetErrs> setErrs) {
        this.setErrs = setErrs;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OBEventPolling1 obEventPolling1 = (OBEventPolling1) o;
        return Objects.equals(this.maxEvents, obEventPolling1.maxEvents) &&
                Objects.equals(this.returnImmediately, obEventPolling1.returnImmediately) &&
                Objects.equals(this.ack, obEventPolling1.ack) &&
                Objects.equals(this.setErrs, obEventPolling1.setErrs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxEvents, returnImmediately, ack, setErrs);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBEventPolling1 {\n");

        sb.append("    maxEvents: ").append(toIndentedString(maxEvents)).append("\n");
        sb.append("    returnImmediately: ").append(toIndentedString(returnImmediately)).append("\n");
        sb.append("    ack: ").append(toIndentedString(ack)).append("\n");
        sb.append("    setErrs: ").append(toIndentedString(setErrs)).append("\n");
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

