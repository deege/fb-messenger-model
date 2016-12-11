
package com.deegeu.facebook.messenger.model.send;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class FlightSchedule {

    @SerializedName("boarding_time")
    @Expose
    private String boardingTime;
    @SerializedName("departure_time")
    @Expose
    private String departureTime;
    @SerializedName("arrival_time")
    @Expose
    private String arrivalTime;

    public String getBoardingTime() {
        return boardingTime;
    }

    public void setBoardingTime(String boardingTime) {
        this.boardingTime = boardingTime;
    }
  
    /**
     * 
     * @return
     *     The departureTime
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * 
     * @param departureTime
     *     The departure_time
     */
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    /**
     * 
     * @return
     *     The arrivalTime
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * 
     * @param arrivalTime
     *     The arrival_time
     */
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(boardingTime)
                .append(departureTime)
                .append(arrivalTime)
                .toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FlightSchedule) == false) {
            return false;
        }
        FlightSchedule rhs = ((FlightSchedule) other);
        return new EqualsBuilder()
                .append(boardingTime, rhs.boardingTime)
                .append(departureTime, rhs.departureTime)
                .append(arrivalTime, rhs.arrivalTime)
                .isEquals();
    }

}
