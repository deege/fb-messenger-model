
package com.deegeu.facebook.messenger.model.send;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class PassengerInfo {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("ticket_number")
    @Expose
    private String ticketNumber;
    @SerializedName("passenger_id")
    @Expose
    private String passengerId;

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The ticketNumber
     */
    public String getTicketNumber() {
        return ticketNumber;
    }

    /**
     * 
     * @param ticketNumber
     *     The ticket_number
     */
    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    /**
     * 
     * @return
     *     The passengerId
     */
    public String getPassengerId() {
        return passengerId;
    }

    /**
     * 
     * @param passengerId
     *     The passenger_id
     */
    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(ticketNumber).append(passengerId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PassengerInfo) == false) {
            return false;
        }
        PassengerInfo rhs = ((PassengerInfo) other);
        return new EqualsBuilder().append(name, rhs.name).append(ticketNumber, rhs.ticketNumber).append(passengerId, rhs.passengerId).isEquals();
    }

}
