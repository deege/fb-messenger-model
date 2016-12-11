
package com.deegeu.facebook.messenger.model.send;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Address {

    @SerializedName("street_1")
    @Expose
    private String street1;
    @SerializedName("street_2")
    @Expose
    private String street2;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("postal_code")
    @Expose
    private String postalCode;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("country")
    @Expose
    private String country;

    /**
     * 
     * @return
     *     The street1
     */
    public String getStreet1() {
        return street1;
    }

    /**
     * 
     * @param street1
     *     The street_1
     */
    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    /**
     * 
     * @return
     *     The street2
     */
    public String getStreet2() {
        return street2;
    }

    /**
     * 
     * @param street2
     *     The street_2
     */
    public void setStreet2(String street2) {
        this.street2 = street2;
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

    /**
     * 
     * @return
     *     The postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * 
     * @param postalCode
     *     The postal_code
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * 
     * @return
     *     The state
     */
    public String getState() {
        return state;
    }

    /**
     * 
     * @param state
     *     The state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 
     * @return
     *     The country
     */
    public String getCountry() {
        return country;
    }

    /**
     * 
     * @param country
     *     The country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(street1).append(street2).append(city).append(postalCode).append(state).append(country).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Address) == false) {
            return false;
        }
        Address rhs = ((Address) other);
        return new EqualsBuilder().append(street1, rhs.street1).append(street2, rhs.street2).append(city, rhs.city).append(postalCode, rhs.postalCode).append(state, rhs.state).append(country, rhs.country).isEquals();
    }

}
