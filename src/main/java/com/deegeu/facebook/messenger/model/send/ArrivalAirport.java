
package com.deegeu.facebook.messenger.model.send;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class ArrivalAirport {

    @SerializedName("airport_code")
    @Expose
    private String airportCode;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("terminal")
    @Expose
    private String terminal;
    @SerializedName("gate")
    @Expose
    private String gate;

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    
    /**
     * 
     * @return
     *     The airportCode
     */
    public String getAirportCode() {
        return airportCode;
    }

    /**
     * 
     * @param airportCode
     *     The airport_code
     */
    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    /**
     * 
     * @return
     *     The city
     */
    public String getCity() {
        return city;
    }

    /**
     * 
     * @param city
     *     The city
     */
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(airportCode).append(city).append(terminal).append(gate).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ArrivalAirport) == false) {
            return false;
        }
        ArrivalAirport rhs = ((ArrivalAirport) other);
        return new EqualsBuilder().append(airportCode, rhs.airportCode).append(city, rhs.city).append(terminal, rhs.terminal).append(gate, rhs.gate).isEquals();
    }

}
