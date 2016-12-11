/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deegeu.facebook.messenger.model.send;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class UpdateFlightInfo {

@SerializedName("flight_number")
@Expose
private String flightNumber;
@SerializedName("departure_airport")
@Expose
private DepartureAirport departureAirport;
@SerializedName("arrival_airport")
@Expose
private ArrivalAirport arrivalAirport;
@SerializedName("flight_schedule")
@Expose
private FlightSchedule flightSchedule;

/**
* 
* @return
* The flightNumber
*/
public String getFlightNumber() {
return flightNumber;
}

/**
* 
* @param flightNumber
* The flight_number
*/
public void setFlightNumber(String flightNumber) {
this.flightNumber = flightNumber;
}

/**
* 
* @return
* The departureAirport
*/
public DepartureAirport getDepartureAirport() {
return departureAirport;
}

/**
* 
* @param departureAirport
* The departure_airport
*/
public void setDepartureAirport(DepartureAirport departureAirport) {
this.departureAirport = departureAirport;
}

/**
* 
* @return
* The arrivalAirport
*/
public ArrivalAirport getArrivalAirport() {
return arrivalAirport;
}

/**
* 
* @param arrivalAirport
* The arrival_airport
*/
public void setArrivalAirport(ArrivalAirport arrivalAirport) {
this.arrivalAirport = arrivalAirport;
}

/**
* 
* @return
* The flightSchedule
*/
public FlightSchedule getFlightSchedule() {
return flightSchedule;
}

/**
* 
* @param flightSchedule
* The flight_schedule
*/
public void setFlightSchedule(FlightSchedule flightSchedule) {
this.flightSchedule = flightSchedule;
}

@Override
public String toString() {
return ToStringBuilder.reflectionToString(this);
}

@Override
public int hashCode() {
return new HashCodeBuilder().append(flightNumber).append(departureAirport).append(arrivalAirport).append(flightSchedule).toHashCode();
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
return new EqualsBuilder().append(flightNumber, rhs.flightNumber).append(departureAirport, rhs.departureAirport).append(arrivalAirport, rhs.arrivalAirport).append(flightSchedule, rhs.flightSchedule).isEquals();
}

}
