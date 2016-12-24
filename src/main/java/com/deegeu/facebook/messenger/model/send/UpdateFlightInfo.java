/*
 * The MIT License
 *
 * Copyright 2016 DJ Spiess and DeegeU.com.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.deegeu.facebook.messenger.model.send;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
final public class UpdateFlightInfo {

    @JsonProperty("flight_number")
    @SerializedName("flight_number")
    @Expose
    private String flightNumber;
    
    @JsonProperty("departure_airport")
    @SerializedName("departure_airport")
    @Expose
    private DepartureAirport departureAirport;
    
    @JsonProperty("arrival_airport")
    @SerializedName("arrival_airport")
    @Expose
    private ArrivalAirport arrivalAirport;
    
    @JsonProperty("flight_schedule")
    @SerializedName("flight_schedule")
    @Expose
    private FlightSchedule flightSchedule;

    @JsonProperty("flight_number")
    public String getFlightNumber() {
        return flightNumber;
    }

    @JsonProperty("flight_number")
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    @JsonProperty("departure_airport")
    public DepartureAirport getDepartureAirport() {
        return departureAirport;
    }

    @JsonProperty("departure_airport")
    public void setDepartureAirport(DepartureAirport departureAirport) {
        this.departureAirport = departureAirport;
    }

    @JsonProperty("arrival_airport")
    public ArrivalAirport getArrivalAirport() {
        return arrivalAirport;
    }

    @JsonProperty("arrival_airport")
    public void setArrivalAirport(ArrivalAirport arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    @JsonProperty("flight_schedule")
    public FlightSchedule getFlightSchedule() {
        return flightSchedule;
    }

    @JsonProperty("flight_schedule")
    public void setFlightSchedule(FlightSchedule flightSchedule) {
        this.flightSchedule = flightSchedule;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(flightNumber)
                .append(departureAirport)
                .append(arrivalAirport)
                .append(flightSchedule)
                .toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UpdateFlightInfo) == false) {
            return false;
        }
        UpdateFlightInfo rhs = ((UpdateFlightInfo) other);
        return new EqualsBuilder()
                .append(flightNumber, rhs.flightNumber)
                .append(departureAirport, rhs.departureAirport)
                .append(arrivalAirport, rhs.arrivalAirport)
                .append(flightSchedule, rhs.flightSchedule)
                .isEquals();
    }

}
