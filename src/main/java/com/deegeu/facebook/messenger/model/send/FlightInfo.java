
package com.deegeu.facebook.messenger.model.send;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class FlightInfo {

    @SerializedName("connection_id")
    @Expose
    private String connectionId;
    @SerializedName("segment_id")
    @Expose
    private String segmentId;
    @SerializedName("flight_number")
    @Expose
    private String flightNumber;
    @SerializedName("aircraft_type")
    @Expose
    private String aircraftType;
    @SerializedName("departure_airport")
    @Expose
    private DepartureAirport departureAirport;
    @SerializedName("arrival_airport")
    @Expose
    private ArrivalAirport arrivalAirport;
    @SerializedName("flight_schedule")
    @Expose
    private FlightSchedule flightSchedule;
    @SerializedName("travel_class")
    @Expose
    private String travelClass;

    /**
     * 
     * @return
     *     The connectionId
     */
    public String getConnectionId() {
        return connectionId;
    }

    /**
     * 
     * @param connectionId
     *     The connection_id
     */
    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * 
     * @return
     *     The segmentId
     */
    public String getSegmentId() {
        return segmentId;
    }

    /**
     * 
     * @param segmentId
     *     The segment_id
     */
    public void setSegmentId(String segmentId) {
        this.segmentId = segmentId;
    }

    /**
     * 
     * @return
     *     The flightNumber
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * 
     * @param flightNumber
     *     The flight_number
     */
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    /**
     * 
     * @return
     *     The aircraftType
     */
    public String getAircraftType() {
        return aircraftType;
    }

    /**
     * 
     * @param aircraftType
     *     The aircraft_type
     */
    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    /**
     * 
     * @return
     *     The departureAirport
     */
    public DepartureAirport getDepartureAirport() {
        return departureAirport;
    }

    /**
     * 
     * @param departureAirport
     *     The departure_airport
     */
    public void setDepartureAirport(DepartureAirport departureAirport) {
        this.departureAirport = departureAirport;
    }

    /**
     * 
     * @return
     *     The arrivalAirport
     */
    public ArrivalAirport getArrivalAirport() {
        return arrivalAirport;
    }

    /**
     * 
     * @param arrivalAirport
     *     The arrival_airport
     */
    public void setArrivalAirport(ArrivalAirport arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    /**
     * 
     * @return
     *     The flightSchedule
     */
    public FlightSchedule getFlightSchedule() {
        return flightSchedule;
    }

    /**
     * 
     * @param flightSchedule
     *     The flight_schedule
     */
    public void setFlightSchedule(FlightSchedule flightSchedule) {
        this.flightSchedule = flightSchedule;
    }

    /**
     * 
     * @return
     *     The travelClass
     */
    public String getTravelClass() {
        return travelClass;
    }

    /**
     * 
     * @param travelClass
     *     The travel_class
     */
    public void setTravelClass(String travelClass) {
        this.travelClass = travelClass;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(connectionId).append(segmentId).append(flightNumber).append(aircraftType).append(departureAirport).append(arrivalAirport).append(flightSchedule).append(travelClass).toHashCode();
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
        return new EqualsBuilder().append(connectionId, rhs.connectionId).append(segmentId, rhs.segmentId).append(flightNumber, rhs.flightNumber).append(aircraftType, rhs.aircraftType).append(departureAirport, rhs.departureAirport).append(arrivalAirport, rhs.arrivalAirport).append(flightSchedule, rhs.flightSchedule).append(travelClass, rhs.travelClass).isEquals();
    }

}