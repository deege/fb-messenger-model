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
final public class FlightInfo {

    @JsonProperty("connection_id")
    @SerializedName("connection_id")
    @Expose
    private String connectionId;
    
    @JsonProperty("segment_id")
    @SerializedName("segment_id")
    @Expose
    private String segmentId;
    
    @JsonProperty("flight_number")
    @SerializedName("flight_number")
    @Expose
    private String flightNumber;
    
    @JsonProperty("aircraft_type")
    @SerializedName("aircraft_type")
    @Expose
    private String aircraftType;
    
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
    
    @JsonProperty("travel_class")
    @SerializedName("travel_class")
    @Expose
    private String travelClass;

    @JsonProperty("connection_id")
    public String getConnectionId() {
        return connectionId;
    }

    @JsonProperty("connection_id")
    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    @JsonProperty("segment_id")
    public String getSegmentId() {
        return segmentId;
    }

    @JsonProperty("segment_id")
    public void setSegmentId(String segmentId) {
        this.segmentId = segmentId;
    }

    @JsonProperty("flight_number")
    public String getFlightNumber() {
        return flightNumber;
    }

    @JsonProperty("flight_number")
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    @JsonProperty("aircraft_type")
    public String getAircraftType() {
        return aircraftType;
    }

    @JsonProperty("aircraft_type")
    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
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

    @JsonProperty("travel_class")
    public String getTravelClass() {
        return travelClass;
    }

    @JsonProperty("travel_class")
    public void setTravelClass(String travelClass) {
        this.travelClass = travelClass;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(connectionId)
                .append(segmentId)
                .append(flightNumber)
                .append(aircraftType)
                .append(departureAirport)
                .append(arrivalAirport)
                .append(flightSchedule)
                .append(travelClass)
                .toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FlightInfo) == false) {
            return false;
        }
        FlightInfo rhs = ((FlightInfo) other);
        return new EqualsBuilder()
                .append(connectionId, rhs.connectionId)
                .append(segmentId, rhs.segmentId)
                .append(flightNumber, rhs.flightNumber)
                .append(aircraftType, rhs.aircraftType)
                .append(departureAirport, rhs.departureAirport)
                .append(arrivalAirport, rhs.arrivalAirport)
                .append(flightSchedule, rhs.flightSchedule)
                .append(travelClass, rhs.travelClass)
                .isEquals();
    }

}
